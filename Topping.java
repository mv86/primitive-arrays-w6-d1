class Topping implements Orderable{
  
  private String name;
  private int portionsInStock;

  public Topping(String name, int portionsInStock){
    this.name = name;
    this.portionsInStock = portionsInStock;
  }

  public String getName(){
    return this.name;
  }

  public int getStockCount(){
    return this.portionsInStock;
  }

}