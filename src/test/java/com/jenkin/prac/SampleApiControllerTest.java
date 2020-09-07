package com.jenkin.prac;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SampleApiControllerTest {
    @DisplayName("displayName")
    @Test
    void sampleTest() {
        assertThat("sample").isEqualTo("sample");
    }
}