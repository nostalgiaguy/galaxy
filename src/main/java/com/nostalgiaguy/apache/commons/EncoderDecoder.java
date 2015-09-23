package com.nostalgiaguy.apache.commons;

import org.apache.commons.codec.binary.Base64;

public class EncoderDecoder {
	/**
	  * @param args
	  */
	 public static void main(String[] args) {
	  
	long startTime=System.currentTimeMillis();
		 
	   String userIDandPassword = "rajani:rajani";
	   byte[] valueEncoded = Base64.encodeBase64(userIDandPassword.getBytes());
	  // Decode data on other side, by processing encoded data
	 // byte[] valueDecoded= Base64.decodeBase64(userIDandPassword.getBytes());
	  
	   
	  byte[] valueDecoded= Base64.decodeBase64(valueEncoded);
	  System.out.println("Encoded  data is " + new String(valueEncoded));
	  System.out.println("Decoded value is " + new String(valueDecoded));

	 // String encodedValue =  new String(valueDecoded);
	 // String[] userName = encodedValue.split(":");
	  String[] userName= new String(valueDecoded).split(":");
	  System.out.println(userName.toString());
	  System.out.println(userName);
	  System.out.println(userName[0]);
	  System.out.println(userName[1]);
	  
	  long endTime= System.currentTimeMillis();
	  
	  System.out.println("time=" +(endTime-startTime));
	 }
}