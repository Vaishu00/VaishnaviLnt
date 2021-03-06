package APITesting;
import org.testng.Assert;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.response.Response;



import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.*;

public class GetAPITest {



@SuppressWarnings("static-access")

@Test(enabled = false)

public void get_API() {

RestAssured request = new RestAssured();

Response response = request.get("https://reqres.in/api/users?page=2");

System.out.println(response.getBody().asString());

System.out.println(response.getStatusLine());

System.out.println(response.getStatusCode());

int expStatusCode = 201;

int actStatusCode = response.getStatusCode();

Assert.assertEquals(actStatusCode, expStatusCode);

}



@Test

public void get_API_BDD() {

given()

.get("https://reqres.in/api/users?page=2")

.then()

.statusCode(200)

.body("data.id[0]", equalTo(7))

.body("data.first_name", hasItems("Michael"))

.log().all();

}

}