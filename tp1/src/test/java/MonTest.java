

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import tp1.Add;
 
// Classe test pour la fonction Add
public class MonTest {
 
  @Test
  public void simpleTest() {
    // Test unitaire de l'addition de deux entier
    Assertions.assertEquals(3, Add.add(1, 2));
  }

  
}