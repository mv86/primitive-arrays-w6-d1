import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ToppingTest{

  Topping topping;

  @Before
  public void before() {
    topping = new Topping("Cheese", 6);
  }

  @Test
  public void hasName(){
    assertEquals("Cheese", topping.getName());
  }

  @Test
  public void hasStockAvailable(){
    assertEquals(6, topping.getStockCount());
  }

  @Test 
  public void toppingDecreaseWhenUsed(){
    assertEquals(5, topping.useTopping());
  }

}