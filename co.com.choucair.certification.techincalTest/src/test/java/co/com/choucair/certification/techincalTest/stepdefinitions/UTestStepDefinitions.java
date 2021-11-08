package co.com.choucair.certification.techincalTest.stepdefinitions;

import co.com.choucair.certification.techincalTest.tasks.FillForm;
import co.com.choucair.certification.techincalTest.tasks.OpenUp;
import co.com.choucair.certification.techincalTest.tasks.SignUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UTestStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    //wasAbleTo
    @Given("^than Daniel wants to create a new profile on the UTest website$")
    public void thanDanielWantsToCreateANewProfileOnTheUTestWebsite() {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePage());
    }

    //attemptsTo
    @When("^he presses on the Join Today button on the UTest website$")
    public void hePressesOnTheJoinTodayButtonOnTheUTestWebsite() {
        OnStage.theActorCalled("Daniel").attemptsTo((SignUp.onThePage()));
    }

    @Then("^he starts filling the form to create a new profile on the UTest website$")
    public void heStartsFillingTheFormToCreateANewProfileOnTheUTestWebsite() {
        OnStage.theActorCalled("Daniel").attemptsTo((FillForm.onThePage()));
    }

}
