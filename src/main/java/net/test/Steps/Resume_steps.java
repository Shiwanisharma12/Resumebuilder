package net.test.Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import net.test.Pages.Resumepage;
import cucumber.api.java.en.Given;

public class Resume_steps  extends Resumepage
{

   Resumepage pagess;

    @Given("^user is on resume builder loginpage$")
    public void userIsOnResumeBuilderLoginpage()
    {
        pagess.navigatetourl();
    }

    @When("^user choose login with gmail$")
    public void userChooseLoginWithGmail()
    {
        pagess.loginwithgoogle();

    }


    @And("^user will enter password$")
    public void userWillEnterPassword()
    {
        pagess.Password();

    }

    @And("^enter successive domain \"([^\"]*)\"id$")
    public void enterSuccessiveDomainId(String email)
    {
        pagess.windowSwitch();
        pagess.email(email);
        pagess.next();
        waitABit(5000);


    }

}
