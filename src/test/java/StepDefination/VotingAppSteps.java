package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class VotingAppSteps {
	WebDriver driver;
	String tittle;
	@Given("User is in Voting App Page")
	public void user_is_in_voting_app_page() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://20.119.127.144/");
	}

	@When("User get the Title of Page")
	public void user_get_the_title_of_page() {
		tittle=driver.getTitle();
	}

	@Then("The Page tittle should be {string}")
	public void the_page_tittle_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(string,tittle);
	    driver.quit();
	}

	@When("Cats button should be displayed")
	public void cats_button_should_be_displayed() {
		boolean enable=   driver.findElement(By.xpath("//button[contains(@value,'Cats')]")).isEnabled();
		Assert.assertTrue(enable);
	}

	@Then("User click on Cats button")
	public void user_click_on_cats_button() {
		 driver.findElement(By.xpath("//button[contains(@value,'Cats')]")).click();
		 driver.quit();
	}

	@When("Dogs button should be displayed")
	public void dogs_button_should_be_displayed() {
		boolean enable=   driver.findElement(By.xpath("//button[contains(@value,'Dogs')]")).isEnabled();
		Assert.assertTrue(enable);
	}

	@Then("User click on Dogs button")
	public void user_click_on_dogs_button() {
		 driver.findElement(By.xpath("//button[contains(@value,'Dogs')]")).click();
		 driver.quit();
	}

	@When("Reset button should be displayed")
	public void reset_button_should_be_displayed() {
		boolean enable=   driver.findElement(By.xpath("//button[contains(@value,'reset')]")).isEnabled();
		Assert.assertTrue(enable);
	}

	@Then("User click on Reset button")
	public void user_click_on_reset_button() {
		 driver.findElement(By.xpath("//button[contains(@value,'reset')]")).click();
		String result= driver.findElement(By.xpath("//div[@id='results']")).getText();
//		System.out.println(result);
		Assert.assertEquals("Cats - 0 | Dogs - 0", result);
		 driver.quit();
	}
}
