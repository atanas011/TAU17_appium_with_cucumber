package pages.todo;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksList extends PageBase {

    public TasksList(AppiumDriver driver) {
        super(driver);
    }

    @FindBy(id = "fab")
    WebElement addTaskBtn;

    public void clickAddTaskBtn() {
        click(addTaskBtn);
    }
}