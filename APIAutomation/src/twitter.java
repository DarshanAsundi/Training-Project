import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import files.Payload;
import files.resources;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.RestAssured;

public class twitter {
	
	String ConsumerKey="BrfL6zNiYBEKMfzczwb025Cdu";
	String ConsumerSecreteKey="gd7N2QYUaV5jr30wCsE6844zBLmlSFU6ThUjjF7ElLZgrR8HeM";
	String Token="3283857336-FAXJZ9t3P01Qq6oE9Dq6RXhECfudxCosSunIVwA";
	String TokenSecret="Jbhgr7cq8y5ckRUbGBU7Os4tOxbvwMEDfVMZAPNYatXvj";

	@Test
	public void getTweet() {
		RestAssured.baseURI="https://api.twitter.com/1.1/statuses/";
		Response res= given().auth().oauth(ConsumerKey, ConsumerSecreteKey, Token, TokenSecret).
		queryParam("count","1")
		.when().get("/home_timeline.json").then().extract().response();
				
		String response =res.asString();
		System.out.println(response);
		JsonPath js=new JsonPath(response);
		String id=js.get("id").toString();
		System.out.println(id);
		String text=js.get("text").toString();
		System.out.println(text);
	}
	
	
	
}
