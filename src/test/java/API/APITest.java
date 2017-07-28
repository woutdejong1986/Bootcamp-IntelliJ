package API;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class APITest {

//    String driver = "max_verstappen";

    @Test
    public void getAPICall(){
        given().
                when().get("http://ergast.com/api/f1/current/last/results ").
                then().statusCode(200);
    }

    @Test
    public void getVerstappenCall(){
        given().
                when().get("http://ergast.com/api/f1/2016/drivers/max_verstappen/results").
                then().
                statusCode(200).
                body("MRData.RaceTable.@driverId", containsString("max_verstappen"));
    }

    @Test
    public void urlParameter() {
        given().pathParam("season", "2016").
                pathParam("driver", "max_verstappen").
                when().get("http://ergast.com/api/f1/{season}/drivers/{driver}/results").
                then().statusCode(200);
    }

}
