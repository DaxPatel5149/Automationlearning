package AMCwebsiteTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;


public class Passengersdropdown {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

//implicit wait - 2 seconds time out


    System.setProperty("webdriver.chrome.driver", "C:\\Users\\MTPC-372\\eclipse-workspace\\Amcwebsite\\chromedriver-win132\\chromedriver.exe");  

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://spicejet.com");
driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
Thread.sleep(2000);

/*int i = 1;
while(i <5)

{

driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']//div[1]//div[2]//div[3]")).click();

i++;

} */
System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).getText());

for(int i=1;i<5;i++)

{

driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']//div[1]//div[2]//div[3]")).click();

}


driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73'])[2]")).click();

System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).getText());
}

}

