package co.com.choucair.certification.techincalTest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage {
    public static final Target CITY = Target.the("where the city is written")
            .located(By.xpath("//input[@name='city']"));
    public static final Target ZIP_CODE = Target.the("where the zip code is written")
            .located(By.xpath("//input[@name='zip']"));
    public static final Target COUNTRY = Target.the("where the country is written")
            .located(By.xpath("//div[@class='ui-select']"));
    public static final Target DEVICES = Target.the("button that shows the devices section of the form")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
