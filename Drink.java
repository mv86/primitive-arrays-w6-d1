class Drink{

  private String name;
  private double price;
  private int portionsInStock;

  public Drink(String name, double price, int portionsInStock){
    this.name = name;
    this.price = price;
    this.portionsInStock = portionsInStock;
  }

  public String getName(){
    return this.name;
  }

  public double getPrice(){
    return this.price;
  }

  public int getPortionsInStock(){
    return this.portionsInStock;
  }


}
