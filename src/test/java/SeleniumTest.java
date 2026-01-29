import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

    WebDriver driver;
    BasePage basePage;

    @BeforeTest
    void LaunchApp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        basePage = new BasePage(driver); // Initialize reusable waits
    }
    @Test
    void EnterLoginDetails() throws InterruptedException {
        basePage.waitForVisibility(By.name("username")).sendKeys("Admin");
        basePage.waitForVisibility(By.name("password")).sendKeys("admin123");
        basePage.waitForClick(By.xpath("//button[@type='submit' and normalize-space()='Login']")).click();
        Thread.sleep(5000);
    }


    @AfterTest
    void CloseApp() {
        driver.quit();
    }
}
