package com.example;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonNullCheck {

	public static void main(String[] args) {
		
		try {
		JsonParser parser = new JsonParser();
		  JsonElement jsonElement = parser.parse("{\"message\":\"rohan\",\"place\":{\"name\":\"World!\"}}");
		  JsonObject rootObject = jsonElement.getAsJsonObject();
		  
		  if(null != rootObject.get("message"))
		  {
		   System.out.println(rootObject.get("message").isJsonNull());
		    String s = (rootObject.get("message").isJsonNull()
	              ? null
	              :rootObject.get("message").getAsString());
		  
		  System.out.println("Done"+s);
		  }
//		  
//		   String s= (null != rootObject.get("message")
//	              ? rootObject.get("message").getAsString()
//	              : null);
//		//  String message = rootObject.get("message").getAsString(); // get property "message"
//		  JsonObject childObject = rootObject.getAsJsonObject("place"); // get place object
//		  String place = childObject.get("name").getAsString(); // get property "name"
//		  System.out.println(s + " " + place); // print "Hi World!"*/
//		
//		JsonObject obj = new JsonObject();
//		obj.addProperty("name", "7984031");
//    
//		System.out.println(	
//				(null != obj.get("name")
//		        ? obj.get("name").getAsString()
//		        : null)
//			);
    }catch (Exception e) {
		// TODO: handle exception
    	System.out.println(e);
	}
		
	}

}
