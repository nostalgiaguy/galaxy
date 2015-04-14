package com.nostalgiaguy.json;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class UnmarshallJson {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper =new ObjectMapper();
		String userDataJSON1 = "{\"userId\":\"100\",\"userName\":{\"firstname\":\"K\""+ ",\"middlename\":\"Siva\",\"lastname\":\"Prasad\"},\"dob\":1300878089906}";
		User userFromJSON = mapper.readValue(userDataJSON1, User.class);
		System.out.println(userFromJSON);
		
		User user = mapper.readValue(new File("user.json"), User.class);
		System.out.println(user);

	}
}
