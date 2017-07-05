import org.junit.*;
import static org.junit.Assert.*;

public class CubeTest {

  @Test
  public void newCube_instantiatesCorrectly() {
    Rectangle testRectangle = new Rectangle(30, 30);
    Cube testCube = new Cube(testRectangle);
    assertEquals(true, testCube instanceof Cube);
  }

  @Test
  public void newCube_savesRectangleInformation_Rectangle() {
    Rectangle testRectangle = new Rectangle(30, 30);
    Cube testCube = new Cube(testRectangle);
    assertEquals(testRectangle, testCube.getFace());
  }
}
