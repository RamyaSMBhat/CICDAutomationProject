package stepDefinations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//@Listeners(com.ActiTime.Generic.ListenerImplementation.class)
public class FlipKarSearch {
	public WebDriver driver;
	@Given("I am in Flipkart home page")
	public void i_am_in_flipkart_home_page() {
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

	@When("I search the product {string}")
	public void i_search_the_product(String string) throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone 15" +Keys.ENTER);
		//driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone 15");
	}

	@When("I click on search button")
	public void i_click_on_search_button() {

	}

	@Then("I should get all the links present in that page and print it on the console")
	public void i_should_get_all_the_links_present_in_that_page_and_print_it_on_the_console() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'iphone 15')]"));
		Thread.sleep(3000);
		int count = allSugg.size();
		System.out.println(count);
		for(WebElement sugg:allSugg) {
			System.out.println(sugg.getText());
			System.out.println("Doing job");
		}
		
		driver.quit();
	}

}



