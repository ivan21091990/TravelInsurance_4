package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class PolicySelectionPage extends BasePage {

    @FindBy(xpath = "//*[text()='Минимальная']/../..")
    WebElement minBtn;

    @FindBy(xpath = "//span[text()='Оформить']")
    public WebElement issueBtn;

    public PolicySelectionPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
    public void waitMinBtnClickable(){
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(
                BaseSteps.getDriver().findElement(By.xpath("//*[text()='Минимальная']/../..")))).click();
    }

}
