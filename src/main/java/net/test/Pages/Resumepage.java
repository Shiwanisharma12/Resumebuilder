package net.test.Pages;
import org.openqa.selenium.WebElement;
import com.typesafe.config.Config;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.test.utilities.ConfigLoader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Resumepage extends PageObject {


    Config config = ConfigLoader.load();

    @FindBy(xpath = "//a[@class='btn btn-google btn-user btn-block']")
    WebElementFacade login;

    @FindBy(xpath = "//input[@type='email']")
    WebElement EMAIL;

    @FindBy(xpath = "//span[text()='Next']")
    WebElementFacade next;

    @FindBy(xpath = "//input[@type='password']")
    WebElementFacade Password;

    public String e_mail;


    public void navigatetourl() {
        openUrl(config.getString("loginTestUrl"));
        getDriver().manage().window().maximize();
    }

    public void loginwithgoogle() {
        waitFor(login).click();
    }

    public void email(String email)
    {
        this.e_mail=email;
//        waitFor(EMAIL).sendKeys(e_mail);
        waitFor(EMAIL).waitUntilVisible().withTimeoutOf(20, TimeUnit.SECONDS).sendKeys(email);

    }

    public void next()
    {
        waitFor(next).click();
        getDriver().quit();

    }

    public void Password()
    {

        waitFor(Password).sendKeys("Lovelyjhansi@123");
        waitFor(next).click();
        waitABit(15000);

    }

    public void windowSwitch()
    {

        ArrayList<String> availableWindows = new ArrayList<String>(getDriver().getWindowHandles());
        if (!availableWindows.isEmpty()) {
            getDriver().switchTo().window(availableWindows.get(1));

        }
    }
}
