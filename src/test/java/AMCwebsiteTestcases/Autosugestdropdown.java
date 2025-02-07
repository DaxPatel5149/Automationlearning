package AMCwebsiteTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugestdropdown {


public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\MTPC-372\\eclipse-workspace\\Amcwebsite\\chromedriver-win132\\chromedriver.exe");  

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.findElement(By.id("autosuggest")).sendKeys("ind");
Thread.sleep(3000);
driver.findElement(By.xpath("(//a[normalize-space()='India'])[1]")).click();
driver.findElement(By.xpath("(//a[normalize-space()='India'])[1]")).click();

    }
}
