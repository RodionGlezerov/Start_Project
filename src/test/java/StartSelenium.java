import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StartSelenium {
    WebDriver wd;
    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        //wd.navigate().to();
        wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");
        wd.manage().window().maximize(); //полноэкранный режим
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //ожидание когда все прогрузится

    }
    @Test
    public void findElementByTag(){
        //find element tag
        WebElement element = wd.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        WebElement element1 = wd.findElement(By.tagName("a"));
        System.out.println(element1.getText());

        //find list of elements by tag

        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());

        //find elemet by class name
        WebElement container = wd.findElement(By.className("container"));
        System.out.println(container.getText());

        //find element by id

        wd.findElement(By.id("root"));
        

    }

    @AfterMethod(enabled = true)
    public void tearDown(){
        wd.quit();
    }


}
