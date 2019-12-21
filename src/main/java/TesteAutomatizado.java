import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteAutomatizado {

	
	
    public static void main(String[] args) {
    	
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\gcb1119\\Documents\\geckodriver-v0.26.0-win64\\geckodriver.exe");
    	
    	
        //firefox
    	WebDriver driver = new FirefoxDriver();
                
        driver.get("http://www.google.com.br/");
        
        WebElement campoDeTexto = driver.findElement(By.name("q"));
        campoDeTexto.sendKeys("Caelum");        
        campoDeTexto.submit();

      }
}