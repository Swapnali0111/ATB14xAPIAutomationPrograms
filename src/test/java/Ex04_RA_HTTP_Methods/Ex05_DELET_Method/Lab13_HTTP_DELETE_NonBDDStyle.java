package Ex04_RA_HTTP_Methods.Ex05_DELET_Method;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab13_HTTP_DELETE_NonBDDStyle {
    public class APITesting013_DELETE_NONBddStyle {
        //  PUT
        // Pre - Req.
        // token, booking id - A

//    public void get_token(){ }
//    public void get_booking_id(){}


        RequestSpecification r;
        Response response;
        ValidatableResponse vr;


        @Test
        public void test_put_non_bdd() {
            String token = "30ef21f96d4648f";
            String bookingid = "3662";
            // Faker lib
            r = RestAssured.given();
            r.baseUri("https://restful-booker.herokuapp.com");
            r.basePath("/booking/" + bookingid);
            r.contentType(ContentType.JSON);
            r.cookie("token", token);

//        r.auth().digest()
            // r.auth().basic()


            response = r.when().log().all().delete();


            vr = response.then().log().all();
            vr.statusCode(200);
        }
    }
}