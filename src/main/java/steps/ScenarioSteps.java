package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class ScenarioSteps {
    MainSteps mainSteps =new MainSteps();
    PolicySelectionSteps policySelectionSteps = new PolicySelectionSteps();
    SendAppSteps sendAppSteps = new SendAppSteps();
    TravelInsuranceSteps travelInsuranceSteps = new TravelInsuranceSteps();
    BaseSteps baseSteps = new BaseSteps();

    @When("^выбран пункт меню \"(.*)\"$")
    public  void stepSelectMainMenu(String menuItem){
        mainSteps.stepSelectMenuItem(menuItem);
    }

    @When("^выбран пункт подменю \"(.*)\"$")
    public  void stepSelectInsuranceItem(String menuItem){
        mainSteps.stepSelectInsuranceItem(menuItem);
    }

    @When("^выбрали вариант страхования путешественников - 'Оформить онлайн'")
    public  void stepSendAppBtn(){
        travelInsuranceSteps.stepSendAppBtn();
    }

    @When("^выполнено нажатие на картинку - 'Оформить онлайн'")
    public  void stepArrangeOnlineBtn(){
        travelInsuranceSteps.stepArrangeOnlineBtn();
    }

    @When("^выбрали сумму страховой защиты - 'Минимальная'")
    public  void stepMinBtnClickable(){
        policySelectionSteps.stepMinBtnClickable();
    }

    @When("^выполнено нажатие на кнопку - 'Оформить'")
    public  void stepIssueBtn(){
        policySelectionSteps.stepIssueBtn();
    }

    @When("заполняются поля")
    public  void stepFileFields(DataTable fields){
        fields.asMap(String.class,String.class).forEach(
                (key, value) -> sendAppSteps.stepFileField(key,value));
    }

    @When("проверяются поля")
    public  void stepCheckFileFields(DataTable fields){
        fields.asMap(String.class,String.class).forEach(
                (key, value) -> sendAppSteps.stepCheckFileField(key,value));
    }

    @When("выбрали пол страхователя - Мужской")
    public void stepFloorRadBtn(){
        sendAppSteps.stepFloorRadBtn();
    }

    @When("^выполнено нажатие на кнопку - 'Продолжить'")
    public  void stepSendButton(){
        sendAppSteps.stepSendButton();
    }

    @When("^выполнена проверка появления сообщения\"(.*)\"$")
    public  void stepCheckFieldErrorMessage(String message){
        sendAppSteps.stepCheckFieldErrorMessage(message);
    }

    @When("^выполнен переход на другую вкладку")
    public  void stepTabNavigation(){
        baseSteps.TabNavigation();
    }
}
