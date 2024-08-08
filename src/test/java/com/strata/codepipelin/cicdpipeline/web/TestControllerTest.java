package com.strata.codepipelin.cicdpipeline.web;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@WebMvcTest(TestController.class)
public class TestControllerTest {

    @Autowired
    private TestController testController;

    @Test
    public void testTestMethod() {
        // Arrange

        // Act
        ResponseEntity<Map<String, String>> response = testController.test();

        // Assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().get("testing")).isEqualTo("up and running");
    }
}
