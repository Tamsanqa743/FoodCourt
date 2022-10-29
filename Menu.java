import java.util.*;

public class Menu{
/**
 *stores a menu item
 *
 *@author Tamsanqa Thwala
 *@version 27/10/2020
 */
 
 private int menuItemNum;
 private String size;
 
 /**
  *create a new menu object
  */
  
 public Menu(int itemNum, String size){
     this.menuItemNum = itemNum;
     this.size = size;
 }
 
 /**
  *get item number
  */
  
 public int getItemNum(){
     return menuItemNum;
 }
 /**
  *Subtract one item number in string from another
  */ 
 public static int subtract(String num){
     StringTokenizer intA = new StringTokenizer(num);
     String intB = intA.nextToken("-");
     String intC = intA.nextToken();
     return (Integer.parseInt(intB) - Integer.parseInt(intC));
 }
 
 /**
  *prints the menu item number and the size of the item
  */
 public String toString(){
     return menuItemNum +", " + size;
 }

}