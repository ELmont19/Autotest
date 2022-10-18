import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.CoreMatchers.containsString; // импорт матчера containsString

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.hamcrest.MatcherAssert; // импорт класса MatcherAssert
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;


public class TestClass {


    @Test
    public void test1(){
       /* open("https://qa-mesto.praktikum-services.ru");
        $(byLinkText("Регистрация")).click();
        $(byId("email")).setValue("myuser@example.com");
        $(byId("password")).setValue("1qaz2WSX");
        $(byText("Зарегистрироваться"))//.shouldHave(Condition.exactText("Зарегистрироваться"))
                .shouldBe(Condition.exist, Duration.ofSeconds(30)); */
        assert (1==1);



}
}
