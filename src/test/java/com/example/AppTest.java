package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    void fail() {
        App app = new App();
        String value = app.callForAction();
        assertThat(value).isEqualTo("Food");
    }

    @Test
    void it_should_not_fail() {
        assertThat(42).isEqualTo(42);
    }
}