package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginPOM {

    WebDriver driver;

    WebElement usernameInputElm;
    WebElement passwordInputElm ;;
    WebElement loginBtn;






    public LoginPOM(WebDriver driver) {
        this.driver = driver;
        this.usernameInputElm = driver.findElement(By.id("username-input"));
        this.passwordInputElm = driver.findElement(By.id("password-input"));
        this.loginBtn = driver.findElement(By.id("loginBtn"));

    }

    public void userLogin() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        usernameInputElm.sendKeys("JPLOYEE");
        passwordInputElm.sendKeys("EMP");
        loginBtn.click();
//        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("logoutBtn"))));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement logoutBtn = driver.findElement(By.id("logoutBtn"));

        Thread.sleep(3000);
        logoutBtn.click();
        Thread.sleep(3000);
        driver.quit();

    }
    public void adminLogin() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        usernameInputElm.sendKeys("JMIN");
        passwordInputElm.sendKeys("ADM");
        loginBtn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement logoutBtn = driver.findElement(By.id("logoutBtn"));

        Thread.sleep(3000);
        logoutBtn.click();
        Thread.sleep(3000);
        driver.quit();

    }

    public void quit() {
        driver.quit();
    }




}
