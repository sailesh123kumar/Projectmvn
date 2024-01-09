import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoFlipkart {
	
	public static ChromeOptions options=new ChromeOptions();
	
	
	
	public static WebDriver driver = new ChromeDriver(options.addArguments("--remote-allow-origins=*"));
	
	
	public static LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
	public static List<String> stringproduct = new ArrayList<String>();
	public static List<Integer> intproductPrice = new ArrayList<Integer>();
	public static int prodprice;
	public static String key;
	
	public void launchBrowserandgetURL() {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("http://www.flipkart.com");

	}
	
	public void clickOnProposedAutoSugst() throws InterruptedException {
		WebElement closs = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closs.click();

		WebElement searchBox = driver.findElement(By.xpath("//input[contains(@title,', brands and more')]"));
		searchBox.sendKeys(Keys.CLEAR, "mobile phone 5g");

		Thread.sleep(1500);
		// Autosuggestion list handle
		List<WebElement> suggestion = driver.findElements(By.xpath("//li[@class='Y5N33s']"));

		for (WebElement autoSuggestion : suggestion) {

			String text = autoSuggestion.getText();
			System.out.println(text);

			if (text.contains("mobile phone 5g under 15000")) {
				driver.findElement(By.xpath("(//a[@class='_3izBDY'])[3]")).click();
				break;
			}

		}

		int Count_sugst = suggestion.size();
		System.out.println("The Count of auto suggestion is : " + Count_sugst);
		System.out.println("===========Auto suggestion click successful===========");
	}
	
	public void productNamegetText(){
		// product name page
				// List 1 product name
				List<WebElement> product = driver
						.findElements(By.xpath("//div[@class='_2kHMtA']//following::div[@class='_4rR01T']"));

				for (int i = 0; i < product.size(); i++) {
					key = product.get(i).getText();
					stringproduct.add(key);
				}
        		int count_prdctName = product.size();
				System.out.println("The Count of product display is : " + count_prdctName);
				System.out.println("=============The product name getText is successful=============");			
	}
	
	public void productPrice() {
		List<WebElement> productPrice = driver
				.findElements(By.xpath("//div[@class='_2kHMtA']//following::div[@class='_30jeq3 _1_WHN1']"));

		// List 2 integer of price
		for (int i = 0; i < productPrice.size(); i++) {
			String lstprice1 = productPrice.get(i).getText().replaceAll("[^0-9]", "");
			prodprice = Integer.parseInt(lstprice1);	
			intproductPrice.add(prodprice);	
		}
		int Count_allprdctprice = productPrice.size();
		System.out.println("The Count of product price display is : " + Count_allprdctprice);
		System.out.println("*************The Product price convertion to int is successful*************");
	
		
	}
	
	public void createMapforProductandPrice(){
		System.out.println(stringproduct.size());
		for (int i = 0; i < stringproduct.size(); i++) {
			
			map.put(stringproduct.get(i), intproductPrice.get(i));
		
		}
		System.out.print("The map value is: "+map);
	}
	
		public static String highestValueinMap(LinkedHashMap<String, Integer> map) {
		int highestprice = (Collections.max(map.values()));
		for (Map.Entry<String, Integer> productName: map.entrySet()) {
			if(productName.getValue()==highestprice) {
				System.out.println("The highestprice and its produc name is : "+productName.getKey()+" : "+productName.getValue());
			}
			
		}
		return null;
	}
	public static String lowestValueinMap(LinkedHashMap<String, Integer> map) {
		int lowestprice = (Collections.min(map.values()));
		for (Map.Entry<String, Integer> productName: map.entrySet()) {
			if(productName.getValue()==lowestprice) {
				 System.out.println("The lowestprice and its produc name is : "+productName.getKey()+" : "+productName.getValue());
			}
			
		}
		return null;

}
	
	public void close() {
		driver.close();
		System.out.println("Window is closed successfully");
		driver.quit();
		System.out.println("Browser is closed successfully");

	}
	
	public static void main(String[] args) throws InterruptedException {

		DemoFlipkart obj=new DemoFlipkart(); 
		
		obj.launchBrowserandgetURL();
		obj.clickOnProposedAutoSugst();
		obj.productNamegetText();
		obj.productPrice();
		obj.createMapforProductandPrice();
		obj.close();
		
		System.out.println("=====================================");
		System.out.println(highestValueinMap(map));
		System.out.println(lowestValueinMap(map));
		
		
	}
	}
