package io.eroshenkoam.allure;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.То;
import cucumber.api.java.ru.Тогда;
import io.qameta.allure.Attachment;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class BasicSteps {

    int a;
    int b;
    int c;
    int sum;

    @Дано("^первое число (\\d+)$")
    public void firstDigit(int digit) throws Throwable {
        a = digit;
    }

    @Дано("^второе число (\\d+)$")
    @И("^second digit (\\d+)$")
    public void secondDigit(int digit) throws Throwable {
        b = digit;
    }

    @Дано("^третье число (\\d+)$")
    public void thirdDigit(int digit) throws Throwable {
        c = digit;
    }

    @Когда("^я их складываю$")
    public void multiply() throws Throwable {
        sum = a + b + c;
    }

    @Тогда("^сумма равна (\\d+)$")
    public void sum(int result) throws Throwable {
        assertEquals(result, sum);
    }

    @Дано("^сломанный сценарий$")
    public void brokenScenario() throws Throwable {
        try {
            Object o = 1;
            String fail = (String) o;
        } catch (Exception e) {
            this.createAttachment(Arrays.toString(e.getStackTrace()));
            throw e;
        }
    }

    @Когда("^отображается отчет$")
    public void seeTheReport() throws Throwable {

    }

    @То("^видно исключение$")
    public void seeAnException() throws Throwable {

    }

    @Attachment()
    private byte[] createAttachment(String att) {
        String content = att;
        return content.getBytes();
    }

}
