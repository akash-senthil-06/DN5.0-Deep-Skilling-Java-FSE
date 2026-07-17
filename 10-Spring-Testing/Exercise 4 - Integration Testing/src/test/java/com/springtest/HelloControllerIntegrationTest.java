package com.springtest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIntegrationTest {
    @Autowired
    private TestRestTemplate restTemplate;
    @Test
    public void testHelloEndpointIntegration() {
        ResponseEntity<String> response = restTemplate.getForEntity("/hello", String.class);
        assertEquals(200, response.getStatusCode().value());
        assertEquals("Integration Testing OK", response.getBody());
    }
}
