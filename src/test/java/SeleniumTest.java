import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//implementing Java, Maven, TestNG alone

public class SeleniumTest {

    @BeforeTest
    void Setup()
    {
        WebDriver driver= new ChromeDriver(); //no need for setproperty to set chroedriverpath since its selenium version is higher than 4.4
        driver.get("https://dotesthere.com/");

    }


}
