import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Allergies {
    public static void main(String[] args) {
      String layout = "templates/layout.vtl";

      get("/", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("template", "templates/home.vtl");
        return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());

      get("/return", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/return.vtl");

      String stringCoins= request.queryParams("userInput");
      Integer coins = Integer.parseInt(stringCoins);

      String change;
      change = checkAllergies(coins);

      model.put("userInput", change);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

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
      String noAllergies = "";

      while (userInput > 0) {
       if (userInput >= 128){
         userInput -= 128;
         cats++;
       } else if (userInput >= 64){
         userInput -= 64;
         pollen++;
       } else if (userInput >= 32) {
         userInput -= 32;
         chocolate++;
       } else if (userInput >= 16) {
         userInput -= 16;
         tomatoes++;
       } else if (userInput >= 8) {
         userInput -= 8;
         strawberries++;
       } else if (userInput >= 4) {
         userInput -= 4;
         shellfish++;
       } else if (userInput >= 2) {
         userInput -= 2;
         peanuts++;
       } else if (userInput >= 1) {
         userInput -= 1;
         eggs++;




       }else {
         userInput = 0;
         noAllergies = "no allergies";
       }
    }
       String catsReturn = "";
       String pollenReturn= "";
       String chocolateReturn="";
       String tomatoesReturn="";
       String strawberriesReturn="";
       String shellfishReturn="";
       String peanutsReturn="";
       String eggsReturn="";

       if (cats > 0) {
         catsReturn = ("cats");
       }
       if (pollen > 0) {
         pollenReturn = " " + "pollen";
       }
       if (chocolate > 0) {
         chocolateReturn = " " + "chocolate";
       }
       if (tomatoes > 0) {
         tomatoesReturn = " " + "tomatoes";
       }
       if (strawberries > 0) {
         strawberriesReturn = " " + "strawberries";
       }
       if (shellfish > 0) {
         shellfishReturn = " " + "shellfish";
       }
       if (peanuts > 0) {
         peanutsReturn = " " + "peanuts";
       }
       if (eggs > 0) {
         eggsReturn = " " + "eggs";
       }

       return result =  String.format("%s%s%s%s%s%s%s%s", catsReturn, pollenReturn, chocolateReturn, tomatoesReturn, strawberriesReturn, shellfishReturn, peanutsReturn, eggsReturn);
     }
    }
