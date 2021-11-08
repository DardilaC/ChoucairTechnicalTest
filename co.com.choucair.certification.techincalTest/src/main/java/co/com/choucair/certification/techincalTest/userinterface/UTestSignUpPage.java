package co.com.choucair.certification.techincalTest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSignUpPage {
    public static final Target SIGN_BUTTON = Target.the("button that shows the sign up page form")
            .located(By.xpath("//*[contains(text(),'Join Today')]"));
    public static final Target INPUT_FIRST_NAME = Target.the("where the first name is written")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where the last name is written")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where the email is written")
            .located(By.id("email"));
    public static final Target INPUT_BIRTH_MONTH = Target.the("where the month is selected")
            .located(By.id("birthMonth"));
    public static final Target INPUT_BIRTH_DAY = Target.the("where the day is selected")
            .located(By.id("birthDay"));
    public static final Target INPUT_BIRTH_YEAR = Target.the("where the year is selected")
            .located(By.id("birthYear"));
    public static final Target LOCATION_BUTTON = Target.the("button that shows the location section of the form")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
