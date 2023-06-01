package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actTime3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.id("keepLoggedInCheckBox"));
		if(ele.isSelected()) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		if(ele.isSelected()) {
			System.out.println("true");
		}
		else {
			System.out.println("False");
		}
	}

}
