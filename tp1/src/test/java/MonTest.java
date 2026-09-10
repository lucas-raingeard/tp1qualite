import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import tp1.Sub;
import tp1.Add;
 
// Classe test pour la fonction Add
public class MonTest {
 
  @Test
  public void testSub() {
    Assertions.assertEquals(1,Sub.sub(2,1));
  }
  
  @Test
  public void testAdd() {
    // Test unitaire de l'addition de deux entier
    Assertions.assertEquals(3, Add.add(1, 2));
  }

  
}