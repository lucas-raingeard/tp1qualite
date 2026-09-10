package fr.jmdoudoux.dej.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import tp1.Add;
 
public class MonTest {
 
  @Test
  public void simpleTest() {
    assertEquals(3, Add.add(1, 2));
  }

  
}