package files;

public class Payload {
	
	public static String getPayload(String fi_name, String la_name) {
		String Payload=("{\r\n"
				+ "    \"name\": \""+fi_name+"\",\r\n"
				+ "    \"job\": \""+la_name+"\"\r\n"
				+ "}");
	return Payload;
	}
}
