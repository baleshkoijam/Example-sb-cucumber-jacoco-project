package stepdef;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hello.Data;

public class stepdef {



    @Given("^the url is up and running$")
    public void the_url_is_up_and_running() throws Throwable {
        System.out.println("ok side given12");
    }

    @When("^i invoke the microservice$")
    public void i_invoke_the_microservice() throws Throwable {

        Response response = RestAssured.given().when().get("http://localhost:8080/getperson/");
        String strRes= response.getBody().asString();
        System.out.println("response......" + strRes);
    }

    @Then("^i receive the response sucessfully$")
    public void i_receive_the_response_sucessfully() throws Throwable {


    }
}
