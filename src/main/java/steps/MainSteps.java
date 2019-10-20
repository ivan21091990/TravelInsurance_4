package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainSteps {

    @Step("выбран пункт меню {0}")
    public void stepSelectMenuItem(String menuItem){
       new MainPage().selectMenuItem(menuItem);
    }

    @Step("выбран пункт меню {0}")
    public void stepSelectInsuranceItem(String menuItem){
        new MainPage().selectInsuranceItem(menuItem);
    }
}
