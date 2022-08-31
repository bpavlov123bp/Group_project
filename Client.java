import menu.Menu;
import menu.Pizza;
import menu.Salad;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private BigDecimal money;
    private List<Menu>selectFromMenu;

    public Client()
    {

    }

    public Client(BigDecimal money)
    {
        this.money = money;
        this.selectFromMenu = new ArrayList<>();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public int getRandomNumber(double min, double max)
    {
        return (int)((Math.random() * (max - min)) + min);
    }

    public void selectFromMenu(Menu menu)
    {
       List<List<Pizza>> selectPizza = new ArrayList<>();
       List<List<Salad>>selectSalad = new ArrayList<>();
        for(int i = 1; i <= 4; i++)
        {
            Menu selectFromMenu = new Menu();
            selectPizza.add(selectFromMenu.getPizzas());

        }
    }
}
