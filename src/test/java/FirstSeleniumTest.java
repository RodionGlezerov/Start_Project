import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;
    //before - setUp()
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver" , "/Users/rodionglezerov/Desktop/Tools");
        driver.get("https://www.google.com/");
    }

    //test
    @Test
    public void openGoogleDriver(){
        System.out.println("Site opened!");
    }

    //after - tearDowm()
    @AfterMethod(enabled = false)
    public void tearDowm(){
        driver.quit(); //закрывает браузер
       // driver.close(); // закрывает окно
    }

}
