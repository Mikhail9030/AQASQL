package ru.netology.web.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    private final SelenideElement heading = $("[data-test-id=dashboard]");

    public void dashboardPageIsVisible() {
        heading.shouldBe(Condition.visible);
    }
}
