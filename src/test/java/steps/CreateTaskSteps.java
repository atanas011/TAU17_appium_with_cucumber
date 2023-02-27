package steps;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.todo.CreateTask;
import pages.todo.TasksList;

public class CreateTaskSteps extends BaseTest {

    private TasksList list;
    private CreateTask task;

    @Given("Open the app")
    public void openTheApp() {
        setUp();
        list = new TasksList(driver);
        task = new CreateTask(driver);
    }

    @When("Click Add new task")
    public void clickAddNewTask() {
        list.clickAddTaskBtn();
    }

    @And("Enter {string} and {string}")
    public void enterAnd(String title, String text) {
        task.enterTaskTitle(title);
        task.enterTaskText(text);
    }

    @And("Enter task title")
    public void enterTaskTitle() {
        task.enterTaskTitle("Title");
    }

    @And("Enter task text")
    public void enterTaskText() {
        task.enterTaskText("Text");
    }

    @And("Click Save")
    public void clickSave() {
        task.clickSaveBtn();
    }

    @Then("Task added successfully")
    public void taskAddedSuccessfully() {
        driver.hideKeyboard();
        tearDown();
    }
}