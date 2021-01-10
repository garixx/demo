package com.example.demo;

import io.qameta.allure.Step;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BaseTest {
    protected SoftAssertions softAssert;

    @Step
    @BeforeEach
    public void init() {
        softAssert = new SoftAssertions();
    }

    @Step
    @AfterEach
    public void assertAll() {
        softAssert.assertAll();
    }
}
