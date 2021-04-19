import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sky\\IdeaProjects\\FirstTest\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        String searchFieldXpath ="//input[@title='Поиск']";
        WebElement serchElement = driver.findElement(By.xpath(searchFieldXpath));
        serchElement.sendKeys("softserve it academy");
        serchElement.submit();
        ((ChromeDriver) driver).findElementByXPath("//cite").click();
        driver.quit();
//System.out.println();
    }
}