public class Item {
  private String apple;
  private double price;

  public Item(double price, String apple){
    this.price = price;
    this.apple = apple;
  }

  public void setPrice(Double price){
    this.price = price;
  }

public double getPrice(){
  return price;
}
}