
import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.get;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

@SuppressWarnings("unused")
public class Organizations {
	
	Keywords session = new Keywords();

	public  Response getOrganizations( String username, String password ) {
		//RestAssured.defaultParser = Parser.JSON;
		Response response = (Response) given().
				relaxedHTTPSValidation().
				auth().basic(session.getUsername(), session.getPassword())
				.when()
				.get("https://acc.mpp.scania.com/wps/PA_MPP/rest/v1/organizations");
		return response;
	}

	@Test
	public void testRest() throws Exception {

		Response res = getOrganizations(session.getUsername(), session.getPassword());
		res.prettyPeek();
		System.out.println(res.getStatusLine());
		System.out.println(res.asString());
	

	}

}