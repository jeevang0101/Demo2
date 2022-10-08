package files;

import io.restassured.path.json.JsonPath;

public class ReUsableMethods {

	
	public static JsonPath rawToJson(String response)
	{
		JsonPath js1 =new JsonPath(response);
		return js1;
	}
//another change1
//another change2
//feature-6
//feature-6
}
