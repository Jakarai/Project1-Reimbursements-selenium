import POM.LoginPOM;
import POM.ReimbursementsPOM;
import POM.SignUpPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/jakarai/Desktop/selenium/chromedriver");
        // driver
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:9000/index.html");
//        driver.get("http://localhost:9000/pages/reimuresmentList/reimbursementList.html");

        LoginPOM loginPOM = new LoginPOM(driver);
        SignUpPOM signUpPOM = new SignUpPOM(driver);
        ReimbursementsPOM reimbursementsPOM = new ReimbursementsPOM(driver);

//
//

//        signUpPOM.userSignUp();
//        loginPOM.userLogin();
//        loginPOM.adminLogin();
//        reimbursementsPOM.creatReimb();
//        reimbursementsPOM.viewReimb();
//        reimbursementsPOM.approveReimb();
//        reimbursementsPOM.denyReimb();
//        reimbursementsPOM.filterReimb();

//        signUpPOM.userSignUp();


//        Thread.sleep(15000);
//        reimbursementsPOM.filterReimb();

    }
}
