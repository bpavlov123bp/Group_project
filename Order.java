import menu.Menu;
import menu.Pizza;
import menu.Salad;
import warehouse.Alcohol;
import warehouse.NonAlcohol;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Menu>menuList;

    public Order()
    {
        menuList = new ArrayList<>();
    }

    public void addMenuItem(Menu menu)
    {
        menuList.add(menu);
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Order: " + "\n");
        for(Menu menu : menuList)
        {
            sb.append("Menu: " + menu + "\n");
        }
        return sb.toString();
    }
}
