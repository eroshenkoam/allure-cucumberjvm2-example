package io.eroshenkoam.allure;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;

public class DummySteps {
    @Дано("^бутерброд с ([^\"]*)$")
    public void sandwich(String topping) throws Throwable {}

    @Когда("^его роняют$")
    public void drop() throws Throwable {}

    @Тогда("^он падает ([^\"]*) вниз$")
    public void check(String topping) throws Throwable {}
}
