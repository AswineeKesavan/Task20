package Task20;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args) throws Exception {
		String url = "https://www.demoblaze.com/";// mentioning the URL for opening the browser
		WebDriver driver = new ChromeDriver();// intializing the chromeDriver
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='signin2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("Abipo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("Abip000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("the alert msg is:" + alertText);
		if (alertText.equals("Sign up successful.")) {
			System.out.println("Verify the success message:"+alertText);
		} else {
			System.out.println("Account is already exit:"+alertText);
		}
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.quit();
	}
}
