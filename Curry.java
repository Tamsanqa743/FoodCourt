public class Curry extends Menu{
/**
 *part of menu
 */
 
 private String type;
 
 public Curry(int itemNum, String size, String type){
     super(itemNum, size);
     this.type = type;
 }
 
 public String toString(){
     return "Curry: " + super.toString() +", " + type;
 }
}