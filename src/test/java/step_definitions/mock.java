package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import pages.LoginPage;
import utils.ConfigurationReader;
import utils.Driver;
import utils.Pages;

public class mock {

    @When("go google")
    public void go_google() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Given("I have logged into system asa remmitter")
    public void i_have_logged_into_system_asa_remmitter() {


    }

    @Then("Im ready")
    public void im_ready() {

    }






    @Test
    public void test() {


        // so this is the instance of the page class
        //in order to access to the locater that we stored in the classes
        //we have to create an object of it
        LoginPage lg = new LoginPage();
        lg.demo.click();


        //this pages class is helpful we store the pages instances in pages
        //class so we don't have to create each instance over and over again
        // the methods in the classes are returning the pages
        Pages pg = new Pages();

        pg.login().demo.click();


    }
}
