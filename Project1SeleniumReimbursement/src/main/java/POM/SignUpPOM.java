package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class SignUpPOM {

    WebDriver driver;

    WebElement usernameInputElm;
    WebElement passwordInputElm ;;
    WebElement loginBtn;
    WebElement signUpBtn;

    public SignUpPOM (WebDriver driver) {
        this.driver = driver;
        this.usernameInputElm = driver.findElement(By.id("username-input"));
        this.passwordInputElm = driver.findElement(By.id("password-input"));
        this.loginBtn = driver.findElement(By.id("loginBtn"));
        this.signUpBtn = driver.findElement(By.id("signupBtn"));

    }

    public void userSignUp() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        signUpBtn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement username = driver.findElement(By.id("signupUsername"));
        WebElement password = driver.findElement(By.id("signupPassword"));
        WebElement firstName = driver.findElement(By.id("signupFirstName"));
        WebElement lastName = driver.findElement(By.id("signupLastName"));
        WebElement userEmail = driver.findElement(By.id("signupEmail"));
        WebElement submitBtn = driver.findElement(By.id("submitSU"));

        username.sendKeys("Employee1");
        password.sendKeys("password");
        firstName.sendKeys("Emp1");
        lastName.sendKeys("Yee1");
        userEmail.sendKeys("EMP@REV");
        Thread.sleep(3000);
        submitBtn.click();
        Thread.sleep(3000);

        driver.quit();





    }

}
