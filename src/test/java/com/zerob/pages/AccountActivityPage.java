package com.zerob.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerob.utilities.Driver;

public class AccountActivityPage {
	
	public AccountActivityPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}		
	
	@FindBy(linkText="Account Activity")
	public WebElement accountActivityTab;
	
	@FindBy(className="board-header")
	public WebElement showTransactions;
	
	@FindBy(xpath="//select[@id='aa_accountId']")
	public WebElement dropdownBox;

	@FindBy(xpath="//option[1]")
	public WebElement defaultSavings;
	
	@FindBy(xpath="//option[2]")
	public WebElement checking;

	@FindBy(xpath="//option[3]")
	public WebElement savings;
	
	@FindBy(xpath="//option[4]")
	public WebElement loan;
	
	@FindBy(xpath="//option[5]")
	public WebElement creditCard;
	
	@FindBy(xpath="//option[6]")
	public WebElement brokerage;
	
}

