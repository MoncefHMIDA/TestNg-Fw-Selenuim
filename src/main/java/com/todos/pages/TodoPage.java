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
	// "//input[@ng-model= 'newTodo']"
	/*@fidby*/
	@FindBy(how = How.XPATH, using = INPUT_TEXT)
	public static WebElement inputText;
	
	/*Methode*/
	
	public void submitTodo(String todo) { // Methode generic 
		writeText(inputText, todo);
	
		inputText.sendKeys(Keys.ENTER);
	}
	
}
