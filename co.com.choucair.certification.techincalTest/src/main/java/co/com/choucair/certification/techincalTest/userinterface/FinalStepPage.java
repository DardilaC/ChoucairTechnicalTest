package co.com.choucair.certification.techincalTest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalStepPage {
    public static final Target PASSWORD = Target.the("where the password is written")
            .located(By.xpath("//input[@id='password']"));
    public static final Target CONNFIRM_PASSWORD = Target.the("where the password is re-written")
            .located(By.xpath("//input[@id='confirmPassword']"));
    public static final Target CHECK_TOUCOC = Target.the(
            "where we confirm we have readed and accepted the Terms of Use, " +
                    "and the Code of Conduct")
            .located(By.xpath("//input[@name='termOfUse']"));
    public static final Target CHECK_PSP = Target.the(
            "where we confirm we have readed and accepted the Privacy " +
                    "and Security Policies")
            .located(By.xpath("//input[@name='privacySetting']"));
    public static final Target COMPLETE = Target.the("button that when pressed finishes the sign up")
            .located(By.xpath("//a[@ng-click='submitForm(userForm);']"));
}
