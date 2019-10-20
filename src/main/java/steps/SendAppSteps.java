package steps;

import pages.SendAppPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

public class SendAppSteps {

    @Step("поле {0} заполняется значением {1}")
    public void stepFileField(String field, String value){
        new SendAppPage().fillField(field,value);
    }

    @Step("проверка заполнения поля {0} значением {1}")
    public void stepCheckFileField(String value, String fieldName){
        new SendAppPage().checkFillField(fieldName,value);
    }

    @Step("выбрали пол страхователя - Мужской")
    public void stepFloorRadBtn(){
        new SendAppPage().floorRadBtn.click();
    }

    @Step("проверка появления сообщения {0}")
    public void stepCheckFieldErrorMessage(String expectedValue){
        new SendAppPage().checkFieldErrorMessage(expectedValue);
    }

    @Step("заполняются поля: ")
    public  void stepFileFields(HashMap<String,String> fields){
        fields.forEach(this::stepFileField);
    }

    @Step("проверяются поля: ")
    public  void stepCheckFileFields(HashMap<String,String> values){
        values.forEach(this::stepCheckFileField);
    }

    @Step("нажатие на кнопку - 'Продолжить'")
        public void stepSendButton (){
            new SendAppPage().sendButton.click();
    }
}
