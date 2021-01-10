package com.example.demo;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.stream.Stream;

public class DemoTest extends BaseTest {

    @Test
    public void test1() {
        softAssert.assertThat(method0()).isEqualTo("3");
    }

    @Test
    public void test2() {
        method1();
        method2();
        method3();
        method4();
        method5();
        method6();
    }

    @Step
    private String computeStatus() {
        System.out.println("-----------------------------");
        return LocalDateTime.now().toString();
    }

    @Step
    private String method0() {
        Optional<String> status = Stream.of("1", "2", "3", "4", "5").filter(it -> it.equals("9")).findFirst();
//        return status.orElseGet(this::computeStatus);
        return status.orElseThrow(ArithmeticException::new);
    }

    @Step("fjdlksjflksdjfds")
    private void method1() {
        softAssert.assertThat("A").isEqualToIgnoringCase("a");
    }

    @Step
    private void method2() {
        softAssert.assertThat("A").isEqualTo("A");
    }

    @Step
    private void method3() {
        softAssert.assertThat("A").isEqualTo("B");
    }

    @Step
    private void method4() {
        softAssert.assertThat("BA").contains("A");
    }

    @Step
    private void method5() {
        softAssert.assertThat("A").isEqualToIgnoringCase("P");
    }

    @Step
    private void method6() {
        softAssert.assertThat("C").isEqualTo(1);
    }
}
