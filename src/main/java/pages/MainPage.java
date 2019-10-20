package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MainPage extends BasePage{

    @FindBy(xpath = "//ul[contains(@class, 'lg-menu__list')]")
    WebElement menuItems;
    @FindBy(xpath = "//div[(@id= 'submenu-5')]//ul[contains(@aria-label, 'Подменю')]")
    WebElement menuInsurance;

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuItem(String itemName){
        menuItems.findElement(By.xpath("//span[(text()='"+itemName+"')]")).click();
    }

    public void selectInsuranceItem(String itemName){
        menuInsurance.findElement(By.xpath("//li[contains(@class,'lg-menu__sub-item')]//a[(text()='"+itemName+"')]")).click();
    }
}
