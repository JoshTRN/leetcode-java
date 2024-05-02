package dev.leetcode.problems;

import org.junit.jupiter.api.Test;

class ProblemsApplicationTests {

  @Test
  void contextLoads() {
    String javaVersion = System.getProperty("java.version");
    String javaHome = System.getProperty("java.home");
    System.out.println("Java Version: " + javaVersion);
    System.out.println("Java HOME: " + javaHome);
  }

}
