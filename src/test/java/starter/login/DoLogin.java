package starter.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoLogin implements Task {

private final String username;
private final String password;

public DoLogin(String username, String password){
    this.username = username;
    this.password = password;
}
public static Performable withCredentials(String username, String password){
    return instrumented(DoLogin.class,username,password);
}

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Enter.theValue(username).into(LoginFrom.USERNAME_FIELD),
            Enter.theValue(password).into(LoginFrom.PASSWORD_FIELD),
            Click.on(LoginFrom.LOGIN_BUTTON)
    );

    }
}
