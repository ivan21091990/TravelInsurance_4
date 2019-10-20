package steps;

import pages.TravelInsurancePage;
import ru.yandex.qatools.allure.annotations.Step;

public class TravelInsuranceSteps {

    @Step("Выбор варианта страхования путешественников - 'Оформить онлайн'")
    public void stepSendAppBtn(){
        new TravelInsurancePage().waitSendAppClickable();
    }

    @Step("выполнено нажатие на картинку - 'Оформить онлайн'")
    public void stepArrangeOnlineBtn(){
        new TravelInsurancePage().arrangeOnlineBtn.click();
    }
}
