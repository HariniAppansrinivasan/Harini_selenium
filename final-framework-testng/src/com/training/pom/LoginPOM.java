package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement adminUserName;
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\'content\']/div/div/div/div/div[2]/form/div[3]/button")
	private WebElement adminLoginBtn; 
	
	public void sendAdminUserName(String adminUserName) {
		this.adminUserName.clear();
		this.adminUserName.sendKeys(adminUserName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickAdminLoginBtn() {
		this.adminLoginBtn.click(); 
	}
}
