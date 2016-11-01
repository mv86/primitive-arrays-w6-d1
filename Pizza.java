class Pizza{

  private String type;
  private int size;
  private double price;
  private Topping[] toppings;

  public Pizza(String type, int size, double price){
    this.type = type;
    this.size = size;
    this.price = price;
    this.toppings = new Topping[7];
  }

  public String getType(){
    return this.type;
  }

  public int getSize(){
    return this.size;
  }

  public double getPrice(){
    return this.price;
  }

  public int countToppings(){
    int counter = 0;
    for (Topping topping : toppings) {
      if (topping != null) {
        counter++;
      }
    }
    return counter;
  }

  public void addTopping(Topping topping){
    if (noSpaceLeftOnPizza()){
      return;
    }
    int nextEmptyIndex = countToppings();
    toppings[nextEmptyIndex] = topping;
  }

  public void removeTopping(){
    int nextEmptyIndex = countToppings();
    toppings[(nextEmptyIndex - 1)] = null;
  }

  public boolean noSpaceLeftOnPizza(){
    return countToppings() >= toppings.length;
  }

}