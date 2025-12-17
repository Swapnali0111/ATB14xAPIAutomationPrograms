package Ex04_RA_HTTP_Methods.Ex02_POST_Method;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Lab09_HTTP_POST_BDDStyle {
    @Test
    public void test_POST_AUTH_TOKEN(){

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all()
                .body(payload)


                .when().post()



                .then().log().all().statusCode(200);





    }
}
