package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theDuckDuckGoHomePage() {
        return Task.where("",
                Open.browserOn().the(DuckDuckGoHomePage.class));
    }
}
