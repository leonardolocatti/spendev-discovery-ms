package br.com.llocatti.spendev.discovery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DiscoveryApplicationTests {

  @Test
  void contextLoads() {
    Assertions.assertDoesNotThrow(() -> DiscoveryApplication.main(new String[] {}));
  }
}
