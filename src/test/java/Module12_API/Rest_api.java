package Module12_API;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Rest_api {

    @Test
    public void apiTest(){
        given()
                .baseUri("https://auto.ria.com")
                .header("User-Agent", "Jmeter")
                .when().get("auto_mitsubishi_lancer_21990745.html")
                .then().statusCode(200);
    }
}
