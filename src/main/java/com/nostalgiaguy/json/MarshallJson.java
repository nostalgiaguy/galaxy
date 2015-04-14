package com.nostalgiaguy.json;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class MarshallJson {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		ObjectMapper mapper =new ObjectMapper();


		UserName userName = new UserName();
		userName.setFirstname("Katamreddy");
		userName.setMiddlename("Siva");
		userName.setLastname("PrasadReddy");

		User user = new User();
		user.setUserId("1");
		user.setUserName(userName);
		user.setDob(new Date());

		Writer strWriter = new StringWriter();
		mapper.writeValue(strWriter, user);
		//mapper.writeValue(new File("user.json"), user);
		String userDataJSON = strWriter.toString();
		System.out.println(userDataJSON);
		
	}

}
