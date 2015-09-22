package com.nostalgiaguy.jms;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class JndiUtil {
 public static Destination getDestination(String requestQueueName) throws NamingException {
  Context jndi = new InitialContext();
  return (Queue) jndi.lookup(requestQueueName);
 }
}