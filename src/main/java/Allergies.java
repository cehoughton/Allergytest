import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Allergies {
    public static void main(String[] args) {
    }

    public static String checkAllergies(Integer userInput) {
      String result = "";
      int cats = 0;
      int pollen = 0;
      int chocolate = 0;
      int tomatoes = 0;
      int strawberries = 0;
      int shellfish = 0;
      int peanuts = 0;
      int eggs = 0;
      String noPenny = "";

      while (userInput > 0) {
       if (userInput >= 128){
         userInput -= 128;
         cats++;
       } else if (userInput >= 10){
         userInput -= 10;
         dimes++;
       } else if (userInput >= 5) {
         userInput -= 5;
         nickels++;
       } else if (userInput >= 1) {
         userInput -= 1;
         pennies++;
       }else {
         userInput = 0;
         noPenny = "no more money";
       }
    }
       String catsReturn = "";
       String dimeReturn= "";
       String nickelReturn="";
       String pennyReturn="";

       if (cats > 0) {
         catsReturn = ("cats");
       }
       if (dimes > 0) {
         dimeReturn = " " + dimes + " dimes";
       }
       if (nickels > 0) {
         nickelReturn = " " + nickels + " nickels";

       }
       if (pennies > 0) {
         pennyReturn = " " + pennies + " pennies";
       }



       return result =  String.format("%s%s%s%s", quarterReturn, dimeReturn, nickelReturn, pennyReturn);
     }
    }
}
