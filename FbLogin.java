package org.stepdefinition;

import org.baseclass.BaseClass;
import org.pojo.classes.LoginFB;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass{
	
	LoginFB f;
	@Given("To launch chrome browser and maximize the window")
	public void to_launch_chrome_browser_and_maximize_the_window() {
	   launchChromeBrowser(); 
	   maxWindow();
	}

	@When("To launch the url of FB")
	public void to_launch_the_url_of_FB() {
	    launchUrl("https://www.facebook.com/");
	}

	@When("To pass username in email field")
	public void to_pass_username_in_email_field() {
	  f=new LoginFB();
	  passText("priyaveer24@gmail.com", f.getEmail());
	}

	@When("To  pass password in paasword field")
	public void to_pass_password_in_paasword_field() {
	   passText("Kavipriya24", f.getPassword());
	}

	@When("To click login button")
	public void to_click_login_button() {
	    click(f.getLogin());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	     closeWind();
	}


}
