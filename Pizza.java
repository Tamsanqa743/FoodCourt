public class Pizza extends Menu{
 /**
  *subclass of menu class
  *@author Tamsanqa Thwala
  *@version 27/10/2020
  */
  
  private String base;
  private String extraCheese;
  private String extraGarlic;
  
  public Pizza(int itemNum, String size,String base, String extraCheese, String extraGarlic){
      super(itemNum, size);
      this.base = base;
      this.extraCheese = extraCheese;
      this.extraGarlic = extraGarlic;
  }
  
  public String toString(){
      return "Pizza: " + super.toString() + ", "+base+", "+ extraCheese+", "+extraGarlic;
  }
}