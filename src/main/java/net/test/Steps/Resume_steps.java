package net.test.Steps;
import net.test.Pages.Resumepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;

public class Resume_steps extends Resumepage {

    Resumepage pagess;


    @Given("^user is on resume builder loginpage$")
    public void userIsOnResumeBuilderLoginpage() {
        pagess.navigatetourl();

    }


    @When("^user choose login with gmail$")
    public void userChooseLoginWithGmail() {
        pagess.loginwithgoogle();
    }


    @And("^user will enter password$")
    public void  userWillEnterPassword() {
        pagess.Password();
        pagess.next();

    }


    @And("^enter successive domain \"([^\"]*)\"id$")
    public void enterSuccessiveDomainId(String emails) {
        pagess.windowSwitch();
        pagess.email(emails);
        pagess.next();


    }

    @Given("^user will click on create resume button$")
    public void userWillClickOnCreateResumeButton() {
        pagess.createResume();

    }

    @When("^user enetr all the field's data in form$")
    public void userEnetrAllTheFieldSDataInForm() {
        pagess.title();
        pagess.headline();
        pagess.phone();
        pagess.totalExperience();
        pagess.linkedIn();
        pagess.github();
        pagess.bitbucket();
        pagess.stackOverflow();
        pagess.hackerRank();
        pagess.technologies();
        pagess.database();
        pagess.frameworks();
        pagess.os();
        pagess.thirdPartylibraries();
        pagess.rewardsAndrecognition();
        pagess.certifications();
        pagess.thoughtLeadership();
        pagess.summary();
    }

    @And("^user will enter first project sections details$")
    public void userWillEnterFirstProjectSectionsDetails() {
        pagess.projectName();
        pagess.projectType();
        pagess.projectDomain();
        pagess.teamSize();
        pagess.projectDatabases();
        pagess.projectFramework();
        pagess.managementTools();
        pagess.duration();
        pagess.modulesDeveloped();
        pagess.extensionsUsed();
        pagess.projectTechnology();
        pagess.projectThirtparty();
        pagess.description();
        pagess.roles();
    }

    @And("^click on submit button$")
    public void clickOnSubmitButton() {
        pagess.submit();
    }

    @Then("^user will land on dashboard and create resume will be shown in first row$")
    public void userWillLandOnDashboardAndCreateResumeWillBeShownInFirstRow() {
        pagess.verifyResume();

    }

    @Given("^User is on create resume page$")
    public void userIsOnCreateResumePage() {
        pagess.createResume();
    }

    @And("^user will enter first half details$")
    public void userWillEnterFirstHalfDetails() {
        pagess.title();
        pagess.headline();
        pagess.phone();
        pagess.totalExperience();
        pagess.linkedIn();
        pagess.github();
        pagess.bitbucket();
        pagess.stackOverflow();
        pagess.hackerRank();
        pagess.technologies();
        pagess.database();
        pagess.frameworks();
        pagess.os();
        pagess.thirdPartylibraries();
        pagess.rewardsAndrecognition();
        pagess.certifications();
        pagess.thoughtLeadership();
        pagess.summary();
    }

    @And("^click on remove button to remove project details part$")
    public void clickOnRemoveButtonToRemoveProjectDetailsPart() {
        pagess.remove();
    }

    @Then("^click on  the submit button$")
    public void clickOnTheSubmitButton() {
        pagess.submit();

    }

    @And("^Verify the error message$")
    public void verifyTheErrorMessage() {
        pagess.warning();
    }


    @And("^user is already on create resume screen and user click on profile icon$")
    public void userIsAlreadyOnCreateResumeScreenAndUserClickOnProfileIcon() {
        pagess.profileicon();
    }

    @And("^click on logut button$")
    public void clickOnLogutButton() {
        pagess.profileicon();
        pagess.logout();

    }


    @Given("^user is on dashboard screen and click logout$")
    public void userIsOnDashboardScreenAndClickLogout() {
        pagess.profileicon();
        pagess.logout();
    }

    @And("^user click on add project button$")
    public void userClickOnAddProjectButton() {
        pagess.addProject();
    }

    @Then("^verify project section has been added by verifying fields$")
    public void verifyProjectSectionHasBeenAddedByVerifyingFields() {
        pagess.verifyProjectsection();
    }


    @And("^user enter \"([^\"]*)\" in the field$")
    public void userEnterInTheField(String phone_no) {
        pagess.Invalidphone(phone_no);
    }


    @And("^user click on submit button$")
    public void userClickOnSubmitButton() {
        pagess.submit();
    }

    @Then("^user wont be able to submit the form and verify client side validation$")
    public void userWontBeAbleToSubmitTheFormAndVerifyClientSideValidation() {
        pagess.verifycss();
    }

    @And("^user enter all the field's data in form excluding phone$")
    public void userEnterAllTheFieldSDataInFormExcludingPhone() {
        pagess.title();
        pagess.headline();
        pagess.totalExperience();
        pagess.linkedIn();
        pagess.github();
        pagess.bitbucket();
        pagess.stackOverflow();
        pagess.hackerRank();
        pagess.technologies();
        pagess.database();
        pagess.frameworks();
        pagess.os();
        pagess.thirdPartylibraries();
        pagess.rewardsAndrecognition();
        pagess.certifications();
        pagess.thoughtLeadership();
        pagess.summary();
    }

    @And("^user verify the edit view and download buttons$")
    public void userVerifyTheEditViewAndDownloadButtons() {
        pagess.view();
        pagess.download();
        pagess.edit();
    }


    @And("^user click on edit button$")
    public void userClickOnEditButton() {
        pagess.editclick();
    }

    @And("^user will redirect to another page where user will verify Submit and submit and view button$")
    public void userWillRedirectToAnotherPageWhereUserWillVerifySubmitAndSubmitAndViewButton() {
        pagess.submitdisplay();
        pagess.submitAndview();
    }

    @And("^user will redirect to another page and user click on submit and view button$")
    public void userWillRedirectToAnotherPageAndUserClickOnSubmitAndViewButton() {
        pagess.submitAndviewclick();
    }

    @Then("^user will be redirected to new page where user will verify download the resume and edit resume button$")
    public void userWillBeRedirectedToNewPageWhereUserWillVerifyDownloadTheResumeAndEditResumeButton() {
        pagess.downloadOneditPage();
        pagess.editOneditPage();
    }


    @And("^user will verify remove and add new button$")
    public void userWillVerifyRemoveAndAddNewButton() {
        pagess.removebtn();
        pagess.addnewbtn();
    }

}
