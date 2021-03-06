package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello-resteasy")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

    @Test
    public void testWithZeroBrain(){
        Assertions.assertEquals("String","String");
    }

    @Test
    public void failTestZeroBrain(){
        Assertions.assertEquals(3,3);
    }

    @Test
    public void failTestZeroBrain2(){
        Assertions.assertEquals(10,10);
    }

    @Test
    public void failTestZeroBrain3(){
        Assertions.assertEquals(15,15);
    }

    @Test
    public void failTestZeroBrain4(){
        Assertions.assertEquals(17,17);
    }

}