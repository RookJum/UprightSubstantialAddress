
public class Item {
  private String apple;
  private double price;

  public Item(double price, String apple){
    this.price = price;
    this.apple = apple;
    this.billNumber = Integer.toString(billNumber);
    billNumber++;
  }
  
  
  //copy constructor, this is used when you want to make a deep copy of an existing object. Basically if you want another listing of the apple prices this would take effect. 
  public Item(Item other){
    this(other.price);
  }
  
  
  //Setter
  public void setPrice(double price){
    this.price = price;
  }
  
  
  //Getter
public double getPrice(){
  return price;
}


/*to string
*returns a string representation of an object.
*Basically going to say that "this is an apple" then proceeds to state the price of said item(which is the apple)
*/
public String toString(){
  String str = "This apple is " + price;

  return str;

}


/*equals method
*Compares two item objects. If the price, the price of the items, are the same then the two Items are equal.
*@param that the object to compare this Item against
*@return true if price are the same, false if otherwise. 
*/ 
public boolean equals(Item that){
  return this.apple.equals(that.apple) && this.price == that.price;
}


}