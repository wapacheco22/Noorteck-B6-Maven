package steps;

import io.cucumber.java.en.Given;

public class XYZSmokeStep {

	@Given("User navigates to login page")
	public void user_navigates_to_loginpage() {
		System.out.println("User able to login");
	}

}
