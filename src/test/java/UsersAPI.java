import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

public class UsersAPI {

    @Test
    public void createUser() {
        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParam = new JSONObject();
        requestParam.put("name", "morpheus");
        requestParam.put("job", "leader");
        request.header("Content-type", "application/json");
        request.body(requestParam.toJSONString());
        Response response = request.request(Method.POST, "/api/users");
        response.getBody().prettyPrint();
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 201);
        String nameReturn = response.jsonPath().get("name");
        Assert.assertEquals(nameReturn, "morpheus");
    }
    @Test
    public void deleteUser() {
        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParam = new JSONObject();
        requestParam.put("id", 12);
        request.header("Content-type", "application/json");
        request.body(requestParam.toJSONString());
        Response response = request.request(Method.DELETE, "/api/users");
        response.getBody().prettyPrint();
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 204);
    }

    @Test
    public void getUserByID() {
        given().
            get("https://reqres.in/api/users/12").
            then().
                statusCode(200).
                body("data.first_name", equalTo("Rachel"));
    }

    @Test
    public void updateUser() {
        JSONObject request = new JSONObject();
        request.put("name", "Alexander");
        request.put("job", "AQA");

        given().
                header("Content-type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
        when().
                put("https://reqres.in/api/users/2").
        then().
                statusCode(200).
                body("name", equalTo("Alexander")).
                body("job", equalTo("AQA"));

    }

}