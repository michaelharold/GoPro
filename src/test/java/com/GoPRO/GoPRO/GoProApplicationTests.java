package com.GoPRO.GoPRO;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // Use H2 DB for tests
class GoProApplicationTests {

    @Test
    void contextLoads() {
        // Test passes if Spring context loads
    }
}