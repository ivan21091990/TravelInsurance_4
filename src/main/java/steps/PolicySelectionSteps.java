package steps;

import pages.PolicySelectionPage;
import ru.yandex.qatools.allure.annotations.Step;

public class PolicySelectionSteps {

    @Step("Выбор суммы страховой защиты - 'Минимальная'")
    public void stepMinBtnClickable(){
        new PolicySelectionPage().waitMinBtnClickable();
    }

    @Step("выполнено нажатие на кнопку - 'Оформить'")
    public void stepIssueBtn(){
        new PolicySelectionPage().issueBtn.click();
    }
}
