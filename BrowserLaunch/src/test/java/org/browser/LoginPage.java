package org.browser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LaunchBrowser{
	
	
public LoginPage() {
	PageFactory.initElements(driver, this);
	
	
}

   @FindBy(id= "username")
   WebElement userNameTextbox;
   
   @FindBy(id = "password")
   WebElement passwordTextbox;
   
   @FindBy(xpath = "//button[text()='Login']")
   WebElement LoginButton;
   
   public void passValueInUserTextBox(String value) {
	   putValueInTextBox(userNameTextbox, value);
   }
   public void passValueInPassTextBox(String value) {
	   putValueInTextBox(passwordTextbox, value);
   }
   public void clickOnLoginButton() {
	    clickOnElement(LoginButton);
	    
   }
   
   public void loginWithCredentials(String user,  String password) {
	   putValueInTextBox(userNameTextbox, user);
	   putValueInTextBox(passwordTextbox, password);
	   clickOnElement(LoginButton);
   }
	
}
