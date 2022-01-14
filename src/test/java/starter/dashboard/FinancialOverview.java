package starter.dashboard;

import net.serenitybdd.core.annotations.findby.By;

public class FinancialOverview {

    public static org.openqa.selenium.By CREDIT_AVAILABLE = By.xpath("//div[contains(text(), 'Credit Available')]/following-sibling::div[@class='balance-value']");
    public static org.openqa.selenium.By DUE_TODAY = By.xpath("//div[contains(text(), 'Due Today')]/following-sibling::div[@class='balance-value danger']");
    public static org.openqa.selenium.By TOTAL_BALANCE = By.xpath("//div[contains(text(), 'Total Balance')]/following-sibling::div[@class='balance-value']");
    //private containerMenue menu;
}
