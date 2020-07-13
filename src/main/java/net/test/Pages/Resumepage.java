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

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Resumepage extends PageObject {



    Config config = ConfigLoader.load();

   // int time=config.getInt("Element_Load_Time");

    @FindBy(xpath = "//a[@class='btn btn-google btn-user btn-block']")
    WebElementFacade login;

    @FindBy(xpath = "//input[@type='email']")
    WebElementFacade EMAIL;

    @FindBy(xpath = "//span[text()='Next']")
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

    @FindBy(id = "saveAndView")
    WebElementFacade saveandview;

    @FindBy(xpath = "//a[text()='Download This Resume']")
    WebElementFacade downloadresume;

    @FindBy(xpath = "//a[text()='Edit This Resume']")
    WebElementFacade editresume;

//    JavascriptExecutor js = (JavascriptExecutor) getDriver();


    public void navigatetourl() {
        openUrl(config.getString("loginTestUrl"));
        getDriver().manage().window().maximize();

    }


    public void loginwithgoogle() {
        //  js.executeScript("arguments[0].click();", login);

        waitFor(login).waitUntilVisible().withTimeoutOf(120, TimeUnit.SECONDS).click();
    }

    public void email(String emails) {

        waitFor(EMAIL).waitUntilVisible().withTimeoutOf(120, TimeUnit.SECONDS).sendKeys(emails);

    }

    public void next() {
        // js.executeScript("arguments[0].click();", Next);
        waitFor(Next).waitUntilClickable().withTimeoutOf(60, TimeUnit.SECONDS).click();


    }

    public void Password() {

        waitFor(Password).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("Lovelyjhansi@123");

        config.getInt("Element_Load_Time");
    }

    public void windowSwitch() {

//        ArrayList<String> availableWindows = new ArrayList<String>(getDriver().getWindowHandles());
//        if (!availableWindows.isEmpty()) {
//            getDriver().switchTo().window(availableWindows.get(1));
//            getDriver().switchTo().parentFrame();



            Set<String> windows = getDriver().getWindowHandles();
            for (String ws : windows) {
                getDriver().switchTo().window(ws);


            }


        }


//        String Parent=getDriver().getWindowHandle();
//        getDriver().switchTo().window(Parent);
     public void createResume()
     {
         windowSwitch();
         waitABit(10000);
         createResumes.waitUntilEnabled().withTimeoutOf(120, TimeUnit.SECONDS).click();

    }


    public void title() {
        waitFor(Title).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("QUALITY ANALYST");
    }

    public void headline() {
        waitFor(Headline).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("Headlineee");
    }


    public void phone() {
        waitFor(Phone).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("0987654321");
    }


    public void totalExperience() {
        waitFor(totalExperienceInMonths).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("5");
    }


    public void linkedIn() {

        waitFor(LinkedIn).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("https://www.linkedin.com/in/vaishali-jain-8a7854171");


    }

    public void github() {
        waitFor(githublink).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("https://www.linkedin.com/in/vaishali-jain-8a7854171");
    }


    public void bitbucket() {
        waitFor(Bitbucket).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("https://www.linkedin.com/in/vaishali-jain-8a7854171");
    }

    public void stackOverflow() {
        waitFor(stacklink).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("https://www.linkedin.com/in/vaishali-jain-8a7854171");
    }

    public void hackerRank() {
        waitFor(HackerRank).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("https://www.linkedin.com/in/vaishali-jain-8a7854171");

        ((JavascriptExecutor) getDriver()).executeScript(("scroll(0, 500);"));
    }

    public void technologies() {
        waitFor(Technologies).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("c,java,python");
        Technologies.sendKeys(Keys.ENTER);

    }

    public void database() {
        waitFor(Database).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("DATABASE");
        Database.sendKeys(Keys.ENTER);
    }

    public void frameworks() {
        waitFor(Framework).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("FRAMEWORKS");
        Framework.sendKeys(Keys.ENTER);
    }

    public void os() {

        waitFor(OS).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("WINDOWS", "LINUX", "ANDROID");
        OS.sendKeys(Keys.ENTER);

    }

    public void thirdPartylibraries() {
        waitFor(thirdparty).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("third party");
        thirdparty.sendKeys(Keys.ENTER);
    }

    public void rewardsAndrecognition() {
        waitFor(rewards).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("REWARDS");

    }

    public void certifications() {


        waitFor(selectcertificate).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("certifications");
    }


    public void thoughtLeadership() {
        waitFor(leadership).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("Team leader");
    }


    public void summary() {
        waitFor(Summary).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("I have been in successive for last 10 months");
    }



    public void projectName() {
        waitFor(project1).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("Office and dragons");
    }


    public void projectType() {

        WebElement dropdown = getDriver().findElement(By.xpath("(//select[@name='projectType'])[2]"));
        Select select = new Select(dropdown);
        select.selectByIndex(3);
    }

    public void projectDomain() {

        waitFor(domain).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("QUALITY ASSURANCE");
    }

    public void teamSize() {
        waitFor(teamsize1).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("5");
    }

    public void projectDatabases() {

        waitFor(database1).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("DATABASES2");
    }


    public void projectFramework() {
        waitFor(framework1).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("frameworks");
        framework1.sendKeys(Keys.ENTER);

    }


    public void managementTools() {
        waitFor(PMTOOL).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("Management tools");
    }


    public void duration() {
        waitFor(duration).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("10");
    }

    public void modulesDeveloped() {
        waitFor(modules).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("modules");
    }


    public void extensionsUsed() {
        waitFor(extension).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("Extension used");
    }


    public void projectTechnology() {
        waitFor(tech1).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("c,java,python");
        tech1.sendKeys(Keys.ENTER);

    }


    public void projectThirtparty() {
        waitFor(projectthirdparty).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("projectthirdparty");
    }


    public void description() {
        waitFor(descriptions).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("No description for now");
    }


    public void roles() {
        waitFor(roles1).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys("Team lead");
    }

    public void submit() {
        waitFor(Submit).waitUntilVisible().withTimeoutOf(10, TimeUnit.SECONDS).click();

    }

    public void verifyResume() {
        String firstRow = waitFor(firstResume).getText();
        Assert.assertEquals(firstRow, "QUALITY ANALYST");
        System.out.println("Resume verified");
    }

    public void remove() {
        waitFor(remove).waitUntilVisible().withTimeoutOf(10, TimeUnit.SECONDS).click();
        ((JavascriptExecutor) getDriver()).executeScript(("scroll(0, 500);"));


    }

    public void warning() {

        String message = warningerror.getText().trim();
        Assert.assertEquals(message, "Please add at least one project.".trim());
        System.out.println("Verified hint");

    }

    public void profileicon() {
        waitFor(profile).waitUntilVisible().withTimeoutOf(10, TimeUnit.SECONDS).click();
        ;
    }

    public void logout() {
        waitFor(logout).waitUntilVisible().withTimeoutOf(10, TimeUnit.SECONDS).click();


    }


    public void addProject() {
        waitFor(addProject).waitUntilVisible().withTimeoutOf(10, TimeUnit.SECONDS).click();

    }

    public void verifyProjectsection() {
        waitFor(project1).waitUntilPresent().isDisplayed();
        waitFor(projecttype).waitUntilPresent().isDisplayed();
        waitFor(domain).waitUntilPresent().isDisplayed();

    }


    public void Invalidphone(String phone_no) {
        waitFor(Phone).waitUntilVisible().withTimeoutOf(60, TimeUnit.SECONDS).sendKeys(phone_no);

    }

    public void verifycss() {
        String color = waitFor(Phone).getCssValue("color");
        Assert.assertEquals("rgba(110, 112, 126, 1)", color);
        System.out.println("Error color have been verified");
    }

    public void view() {
        waitFor(view).waitUntilVisible().withTimeoutOf(10, TimeUnit.SECONDS).isVisible();

    }


    public void download() {
        waitFor(download).waitUntilVisible().withTimeoutOf(10, TimeUnit.SECONDS).isVisible();

    }

    public void edit() {
        waitFor(edit).waitUntilVisible().withTimeoutOf(10, TimeUnit.SECONDS).isVisible();

    }

    public void editclick() {
        waitFor(edit).waitUntilVisible().withTimeoutOf(10, TimeUnit.SECONDS).click();

    }

    public void submitAndview() {
        waitFor(saveandview).waitUntilVisible().withTimeoutOf(10, TimeUnit.SECONDS).isVisible();

    }

    public void submitdisplay() {
        waitFor(Submit).waitUntilVisible().withTimeoutOf(10, TimeUnit.SECONDS).isVisible();

    }

    public void submitAndviewclick() {
        waitFor(saveandview).waitUntilVisible().withTimeoutOf(10, TimeUnit.SECONDS).click();

    }

    public void downloadOneditPage() {
        waitFor(downloadresume).waitUntilVisible().withTimeoutOf(10, TimeUnit.SECONDS).isVisible();

    }

    public void editOneditPage() {
        waitFor(editresume).waitUntilVisible().withTimeoutOf(10, TimeUnit.SECONDS).isVisible();

    }

    public void removebtn() {
        waitFor(remove).waitUntilVisible().withTimeoutOf(10, TimeUnit.SECONDS).isVisible();

    }

    public void addnewbtn() {
        waitFor(addProject).waitUntilVisible().withTimeoutOf(10, TimeUnit.SECONDS).isVisible();


    }
}
