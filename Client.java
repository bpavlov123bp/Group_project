import menu.Menu;
import menu.Pizza;
import menu.Salad;
import warehouse.Alcohol;
import warehouse.NonAlcohol;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Pizza> orderPizza;
    private List<Salad>orderSalad;
    private List<Alcohol>orderAlcohol;
    private List<NonAlcohol>orderNonAlcohol;
    private BigDecimal money;

    public Client()
    {
        this.orderPizza = new ArrayList<Pizza>();
        this.orderSalad = new ArrayList<>();
        this.orderAlcohol = new ArrayList<>();
        this.orderNonAlcohol = new ArrayList<>();
        this.money = money;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public int getRandom(double min, double max)
    {
        return (int)((Math.random() * (max - min)) + min);
    }

    public void payAmount()
    {
        getMoney();
    }

    public void orderFoodAndDrinks(Menu menu)
    {
        List<Menu>items = new ArrayList<>();
        orderPizza.add(menu.getPizzas().get(getRandom(0, menu.getPizzas().size() - 1)));
        orderSalad.add(menu.getSalads().get(getRandom(0, menu.getSalads().size() - 1)));
        orderAlcohol.add(menu.getAlcohol().get(getRandom(0, menu.getAlcohol().size() - 1)));
        orderNonAlcohol.add(menu.getNonAlcohols().get(getRandom(0, menu.getNonAlcohols().size() - 1)));
    }

}
