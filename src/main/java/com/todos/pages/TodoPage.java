package com.todos.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todos.utils.BasePage;

public class TodoPage extends BasePage{

	public TodoPage ()  throws IOException  {
		PageFactory.initElements(driver, this);
	}

	/* Locatores */

	final static String INPUT_TEXT = "/html/body/ng-view/section/header/form/input";
	final static String ELEMENT_TODO = "//label[@class='ng-binding']";
	final static String CHECK_BOX = "//input[@type= 'checkbox']";

	/*@fidby*/
	@FindBy(how = How.XPATH, using = INPUT_TEXT)
	public static WebElement inputText;

	@FindBy(how = How.XPATH, using = ELEMENT_TODO)
	public static WebElement elementTodo;

	@FindBy(how = How.XPATH, using = CHECK_BOX)
	public static WebElement checkBox;
	/*Methode*/

	public void submitTodo(String todo) { // Methode generic 
		writeText(inputText, todo);

		inputText.sendKeys(Keys.ENTER);
	}

	public Boolean isElementDisplayed(WebElement element) { //WebElement bech najem na5rej menha kol chay
		Boolean isElementDisplayed = element.isDisplayed();
		return isElementDisplayed;
	}

	public String checkElementContains(WebElement element) {

		String elementTodo = element.getText();
		return elementTodo;

	}

	public Boolean isCheckedBoxSelected(WebElement element)
	{
		Boolean isCheckedBoxSelected = element.isSelected();
		return isCheckedBoxSelected;
	}
}
