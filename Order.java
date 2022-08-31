import menu.Menu;
import menu.Pizza;
import menu.Salad;
import warehouse.Alcohol;
import warehouse.NonAlcohol;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
   private List<Menu>items;
   public Order()
   {
       this.items = new ArrayList<>();
   }

    public List<Menu> getItems() {
        return items;
    }

    public void setItems(List<Menu> items) {
        this.items = items;
    }

    public void addItem(Menu item)
    {
        this.items.add(item);
    }

    @Override

        public String toString()
        {
            StringBuilder sb = new StringBuilder();
            for(Menu menu : items)
            {
                sb.append(menu);
                sb.append("\n");
            }
            return sb.toString();
        }
}
