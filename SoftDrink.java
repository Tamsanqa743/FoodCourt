public class SoftDrink extends Menu{
 /**
  *soft drink class
  *
  *@author Tamsanqa Thwala
  *@version 27/10/2020
  */
  
  private String flavour;
  private String bottleOrCan;
  
  /**
   *construct soft drink object
   */
  public SoftDrink(int itemNum, String size, String flavour, String bottleOrCan){
      super(itemNum, size);
      this.flavour = flavour;
      this.bottleOrCan = bottleOrCan;
  }
  
  public String toString(){
      return "Soft Drink: " + super.toString() +", "+ flavour+", " +bottleOrCan;
  }
}