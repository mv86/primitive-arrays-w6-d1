import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PizzaTest{

  Pizza pizza;
  Topping topping;
  Topping topping2;

  @Before
  public void before() {
    pizza = new Pizza("base", 9, 9.99);
    topping = new Topping("Cheese");
    topping2 = new Topping("Ham");
  }

  @Test
  public void hasType(){
    assertEquals("base", pizza.getType());
  }

  @Test
  public void hasSize(){
    assertEquals(9, pizza.getSize());
  }

  @Test
  public void hasPrice(){
    assertEquals(9.99, pizza.getPrice(), 0.01);
  }

  @Test
  public void noToppingOnPizza(){
    assertEquals(0, pizza.countToppings());
  }

  @Test
  public void toppingAddedToPizza(){
    pizza.addTopping(topping);
    assertEquals(1, pizza.countToppings());
    pizza.addTopping(topping2);
    assertEquals(2, pizza.countToppings());
  }

  @Test
  public void toppingRemovedFromPizza(){
    pizza.addTopping(topping);
    assertEquals(1, pizza.countToppings());
    pizza.removeTopping();
    assertEquals(0, pizza.countToppings());
  }

  @Test
  public void cantAddMoreToppingsThanLimit(){
    for (int i = 0; i < 15 ; i++) {
      pizza.addTopping(topping);
    }
    assertEquals(7, pizza.countToppings());
    assertEquals(true, pizza.noSpaceLeftOnPizza());
  }

  @Test 
  public void removeAllToppingsFromPizza(){
    for (int i = 0; i < 7 ; i++) {
      pizza.addTopping(topping);
    }
    assertEquals(7, pizza.countToppings());
    for (int i = 7; i > 0; i--) {
      pizza.removeTopping();
    }
    assertEquals(0, pizza.countToppings());
  }
}