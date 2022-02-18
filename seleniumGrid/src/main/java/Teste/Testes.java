package Teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "E:\\selenium grid\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com.br");
	WebElement we = driver.findElement(By.name("q"));
	we.sendKeys("oi");
	//WebElement buscar = driver.findElement(By.name("btnK"));

WebElement searchBox = driver.findElement(By.cssSelector("[name='q']"));
searchBox.sendKeys("Editora Globo");
searchBox.submit();
	}

}
