import java.util.Scanner;

/**
 *Add, delete, print a list of menu items
 *Tamsanqa Thwala
 *@version 28/10/2020
 */

public class FoodCourt{

    public static void main(String[] args){
        Scanner entry = new Scanner(System.in);
        Menu[] menu = new Menu[50];
        int index = 0; 
        //initializing array
        for (int k = 0; k< menu.length; k++){
            menu[k] = new Menu(0, "none");
        }
        System.out.println("Welcome to Great International Food Court");
               
        //take menu choice
        String choice = "";
        
        while (!(choice.toLowerCase().equals("q") || choice.toLowerCase().equals("quit"))){
        System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
        choice = entry.nextLine();
        //choice = choice.toLowerCase();
            if (choice.toLowerCase().equals("p") || choice.toLowerCase().equals("pizza"))
            {
                System.out.println("Enter the menu item number");
                //check if input is string
                int itemNum;
                if ( entry.hasNextInt())
                    itemNum = entry.nextInt();
                else
                    itemNum = Menu.subtract(entry.next());
                entry.nextLine();
                //take pizza size
                System.out.println("Enter the size");
                String size = entry.nextLine();
               //take 
               System.out.println("Enter the base");
               String base = entry.nextLine();
               
               //take extra cheese choice
               System.out.println("Enter extra cheese");
               String cheese = entry.nextLine();
               
               //take extra garlic choice
               System.out.println("Enter extra garlic");
               String garlic = entry.nextLine();
               //add pizza to menu
               Pizza pizza = new Pizza(itemNum, size, base, cheese, garlic);
               menu[index] = pizza;
               index++;
               //print done
               System.out.println("Done");
             }
            if (choice.toLowerCase().equals("c") || choice.toLowerCase().equals("curry")){
                System.out.println("Enter the menu item number");
                int itemNum;
                //check if input is string
                if ( entry.hasNextInt())
                    itemNum = entry.nextInt();
                else
                    itemNum = Menu.subtract(entry.next());
                entry.nextLine();
                //take curry size
                System.out.println("Enter the size");
                String size = entry.nextLine();
                //take curry type 
                System.out.println("Enter the curry type");
                String currytype = entry.nextLine();
                //add curry to menu
                Curry curry = new Curry(itemNum, size, currytype);
                menu[index] = curry;
                index++;
                //print done
                System.out.println("Done");
           }     
           if (choice.toLowerCase().equals("s") || choice.toLowerCase().equals("soft drink")){
                System.out.println("Enter the menu item number");
                int itemNum;
                if ( entry.hasNextInt())
                    itemNum = entry.nextInt();
                else
                    itemNum = Menu.subtract(entry.next());
                
                entry.nextLine();
                //take drink size
                System.out.println("Enter the size");
                String size = entry.nextLine();
                
                //take drink flavour
                System.out.println("Enter the flavour");
                String flavour = entry.nextLine();
                
                //take container choice
                System.out.println("Enter whether it is a bottle or can");
                String container = entry.nextLine();
                SoftDrink drink = new SoftDrink(itemNum, size, flavour, container);
                //add to menu
                menu[index] = drink;
                index++;
                //print done
                System.out.println("Done");
           }
           if (choice.toLowerCase().equals("d") || choice.toLowerCase().equals("delete")){
               System.out.println("Enter the menu item number");
               //check if input is string
                int Num;
                if ( entry.hasNextInt())
                    Num = entry.nextInt();
                else
                    Num = Menu.subtract(entry.next());
               String found = "Not found";
               for (int j = 0; j< menu.length; j++){
                   if (menu[j].getItemNum() == Num){
                       found = "Done";
                       menu[j] = new Menu(0, "none");
                       break;
                       } 
               }
            System.out.println(found);
            entry.nextLine();
           }
           
           //print menu list
          if (choice.toLowerCase().equals("l") || choice.toLowerCase().equals("list")){
              for (int i =0; i< menu.length; i++){
                  if (menu[i] != null && menu[i].getItemNum() != 0)
                      System.out.println(menu[i]);
              }
          System.out.println("Done");
          }
       }       
   }
}