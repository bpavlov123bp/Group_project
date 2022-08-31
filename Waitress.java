import menu.Menu;
import menu.Pizza;
import warehouse.Warehouse;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Waitress extends Employee{
    

    public Waitress(String name, BigDecimal salary)
    {
        super(name, salary);

    }




   public void giveOrderToChef(Chef chef)
   {
       chef.makeFood();
   }

   public void giveOrderToBarman(Barman barman)
   {
       barman.serveDrinks();
   }

}
