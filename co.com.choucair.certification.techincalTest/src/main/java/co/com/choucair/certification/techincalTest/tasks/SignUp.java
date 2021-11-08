package co.com.choucair.certification.techincalTest.tasks;

import co.com.choucair.certification.techincalTest.userinterface.UTestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SignUp implements Task {
    public static SignUp onThePage() {

        return Tasks.instrumented(SignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestSignUpPage.SIGN_BUTTON));
    }
}
