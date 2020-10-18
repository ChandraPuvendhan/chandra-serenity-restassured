package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import starter.status.BDDStyledUtils;
import cucumber.api.java.en.And;


public class GETPostsSteps {


	@Given("I perform GET operation for {string}")
    public void iPerformGETOperationFor(String arg0) {
    }
	
	@And("I perform GET for the post number {string}")
    public void iPerformGETForThePostNumber(String placeId) {
		BDDStyledUtils.SimpleGETPost(placeId);
    }
	
	
   
}