import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		println "Iam Given"
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
	}
	
	@When("user enters username and password")
	public void user_enters_username_and_password() {
		println "Iam When"
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), "Admin")
		
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')
		
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		println "Iam And"
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))
	}
	
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		println "Iam Then"
		WebUI.verifyTextPresent('', false)
		
		WebUI.closeBrowser()
		
	}
}
