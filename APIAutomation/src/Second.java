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

public class Second {
	Properties prop=new Properties();
	
	@BeforeTest
	public void getdata() throws IOException {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Qualitest\\eclipse-workspace\\APIAutomation\\src\\files\\data.properties");
		prop.load(fis);
		//prop.getProperty("HOST");
	}
	
	
	
	
	@Test(dataProvider="NameData")
	public void APITest1(String fi_name,String la_name) {
		
		//Step1
		RestAssured.baseURI=prop.getProperty("HOST");
		Response res=given().
		given().
		param("page","2").
		/*body(" ").      */
		when().
		get(resources.resourceData()).
		then().assertThat().statusCode(200).contentType(ContentType.JSON).
		extract().response();
	
		//Step2
		String responseString = res.asString();
		System.out.println(responseString);
		JsonPath js = new JsonPath(responseString);
		String fname =js.get("data[0].first_name");
		System.out.println(fname);
		
		//Step3
		Response res1=given().
		given().
		body(Payload.getPayload(fi_name,la_name)).
		when().
		put(resources.resourcesDataPut()).
		then().assertThat().statusCode(200).extract().response();
		String responseString1=res1.asString();
		System.out.println(responseString1);
		
	}
	@DataProvider(name="NameData")
	public Object[][] getvalues(){
		return new Object[][] {{"darshan","sa"},{"test1","test2"},{"test3","test4"}};
		
	}
}
