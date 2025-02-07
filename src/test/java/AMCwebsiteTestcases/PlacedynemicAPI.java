package AMCwebsiteTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlacedynemicAPI {


public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\MTPC-372\\eclipse-workspace\\Amcwebsite\\chromedriver-win132\\chromedriver.exe");  

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://spicejet.com");
driver.findElement(By.xpath("//input[@value='Delhi (DEL)']")).click();
driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79'][normalize-space()='Agartala']")).click();
driver.findElement(By.xpath("/ b/div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79'][normalize-space()='Bagdogra']")).click();




    }
}

