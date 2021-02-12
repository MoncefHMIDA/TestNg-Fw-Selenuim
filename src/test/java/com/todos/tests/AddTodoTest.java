package com.todos.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;

public class AddTodoTest extends Setup { //extend from setup pour lier entre @before @test et @after

	public AddTodoTest() throws IOException {
		super();
	}
	TodoPage todopage;
	
	@Test (priority =1)
	public void iCanAddTodo() throws IOException {
		
		
		todopage=new TodoPage();
		boolean elementText = todopage.isElementDisplayed(TodoPage.inputText);
		Assert.assertTrue(elementText);
		
	//	Assert.assertFalse(elementText); 
		//voir le traçage de l'execution pour 
		todopage.submitTodo(prop.getProperty("todo1"));
		String element = todopage.checkElementContains(TodoPage.elementTodo);
		Assert.assertTrue(element.contains(prop.getProperty("todo1")));
		boolean checkBox = todopage.isCheckedBoxSelected(TodoPage.checkBox);
		Assert.assertFalse(checkBox);
		
	}

}
