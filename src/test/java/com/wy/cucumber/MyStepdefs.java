package com.wy.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by y136wang on 2016/7/21.
 */
public class MyStepdefs {

    @Given("^My Given$")
    public void myGiven() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Given");
    }

    @And("^My And$")
    public void myAnd() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("And");
    }

    @Then("^My Then$")
    public void myThen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Then");
        throw new Exception("failed!!");
    }

    @Given("^Table Given is ([^\"]*)$")
    public void tableGiven(String give) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Table Given: "+give);
    }

    @And("^Table And is ([^\"]*)$")
    public void tableAnd(String and) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Table And: "+and);
    }

    @Then("^Table Then is ([^\"]*)$")
    public void tableThen(String then) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Table Then: "+then);
    }

}
