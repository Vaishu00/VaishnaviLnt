package APITesting;



import java.util.HashMap;

import java.util.Map;



import org.json.simple.JSONObject;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.*;



public class PostAPITest {



@Test

public void post_API_Users() {

// generating request body through MAP

// Map<String, Object> body = new HashMap<String, Object>();

// body.put("name", "Ajay");

// body.put("job", "Trainer");

// System.out.println(body);

//

// JSONObject newBody = new JSONObject(body);

// System.out.println(newBody);



JSONObject jsonBody = new JSONObject();

jsonBody.put("name", "Shalini");

jsonBody.put("job", "Teacher");

System.out.println(jsonBody);



// now we create the request

given().body(jsonBody).header("content-type", "application/json")

.when().post("https://reqres.in/api/users")

.then().statusCode(201);

}



}
