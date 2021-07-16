package com.mycompany;

import org.jbehave.core.annotations.*;
import org.jbehave.core.model.ExamplesTable;

public class RobustGherkinSteps {


    @Given("a global administrator named \"Greg\"\n" +
            "* a blog named \"Greg's anti-tax rants\"\n" +
            "* a customer named \"Wilson\"")
    public void givenIHaveALicense() {
        int i = 1;
    }

    @Given("the following people exist: $table")
    public void theFollowingPeopleExist(ExamplesTable table) {
        int i = 3;
    }

    @Given("some precondition 1")
    @Alias("some precondition")
    public void givenSomeCondition() {
        int i = 1;
    }

    @When("some action by the actor")
    public void whenSomeActionByTheACtor() {
        int i =3;
    }

    @When("some other action")
    public void givenSomeOtaction() {
        int i = 1;
    }

    @Then("some testable outcome is achieved")
    public void andSomethingElseToCheck() {
        int i = 2;
    }

    @Then("something else we can check happens too")
    public void aaandSomethingElseToCheck() {
        int i = 2;
    }

    @Given("some other precondition with doc string")
    public void someOtherPrecondition() {
        int a =4;
    }

    @When("yet another action")
    public void yetAnotherAction() {
        int i = 5;
    }

    @Then("some testable outcome is achieved\n" +
            "* something else we can check happens too\n" +
            "But I don't see something else")
    public void butIdontSeeSthElse (){
        int b = 3;
    }

    @Given("the cow weighs <weight> kg")
    public void theCowWeighsWeightKg(@Named("weight")String weight) {
        int i =3;
    }

    @When("we calculate the feeding requirements")
    public void weCalcucateTheFeedingRequirements() {
        int k = 1;
    }

    @Then("the energy should be <energy> MJ")
    public void thenTheEnergyShouldBeMJ(@Named("energy")String energy) {
        int k = 1;
    }
}