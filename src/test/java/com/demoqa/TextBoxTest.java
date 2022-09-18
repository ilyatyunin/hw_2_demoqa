package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class TextBoxTest {
    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void fillFormTest() {
        String name = "Egor";

        open("/text-box");
        $("[id=userName]").setValue(name);
        $("#userName").setValue(name);
        $("[id=userEmail]").setValue("Egor@gmail.com");
        $("[id=currentAddress]").setValue("currentAddress");
        $("[id=permanentAddress]").setValue("permanentAddress");
        $("[id=submit]").click();

        $("#output #name").shouldHave(text(name));
        $("#output #email").shouldHave(text("Egor@gmail.com"));
        $("#output #currentAddress").shouldHave(text("currentAddress"));
        $("#output #permanentAddress").shouldHave(text("permanentAddress"));
    }
}
