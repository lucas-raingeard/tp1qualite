
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import tp1.Sub;
 
public class MonTest {
 
  @Test
  public void simpleTest() {

    Assertions.assertEquals(1,Sub.sub(2,1));
  }
}