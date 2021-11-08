package co.com.choucair.certification.techincalTest.tasks;

import co.com.choucair.certification.techincalTest.userinterface.DevicePage;
import co.com.choucair.certification.techincalTest.userinterface.FinalStepPage;
import co.com.choucair.certification.techincalTest.userinterface.LocationPage;
import co.com.choucair.certification.techincalTest.userinterface.UTestSignUpPage;
import co.com.choucair.certification.techincalTest.util.PasswordGenerator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.HttpInput;

public class FillForm implements Task {
    public static FillForm onThePage(){
        return Tasks.instrumented(FillForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String password = PasswordGenerator.generatePassword().toString();

        actor.wasAbleTo(Enter.theValue("Dan").into(UTestSignUpPage.INPUT_FIRST_NAME),
                Enter.theValue("Ardila").into(UTestSignUpPage.INPUT_LAST_NAME),
                Enter.theValue("dardilac@gmail.com").into(UTestSignUpPage.INPUT_EMAIL),
                Click.on(UTestSignUpPage.INPUT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText("November").from("//select[@name='birthMonth']"),
                Click.on(UTestSignUpPage.INPUT_BIRTH_DAY),
                SelectFromOptions.byVisibleText("8").from("//select[@name='birthDay']"),
                Click.on(UTestSignUpPage.INPUT_BIRTH_YEAR),
                SelectFromOptions.byVisibleText("1992").from("//select[@name='birthYear']"),
                Click.on(UTestSignUpPage.LOCATION_BUTTON),
                Enter.theValue("Cartagena").into(LocationPage.CITY),
                Enter.theValue("130011").into(LocationPage.ZIP_CODE),
                //Click.on(LocationPage.COUNTRY)
                //SelectFromOptions.byVisibleText("Colombia").from("//*[contains(text(),'Colombia')]"),
                Click.on(LocationPage.DEVICES),
                Click.on(DevicePage.LAST_STEP_BUTTON),
                Enter.theValue(password).into(FinalStepPage.PASSWORD),
                Enter.theValue(password).into(FinalStepPage.CONNFIRM_PASSWORD),
                Click.on(FinalStepPage.CHECK_TOUCOC),
                Click.on(FinalStepPage.CHECK_PSP),
                Click.on(FinalStepPage.COMPLETE)
        );
    }
}
