package API;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class RestAssured {

    @Test
    public void getAPICall(){
        given().when().get("http://ergast.com/api/f1/current/last/results ").then().statusCode(200);
    }


}
