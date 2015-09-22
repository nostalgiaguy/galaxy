package com.nostalgiaguy.jms;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.NamingException;

public class Requestor {

	private Session session;
	private Destination replyQueue;
	private MessageProducer requestProducer;
	private MessageConsumer replyConsumer;
	private MessageProducer invalidProducer;

	protected Requestor() {
		super();
	}

	public static Requestor newRequestor(Connection connection, String requestQueueName,
		String replyQueueName, String invalidQueueName)
		throws JMSException, NamingException {
			
		Requestor requestor = new Requestor();
		requestor.initialize(connection, requestQueueName, replyQueueName, invalidQueueName);
		return requestor;
	}

	protected void initialize(Connection connection, String requestQueueName,
		String replyQueueName, String invalidQueueName)
		throws NamingException, JMSException {
			
		session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		Destination requestQueue = JndiUtil.getDestination(requestQueueName);
		replyQueue = JndiUtil.getDestination(replyQueueName);
		Destination invalidQueue = JndiUtil.getDestination(invalidQueueName);
		
		requestProducer = session.createProducer(requestQueue);
		replyConsumer = session.createConsumer(replyQueue);
		invalidProducer = session.createProducer(invalidQueue);
	}

	public void send() throws JMSException {
		TextMessage requestMessage = session.createTextMessage();
		requestMessage.setText("Hello world.");
		requestMessage.setJMSReplyTo(replyQueue);
		requestProducer.send(requestMessage);
		System.out.println("Sent request");
		System.out.println("\tTime:       " + System.currentTimeMillis() + " ms");
		System.out.println("\tMessage ID: " + requestMessage.getJMSMessageID());
		System.out.println("\tCorrel. ID: " + requestMessage.getJMSCorrelationID());
		System.out.println("\tReply to:   " + requestMessage.getJMSReplyTo());
		System.out.println("\tContents:   " + requestMessage.getText());
	}

	public void receiveSync() throws JMSException {
		Message msg = replyConsumer.receive();
		if (msg instanceof TextMessage) {
			TextMessage replyMessage = (TextMessage) msg;
			System.out.println("Received reply ");
			System.out.println("\tTime:       " + System.currentTimeMillis() + " ms");
			System.out.println("\tMessage ID: " + replyMessage.getJMSMessageID());
			System.out.println("\tCorrel. ID: " + replyMessage.getJMSCorrelationID());
			System.out.println("\tReply to:   " + replyMessage.getJMSReplyTo());
			System.out.println("\tContents:   " + replyMessage.getText());
		} else {
			System.out.println("Invalid message detected");
			System.out.println("\tType:       " + msg.getClass().getName());
			System.out.println("\tTime:       " + System.currentTimeMillis() + " ms");
			System.out.println("\tMessage ID: " + msg.getJMSMessageID());
			System.out.println("\tCorrel. ID: " + msg.getJMSCorrelationID());
			System.out.println("\tReply to:   " + msg.getJMSReplyTo());

			msg.setJMSCorrelationID(msg.getJMSMessageID());
			invalidProducer.send(msg);

			System.out.println("Sent to invalid message queue");
			System.out.println("\tType:       " + msg.getClass().getName());
			System.out.println("\tTime:       " + System.currentTimeMillis() + " ms");
			System.out.println("\tMessage ID: " + msg.getJMSMessageID());
			System.out.println("\tCorrel. ID: " + msg.getJMSCorrelationID());
			System.out.println("\tReply to:   " + msg.getJMSReplyTo());
		}
	}
}