public class ItemDrive {
  public static void main(Double[] args){
    Item myItem = new Item(.50, apple);
    Item myOtherItem = new Item(1.00, apple);

    System.out.println("myItem: " + myItem.getPrice());
    System.out.println("myOtherItem: " + myOtherItem.getPrice());

    myItem.setPrice(1.50);
    myOtherItem.setPrice(2.00);

    System.out.println("myItem: " + myItem.getPrice());
    System.out.println("myOtherItem: " + myOtherItem.getPrice());
  }