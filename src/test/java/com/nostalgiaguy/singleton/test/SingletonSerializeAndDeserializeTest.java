package com.nostalgiaguy.singleton.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.nostalgiaguy.singleton.SingletonSerializeAndDeserialize;

public class SingletonSerializeAndDeserializeTest {
	
	static SingletonSerializeAndDeserialize instance1=SingletonSerializeAndDeserialize.getInstance();
	
	public static void main(String args[]){
		try{
			ObjectOutput out=new ObjectOutputStream(new FileOutputStream("filename.ser"));
			out.writeObject(instance1);
			out.close();
			
			instance1.setX(200);
			
			ObjectInput in=new ObjectInputStream(new FileInputStream("filename.ser"));
			SingletonSerializeAndDeserialize instance2=(SingletonSerializeAndDeserialize)in.readObject();
			in.close();
			
			System.out.println(instance1.getX());
			System.out.println(instance2.getX());
		}
		catch (IOException e){
			e.printStackTrace();
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}

}
