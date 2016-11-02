import static org.junit.Assert.assertEquals;
import org.junit.*;

public class DrinkTest {

  Drink drink;

  @Before
  public void before() {
    drink = new Drink("Coke", 1.50, 8);
  }

  @Test
  public void hasName(){
    assertEquals("Coke", drink.getName());
  }

  @Test
  public void hasPrice(){
    assertEquals(1.50, drink.getPrice(), 0.01);
  }

  @Test
  public void hasPortionsInStock(){
    assertEquals(8, drink.getPortionsInStock());
  }

}