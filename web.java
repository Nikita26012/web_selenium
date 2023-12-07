package selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class web {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91917\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
			WebDriver dr=new ChromeDriver();
			dr.get("https://demo.automationtesting.in/Register.html");
			Thread.sleep(3000);
			System.out.println("title of page"+dr.getTitle());
			Actions a=new Actions(dr);
			
			WebElement sw=dr.findElement(By.xpath("//a[text()='SwitchTo']"));
			  a.moveToElement(sw).build().perform();
			Thread.sleep(3000);
			
			WebElement s=dr.findElement(By.xpath("//a[text()='Alters']"));
			a.click(s).build().perform();
			Thread.sleep(3000);
			System.out.println("title of page"+dr.getTitle());
			
			
			WebElement li=dr.findElement(By.partialLinkText("click the button"));
			a.contextClick(li).build().perform();
			Thread.sleep(3000);
			
			//a.dragAndrop(dr.findElement("//h1[text()='']")),dr.findElement(By.xpath("//input"));
			
		}
		
}
