package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReimbursementsPOM {

    WebDriver driver;

//    WebElement logoutBtn;
    WebElement loginBtn;
    WebElement usernameInputElm;
    WebElement passwordInputElm ;;

    By viewSelector = By.className("viewBtn");

    public ReimbursementsPOM (WebDriver driver) {
        this.driver = driver;
        this.loginBtn = driver.findElement(By.id("loginBtn"));
        this.usernameInputElm = driver.findElement(By.id("username-input"));
        this.passwordInputElm = driver.findElement(By.id("password-input"));


    }

    public void creatReimb () throws InterruptedException {


        usernameInputElm.sendKeys("JPLOYEE");
        Thread.sleep(1000);
        passwordInputElm.sendKeys("EMP");
        Thread.sleep(1000);
        loginBtn.click();

        Thread.sleep(1000);


        WebElement createBtn = driver.findElement(By.id("newReimb"));
        createBtn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement reimbAmount = driver.findElement(By.id("inputAmount"));
        WebElement reimbDesc = driver.findElement(By.id("inputDesc"));
//        WebElement reimbType = driver.findElement(By.id("inputType"));
        WebElement submitReimb = driver.findElement(By.id("submitReimb"));

        Select reimbType = new Select(driver.findElement(By.id("inputType")));

        reimbAmount.sendKeys("200");
        reimbDesc.sendKeys("One night hotel.");
        reimbType.selectByIndex(1);
        submitReimb.click();

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        Thread.sleep(3000);
        WebElement logoutBtn = driver.findElement(By.id("logoutBtn"));


        logoutBtn.click();

        driver.quit();

    }

    public void viewReimb() throws InterruptedException {

        usernameInputElm.sendKeys("JPLOYEE");
        Thread.sleep(1000);
        passwordInputElm.sendKeys("EMP");
        Thread.sleep(1000);
        loginBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
         wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(viewSelector, 0));

        WebElement reimb3 = driver.findElement(By.id("reimbId3"));
        reimb3.click();

        Thread.sleep(1000);
        WebElement close = driver.findElement(By.id("closeView"));
        close.click();


        Thread.sleep(3000);
        WebElement logoutBtn = driver.findElement(By.id("logoutBtn"));

        logoutBtn.click();

        driver.quit();


    }

    public void approveReimb() throws InterruptedException {

        usernameInputElm.sendKeys("JMIN");
        Thread.sleep(1000);
        passwordInputElm.sendKeys("ADM");
        Thread.sleep(1000);
        loginBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(viewSelector, 0));

        WebElement reimb3 = driver.findElement(By.id("reimbId3"));
        reimb3.click();
        Thread.sleep(1000);
        WebElement approveBtn = driver.findElement(By.id("approveBtn"));
        approveBtn.click();
        Thread.sleep(3000);
        WebElement logoutBtn = driver.findElement(By.id("logoutBtn"));

        logoutBtn.click();

        driver.quit();

    }

    public void denyReimb() throws InterruptedException {

        usernameInputElm.sendKeys("JMIN");
        Thread.sleep(1000);
        passwordInputElm.sendKeys("ADM");
        Thread.sleep(1000);
        loginBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(viewSelector, 0));

        WebElement reimb3 = driver.findElement(By.id("reimbId9"));
        reimb3.click();
        Thread.sleep(3000);
        WebElement denyBtn = driver.findElement(By.id("denyBtn"));
        denyBtn.click();
        Thread.sleep(3000);
        WebElement logoutBtn = driver.findElement(By.id("logoutBtn"));

        logoutBtn.click();

        driver.quit();
    }

    public void filterReimb() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        usernameInputElm.sendKeys("JMIN");
        Thread.sleep(1000);
        passwordInputElm.sendKeys("ADM");
        Thread.sleep(1000);
        loginBtn.click();

        Thread.sleep(1000);


        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("newReimb")));
        WebElement filterBtn = driver.findElement(By.id("newReimb"));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("newReimb")));

        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("arguments[0].scrollIntoView()", filterBtn);
        jse2.executeScript("arguments[0].click()", filterBtn);



        Thread.sleep(2000);
        WebElement logoutBtn = driver.findElement(By.id("logoutBtn"));

        jse2.executeScript("arguments[0].scrollIntoView()", logoutBtn);
        jse2.executeScript("arguments[0].click()", logoutBtn);
//        logoutBtn.click();

        driver.quit();

    }



}
