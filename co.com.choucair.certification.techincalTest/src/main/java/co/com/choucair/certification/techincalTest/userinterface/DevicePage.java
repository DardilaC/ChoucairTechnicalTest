package co.com.choucair.certification.techincalTest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicePage {
    public static final Target LAST_STEP_BUTTON = Target.the("button that shows the last step section of the form")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
