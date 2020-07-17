package net.test.Pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import com.typesafe.config.Config;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.test.utilities.ConfigLoader;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Resumepage extends PageObject {


    Config config = ConfigLoader.load();

    int wait = Integer.parseInt(config.getString("Element_Load_Time"));


    @FindBy(xpath = "//a[@class='btn btn-google btn-user btn-block']")
    WebElementFacade login;

    @FindBy(xpath = "//input[@type='email']")
    WebElementFacade EMAIL;

    @FindBy(xpath = "//*[@id='identifierNext']/div/button/div[2]")
    WebElementFacade Next;

    @FindBy(xpath = "//input[@type='password']")
    WebElementFacade Password;

    @FindBy(xpath = "//i[@class='fas fa-plus fa-sm text-white-50']")
    WebElementFacade createResumes;

    @FindBy(xpath = "//input[@id='title']")
    WebElementFacade Title;

    @FindBy(xpath = "//input[@id='headline']")
    WebElementFacade Headline;

    @FindBy(xpath = "//input[@id='phone']")
    WebElementFacade Phone;

    @FindBy(xpath = "//input[@id='totalExperienceInMonths']")
    WebElementFacade totalExperienceInMonths;

    @FindBy(xpath = "//input[@id='linkedIn']")
    WebElementFacade LinkedIn;

    @FindBy(xpath = "//input[@id='githublink']")
    WebElementFacade githublink;


    @FindBy(xpath = "//input[@id='bitbucket']")
    WebElementFacade Bitbucket;

    @FindBy(xpath = "//input[@id='stacklink']")
    WebElementFacade stacklink;

    @FindBy(xpath = "//input[@id='hackerRank']")
    WebElementFacade HackerRank;

    @FindBy(xpath = "(//input[@placeholder='Technologies'])[1]")
    WebElementFacade Technologies;

    @FindBy(xpath = "(//input[@placeholder='Database'])[2]")
    WebElementFacade Database;

    @FindBy(xpath = "(//input[@placeholder='Frameworks'])[1]")
    WebElementFacade Framework;


    @FindBy(xpath = "(//input[@placeholder='OS'])[1]")
    WebElementFacade OS;

    @FindBy(xpath = "(//input[@placeholder='Third-Party Libraries '])[1]")
    WebElementFacade thirdparty;

    @FindBy(xpath = "(//input[@placeholder='Rewards & Recognition'])[1]")
    WebElementFacade rewards;

    @FindBy(xpath = "(//input[@placeholder='Enter Certification'])[1]")
    WebElementFacade selectcertificate;

    @FindBy(xpath = "//input[@id='thoughtLeadership']")
    WebElementFacade leadership;

    @FindBy(xpath = "//textarea[@id='summary']")
    WebElementFacade Summary;

    @FindBy(xpath = "//input[@id='projectName_1']")
    WebElementFacade project1;

    @FindBy(xpath = "(//select[@name='projectType'])[2]")
    WebElementFacade projecttype;

    @FindBy(xpath = "//select[@id='projectType_2']")
    WebElementFacade newProjectType;

    @FindBy(xpath = "(//input[@placeholder='Project Domain'])[2]")
    WebElementFacade domain;

    @FindBy(xpath = "//input[@id='teamSize_1']")
    WebElementFacade teamsize1;

    @FindBy(xpath = "//input[@id='database_1']")
    WebElementFacade database1;

    @FindBy(xpath = "//input[@id='framework_1']")
    WebElementFacade framework1;

    @FindBy(xpath = "//input[@id='PMTool_1']")
    WebElementFacade PMTOOL;

    @FindBy(xpath = "(//input[@placeholder='Modules'])[2]")
    WebElementFacade modules;

    @FindBy(xpath = "(//input[@placeholder='Extensions'])[2]")
    WebElementFacade extension;

    @FindBy(xpath = "(//input[@placeholder='Technology'])[2]")
    WebElementFacade tech1;

    @FindBy(xpath = "(//input[@placeholder='Third-Party Libraries'])[2]")
    WebElementFacade projectthirdparty;

    @FindBy(xpath = "//textarea[@id='description_1']")
    WebElementFacade descriptions;

    @FindBy(xpath = "//textarea[@id='roles_1']")
    WebElementFacade roles1;

    @FindBy(id = "submit")
    WebElementFacade Submit;

    @FindBy(id = "durationInMonths_1")
    WebElementFacade duration;

    @FindBy(xpath = "//*[@id='dataTable']/tbody/tr[1]/td[1]")
    WebElementFacade firstResume;

    @FindBy(xpath = "(//button[text()='Remove'])[2]")
    WebElementFacade remove;

    @FindBy(xpath = "//span[text()='Please add at least one project.']")
    WebElementFacade warningerror;

    @FindBy(xpath = "//span[text()='SHIWANI SHARMA']")
    WebElementFacade profile;

    @FindBy(xpath = "//a[@href='/account/logout']")
    WebElementFacade logout;

    @FindBy(xpath = "// button[@id='projectData']")
    WebElementFacade addProject;

    @FindBy(xpath = "(//a[@title='View Resume'])[1]")
    WebElementFacade view;

    @FindBy(xpath = "(//a[@title='Edit Resume'])[1]")
    WebElementFacade edit;

    @FindBy(xpath = "(//a[@title='Download Resume'])[1]")
    WebElementFacade download;

    @FindBy(xpath = "//button[@id='saveAndView']")
    WebElementFacade saveandview;

    @FindBy(xpath = "//a[text()='Download This Resume']")
    WebElementFacade downloadresume;

    @FindBy(xpath = "//a[text()='Edit This Resume']")
    WebElementFacade editresume;


    @FindBy(xpath = "//*[@id='identifierNext']/div/button/div[2]")
    WebElementFacade next;
    final String passwordBtnLocator = "//*[@id='passwordNext']/div/button/div[2]";
    final String popupTExt = "//base[contains(@href,'google')]";
    @FindBy(xpath = passwordBtnLocator)
    WebElementFacade next1;

    @FindBy(xpath = "//input[@id='projectName_2']")
    WebElementFacade newProject;

    @FindBy(xpath = "//input[@id='projectCategory_2']")
    WebElementFacade newDomain;

    @FindBy(xpath = "//*[@id='Users']")
    WebElementFacade userSearch;
    @FindBy(xpath = "(//div[@tabindex='-1'])[1]")
    WebElementFacade selectFromDropdown;
    @FindBy(xpath = "(//div[@tabindex='-1'])[2]")
    WebElementFacade selectFromDropdown1;
    @FindBy(xpath = "//th[@colspan='5']")
    WebElementFacade verifyMessage;
    @FindBy(xpath = "//td[text()='Lead Engineer expertise in web development ']")
    WebElementFacade verifyByTitle1;
    @FindBy(xpath = "//td[text()='Senior Software Engineer Expertise in Web Development']")
    WebElementFacade VerifyByTitle2;
    @FindBy(xpath = "(//i[@class='fas fa-download fa-sm'])[1]")
    WebElementFacade downloadResume;
    @FindBy(xpath = "(//i[@class='fa fa-eye'])[2]")
    WebElementFacade viewResumeFeature;
    @FindBy(xpath = "//a[text()='Download This Resume']")
    WebElementFacade downloadThisResume;
    @FindBy(xpath = "//a[@href='/home/index']")
    WebElementFacade resumeRefreshButton;
    @FindBy(xpath = "//input[@name='Search']")
    WebElementFacade searchByTitle;
    @FindBy(xpath = "(//input[@placeholder='search by technologies...'])[1]")
    WebElementFacade searchByTechnology;
    @FindBy(xpath = "//div[@class='tt-suggestion tt-selectable']")
    WebElementFacade selectFromSuggestions;
    @FindBy(xpath = "//i[@class='fas fa-search fa-sm']")
    WebElementFacade searchIcon;
    @FindBy(xpath = "//td[text()='QUALITY ANALYST1']")
    WebElementFacade technologyTitleVerify;
    @FindBy(xpath = "//img[@class='img-profile rounded-circle']")
    WebElementFacade profileIcon;
    //    @FindBy(xpath = "//a[@href='/account/logout']")
//    WebElementFacade logout;
    @FindBy(xpath = "//*[@id='dataTable']/tbody/tr[1]/td[2]")
    WebElementFacade creationDateVerify;
    @FindBy(xpath = "//*[@id='dataTable']/tbody/tr[1]/td[3]")
    WebElementFacade modifyDate;
    @FindBy(xpath = "(//a[@title='Edit Resume'])[1]")
    WebElementFacade editResume;
    @FindBy(xpath = "//input[@id='firstName']")
    WebElementFacade editFirstName;
    @FindBy(xpath = "//button[@id='submit']")
    WebElementFacade submit;


    public void navigatetourl() {
        waitABit(wait);
        openUrl(config.getString("loginTestUrl"));
        getDriver().manage().window().maximize();

    }


    public void loginwithgoogle() {

        waitFor(login).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).click();


    }

    public void email(String emails) {

        if (EMAIL.isVisible()) {
            waitFor(EMAIL).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys(emails);
            next();
        }


    }

    public void next() {

        next.click();
    }


    public void windowSwitch() {

        Set<String> windows = getDriver().getWindowHandles();
        for (String ws : windows) {
            getDriver().switchTo().window(ws);
        }

    }

    public void createResume() {

        waitFor(createResumes).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).click();

    }


    public void title() {
        waitFor(Title).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("QUALITY ANALYST1");
    }

    public void headline() {
        waitFor(Headline).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("Headlineee");
    }


    public void phone() {
        waitFor(Phone).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("0987654321");
    }


    public void totalExperience() {
        waitFor(totalExperienceInMonths).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("5");
    }


    public void linkedIn() {

        waitFor(LinkedIn).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("https://www.linkedin.com/in/vaishali-jain-8a7854171");


    }

    public void github() {
        waitFor(githublink).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("https://www.linkedin.com/in/vaishali-jain-8a7854171");
    }


    public void bitbucket() {
        waitFor(Bitbucket).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("https://www.linkedin.com/in/vaishali-jain-8a7854171");
    }

    public void stackOverflow() {
        waitFor(stacklink).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("https://www.linkedin.com/in/vaishali-jain-8a7854171");
    }

    public void hackerRank() {
        waitFor(HackerRank).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("https://www.linkedin.com/in/vaishali-jain-8a7854171");

        ((JavascriptExecutor) getDriver()).executeScript(("scroll(0, 500);"));
    }

    public void technologies() {
        waitFor(Technologies).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("c,java,python");
        Technologies.sendKeys(Keys.ENTER);

    }

    public void database() {
        waitFor(Database).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("DATABASE");
        Database.sendKeys(Keys.ENTER);
    }

    public void frameworks() {
        waitFor(Framework).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("FRAMEWORKS");
        Framework.sendKeys(Keys.ENTER);
    }

    public void os() {

        waitFor(OS).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("WINDOWS", "LINUX", "ANDROID");
        OS.sendKeys(Keys.ENTER);

    }

    public void thirdPartylibraries() {
        waitFor(thirdparty).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("third party");
        thirdparty.sendKeys(Keys.ENTER);
    }

    public void rewardsAndrecognition() {
        waitFor(rewards).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("REWARDS");

    }

    public void certifications() {


        waitFor(selectcertificate).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("certifications");
    }


    public void thoughtLeadership() {
        waitFor(leadership).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("Team leader");
    }


    public void summary() {
        waitFor(Summary).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("I have been in successive for last 10 months");
    }


    public void projectName() {
        waitFor(project1).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("Office and dragons");
    }


    public void projectType() {

        WebElement dropdown = getDriver().findElement(By.xpath("(//select[@name='projectType'])[2]"));
        Select select = new Select(dropdown);
        select.selectByIndex(3);
    }

    public void projectDomain() {

        waitFor(domain).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("QUALITY ASSURANCE");
    }

    public void teamSize() {
        waitFor(teamsize1).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("5");
    }

    public void projectDatabases() {

        waitFor(database1).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("DATABASES2");
    }


    public void projectFramework() {
        waitFor(framework1).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("frameworks");
        framework1.sendKeys(Keys.ENTER);

    }


    public void managementTools() {
        waitFor(PMTOOL).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("Management tools");
    }


    public void duration() {
        waitFor(duration).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("10");
    }

    public void modulesDeveloped() {
        waitFor(modules).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("modules");
    }


    public void extensionsUsed() {
        waitFor(extension).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("Extension used");
    }


    public void projectTechnology() {
        waitFor(tech1).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("c,java,python");
        tech1.sendKeys(Keys.ENTER);

    }


    public void projectThirtparty() {
        waitFor(projectthirdparty).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("projectthirdparty");
    }


    public void description() {
        waitFor(descriptions).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("No description for now");
    }


    public void roles() {
        waitFor(roles1).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys("Team lead");
    }

    public void submit()
    {
        waitFor(Submit).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).click();

    }

    public void verifyResume() {
        String firstRow = waitFor(firstResume).getText().trim();
        Assert.assertEquals(firstRow, "QUALITY ANALYST1".trim());
        System.out.println("Resume verified");

    }

    public void remove() {
        waitFor(remove).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).click();
        ((JavascriptExecutor) getDriver()).executeScript(("scroll(0, 500);"));


    }

    public void warning() {

        String message = warningerror.getText().trim();
        Assert.assertEquals(message, "Please add at least one project.".trim());
        System.out.println("Verified hint");

    }

    public void profileicon() throws InterruptedException {

        waitFor(profile).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).click();

    }

    public void logout() {
        waitFor(logout).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).click();
        getDriver().quit();


    }


    public void addProject() {
        waitFor(addProject).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).click();

    }

    public void verifyProjectsection() {

        newProject.waitUntilPresent().isDisplayed();
        waitFor(newProjectType).waitUntilPresent().isDisplayed();
        waitFor(newDomain).waitUntilPresent().isDisplayed();

    }


    public void Invalidphone(String phone_no) {
        waitFor(Phone).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys(phone_no);

    }

    public void verifycss() {
        String color = waitFor(Phone).getCssValue("color");
        Assert.assertEquals("rgba(110, 112, 126, 1)", color);
        System.out.println("Error color have been verified");
    }

    public void view() {
        waitFor(view).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).isVisible();

    }


    public void download() {
        waitFor(download).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).isVisible();

    }

    public void edit() {
        waitFor(edit).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).isVisible();

    }

    public void loader() throws InterruptedException {
        withTimeoutOf(wait, TimeUnit.MILLISECONDS).waitForAbsenceOf(passwordBtnLocator);
        withTimeoutOf(wait, TimeUnit.MILLISECONDS).waitForAbsenceOf(popupTExt);
        Thread.sleep(3000);
    }

    public void editclick() throws InterruptedException {

        loader();
        windowSwitch();
        waitABit(wait);
        waitFor(edit).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).click();

    }

    public void submitAndview() {
        ((JavascriptExecutor) getDriver()).executeScript(("scroll(0, 500);"));
        waitFor(saveandview).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).isVisible();

    }

    public void submitdisplay() {
        waitFor(Submit).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).isVisible();

    }

    public void submitAndviewclick() {
        waitABit(5000);
        waitFor(saveandview).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).click();

    }

    public void downloadOneditPage() {
        waitFor(downloadresume).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).isVisible();

    }

    public void editOneditPage() {
        waitFor(editresume).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).isVisible();

    }

    public void removebtn() {
        waitFor(remove).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).isVisible();

    }

    public void addnewbtn() {
        waitFor(addProject).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).isVisible();


    }


    public void errorOnmendatoryFields() {
        if ((Title.getText().trim().isEmpty())) {

            String color = waitFor(Title).getCssValue("color");
            Assert.assertEquals("rgba(110, 112, 126, 1)", color);

        }
        if ((Headline.getText().trim().isEmpty())) {

            String color = waitFor(Headline).getCssValue("color");
            Assert.assertEquals("rgba(110, 112, 126, 1)", color);

        }
        if ((totalExperienceInMonths.getText().trim().isEmpty())) {

            String color = waitFor(totalExperienceInMonths).getCssValue("color");
            Assert.assertEquals("rgba(110, 112, 126, 1)", color);
        }
        if ((tech1.getText().trim().isEmpty())) {

            String color = waitFor(tech1).getCssValue("color");
            Assert.assertEquals("rgba(0, 0, 0, 1)", color);
        }
        if ((database1.getText().trim().isEmpty())) {

            String color = waitFor(database1).getCssValue("color");
            Assert.assertEquals("rgba(110, 112, 126, 1)",color);
        }
        if ((framework1.getText().trim().isEmpty())) {

            String color = waitFor(framework1).getCssValue("color");
            Assert.assertEquals("rgba(110, 112, 126, 1)", color);
        }
        if ((OS.getText().trim().isEmpty())) {
            String color = waitFor(OS).getCssValue("color");
            Assert.assertEquals("rgba(0, 0, 0, 1)", color);

        }
        if ((Summary.getText().trim().isEmpty())) {

            String color = waitFor(Summary).getCssValue("color");
            Assert.assertEquals("rgba(110, 112, 126, 1)", color);
        }
        if ((project1.getText().trim().isEmpty())) {

            String color = waitFor(project1).getCssValue("color");
            Assert.assertEquals("rgba(110, 112, 126, 1)", color);

        }
        if ((projecttype.getText().trim().isEmpty())) {

            String color = waitFor(projecttype).getCssValue("color");
            Assert.assertEquals("rgba(110, 112, 126, 1)", color);

            System.out.println("projecttype" + color);
        }
        if ((domain.getText().trim().isEmpty())) {

            String color = waitFor(domain).getCssValue("color");
            Assert.assertEquals("rgba(110, 112, 126, 1)", color);

        }
        if ((teamsize1.getText().trim().isEmpty())) {

            String color = waitFor(teamsize1).getCssValue("color");
            Assert.assertEquals("rgba(110, 112, 126, 1)", color);

        }
        if ((PMTOOL.getText().trim().isEmpty())) {

            String color = waitFor(PMTOOL).getCssValue("color");
            Assert.assertEquals("rgba(110, 112, 126, 1)", color);

        }
        if ((duration.getText().trim().isEmpty())) {

            String color = waitFor(duration).getCssValue("color");
            Assert.assertEquals("rgba(110, 112, 126, 1)", color);

        }
        if ((Technologies.getText().trim().isEmpty())) {

            String color = waitFor(Technologies).getCssValue("color");
            Assert.assertEquals("rgba(0, 0, 0, 1)", color);


        }
        if ((descriptions.getText().trim().isEmpty())) {

            String color = waitFor(descriptions).getCssValue("color");
            Assert.assertEquals("rgba(110, 112, 126, 1)", color);
        }

    }

    public void linkedfield(String invalidLink) {
//        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
//                "[a-zA-Z0-9_+&*-]+)*@" +
//                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
//                "A-Z]{2,7}$";
//        System.out.println( emailRegex.matches(invalidLink));
        waitFor(LinkedIn).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys(invalidLink);
        String color = waitFor(LinkedIn).getCssValue("color");
        Assert.assertEquals("rgba(110, 112, 126, 1)", color);
    }


    public void githubfield(String invalidLink) {

        waitFor(githublink).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys(invalidLink);
        String color = waitFor(githublink).getCssValue("color");
        Assert.assertEquals("rgba(110, 112, 126, 1)", color);
    }

    public void bitbucketfield(String invalidLink) {
        waitFor(Bitbucket).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys(invalidLink);
        String color = waitFor(Bitbucket).getCssValue("color");
        Assert.assertEquals("rgba(110, 112, 126, 1)", color);
    }

    public void stackOverflowfield(String invalidLink) {

        waitFor(stacklink).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys(invalidLink);
        String color = waitFor(stacklink).getCssValue("color");
        Assert.assertEquals("rgba(110, 112, 126, 1)", color);
    }

    public void hackerRankfield(String invalidLink) {
        waitFor(HackerRank).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys(invalidLink);
        String color = waitFor(HackerRank).getCssValue("color");
        Assert.assertEquals("rgba(110, 112, 126, 1)", color);
    }

    public void Onlyemail(String email) {
        waitFor(EMAIL).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys(email);
        next();
        getDriver().quit();

    }

    public void password(String PWD) {
        waitFor(Password).waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys(PWD);
        next1.click();
    }

    public void EmailIdInSearchBar(String arg0) throws InterruptedException {
        loader();
        windowSwitch();
        userSearch.withTimeoutOf(wait, TimeUnit.MILLISECONDS).waitUntilVisible().sendKeys(arg0); //For the user who does not have any record.
        selectFromDropdown1.withTimeoutOf(wait, TimeUnit.MILLISECONDS).click();

        if (verifyMessage.isDisplayed()) {
            System.out.println("Message verified.");
        } else
            System.out.println("No message found.");

        userSearch.clear();
        userSearch.withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys(arg0); //For the existing user with resume.
        waitABit(wait);
        selectFromDropdown.waitUntilVisible().withTimeoutOf(wait, TimeUnit.MILLISECONDS).click();
        if (verifyByTitle1.isDisplayed())
            System.out.println("Resume1 Present");
        else
            System.out.println("Resume1 Not Present");
        if (VerifyByTitle2.isDisplayed())
            System.out.println("Resume2 Present");
        else
            System.out.println("Resume2 Not present");
    }

    public void DownloadResume() {
        downloadResume.withTimeoutOf(wait, TimeUnit.MILLISECONDS).click(); //Click on Download Resume button.

    }

    public void ViewResume() {
        windowSwitch();
        viewResumeFeature.withTimeoutOf(wait, TimeUnit.MILLISECONDS).click(); //Click on view resume icon.
        windowSwitch();
        downloadThisResume.withTimeoutOf(wait, TimeUnit.MILLISECONDS).click(); //Click on Download Resume button of view resume page.
        resumeRefreshButton.click(); //Click on the Resumes button from the left navigation bar.
    }

    public void SearchByTitleAndTechnology(String arg0, String arg1, String arg2) {
        userSearch.sendKeys(arg0); //Entering name of the resource in the search bar.
        selectFromDropdown.waitUntilVisible().click(); // Selecting user from dropdown(Whose resume does not exists)
        // config.getString("Element_Load_Time");
        searchByTitle.sendKeys(arg1); //Search resume along with title.
        Actions action = new Actions(getDriver());
        action.sendKeys(Keys.ENTER).build().perform();
        String firstRow = waitFor(verifyByTitle1).getText();
        Assert.assertEquals(firstRow, "Lead Engineer expertise in web development"); //verifying title.
        System.out.println("title verified");
        userSearch.clear();
        searchByTitle.clear();
        searchByTechnology.sendKeys(arg2); //search resume by technologies.
        selectFromSuggestions.click();
        searchIcon.click();
        String row = waitFor(technologyTitleVerify).getText();
        waitABit(wait);
        Assert.assertEquals(row, "QUALITY ANALYST1");
        System.out.println("Technology title verified"); //verifying the resume we get from technology search.
        // config.getString("Element_Load_Time");

    }

    public void Date() {
        String creationDate = waitFor(creationDateVerify).getText();
        Assert.assertEquals(creationDate, "2020/07/17");
        System.out.println("Creation Date verified");
        String modificationDate = waitFor(modifyDate).getText();
        Assert.assertEquals(modificationDate, "2020/07/17");
        System.out.println("Modification Date verified");


    }

    public void EditResume(String arg0) {
        editResume.withTimeoutOf(wait, TimeUnit.MILLISECONDS).click(); //Clicking on edit resume icon.
        waitABit(wait);
        editFirstName.clear(); //clear the already existing name from the text name.
        editFirstName.withTimeoutOf(wait, TimeUnit.MILLISECONDS).sendKeys(arg0); //editing the new name.
        JavascriptExecutor jse = (JavascriptExecutor) getDriver(); //js executor is used for scrolling the window.
        jse.executeScript("window.scrollBy(0,5000)");
        submit.withTimeoutOf(wait, TimeUnit.MILLISECONDS).click();
        waitABit(wait);
        windowSwitch();
        waitABit(wait);

    }
}












