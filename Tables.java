import com.sun.org.apache.xpath.internal.operations.Or;
import menu.Menu;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tables {
   private int tableCount = 60;
   private BigDecimal tableBill;
   private boolean isFree;
   private BigDecimal tip;
   List<Client>clientList;
   List<Menu>menuList;
   Queue<Order>orderQueue;
   Waitress waitress;
   Chef chef;
   Barman barman;
   public Tables(int tableCount)
   {
       this.clientList = new ArrayList<>();
       this.tip = new BigDecimal(0);
       this.tableBill = new BigDecimal(0);
       this.menuList = new ArrayList<>();
       this.orderQueue = new LinkedList<>();
       this.isFree = false;
       this.waitress = new Waitress("name", BigDecimal.valueOf(1000));
   }

   public void clientIn(Client client)
   {
       if(!isFree)
       {
           this.clientList.add(client);
           waitress.giveOrderToChef(chef);
           Order orderFood = new Order();
           orderQueue.add((Order) orderFood.getMenuList());
           orderQueue.peek();
           orderQueue.remove();

           waitress.giveOrderToBarman(barman);
           Order orderDrinks = new Order();
           orderQueue.add((Order) orderDrinks.getMenuList());
           orderQueue.peek();
           orderQueue.remove();
       }
       else
       {
           System.out.println("The table is busy");
       }
   }

   private BigDecimal calculateBill()
   {
       for(Client client : clientList)
       {
           this.tableBill = this.tableBill.add(client.getMoney().setScale(2, RoundingMode.HALF_UP));
       }
       return tableBill;
   }

   private BigDecimal sentTip()
   {
       for(Client client : clientList)
       {
           this.tip = this.tip.add(client.getMoney().setScale(2, RoundingMode.HALF_UP));
       }
       return tip;
   }

    public void addAmount(Restaurant restaurant)
    {
        restaurant.setStartAmount(restaurant.getStartAmount().add(tableBill));
    }



    public int getTableCount() {
        return tableCount;
    }

    public void setTableCount(int tableCount) {
        this.tableCount = tableCount;
    }

    public BigDecimal getTableBill() {
        return tableBill;
    }

    public void setTableBill(BigDecimal tableBill) {
        this.tableBill = tableBill;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public BigDecimal getTip() {
        return tip;
    }

    public void setTip(BigDecimal tip) {
        this.tip = tip;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }
}


