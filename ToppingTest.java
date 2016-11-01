import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ToppingTest{

  Topping topping;

  @Before
  public void before() {
    topping = new Topping("Cheese");
  }

  @Test
  public void hasName(){
    assertEquals("Cheese", topping.getName());
  }

}