package pages.todo;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateTask extends PageBase {

    public CreateTask(AppiumDriver driver) {
        super(driver);
    }

    @FindBy(id = "editTextTitre")
    WebElement taskTitle;

    @FindBy(id = "editTextNote")
    WebElement taskTxt;

    @FindBy(id = "action_save")
    WebElement saveBtn;

    public void enterTaskTitle(String title) {
        clear(taskTitle);
        sendText(taskTitle, title);
    }

    public void enterTaskText(String txt) {
        clear(taskTxt);
        sendText(taskTxt, txt);
    }

    public void clickSaveBtn() {
        click(saveBtn);
    }
}