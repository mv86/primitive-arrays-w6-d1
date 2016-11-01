import java.util.ArrayList;

class Pizza{

  private String type;
  private int size;
  private double price;
  private ArrayList<Orderable> toppings;

  public Pizza(String type, int size, double price){
    this.type = type;
    this.size = size;
    this.price = price;
    this.toppings = new ArrayList<Orderable>();
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
    return this.toppings.size();
  }

  public void addTopping(Orderable topping){
    this.toppings.add(topping);
  }

  public void removeTopping(){
    this.toppings.remove(this.toppings.size() - 1);
  }

}