

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {
  private int tableAmount;
  private boolean tableSituation;
  private BigDecimal billTable;
  private BigDecimal tip;
  List<Client> clientList;
  private int tableNumber;
  public Table()
  {
     this.tableAmount = tableAmount;
     this.tableSituation = false;
     this.billTable = new BigDecimal(0);
     this.tip = new BigDecimal(0);
     this.tableNumber = tableNumber;

  }

  public void addClient(Client client)
  {
      if(tableSituation == true)
      {
          this.clientList.add(client);
      }

      else
      {
          System.out.println("The table is not empty!!!");
      }
  }

  public BigDecimal getBillTable()
  {
      calculateBill();
      return billTable;
  }

  public void calculateBill()
  {
      for(Client client : clientList)
      {
          this.billTable = billTable.add(client.getMoney().setScale(2, RoundingMode.HALF_UP));
      }
  }

  public void setBillTable(BigDecimal billTable)
  {
      this.billTable = billTable;
  }

  public BigDecimal getTip()
  {
      takeTip();
      return tip;
  }

  public void takeTip()

  {
      for(Client client : clientList)
      {
          this.tip = this.tip.add(client.getMoney().setScale(2, RoundingMode.HALF_UP));
      }
  }

  public void setTip(BigDecimal tip)
  {
      this.tip = tip;
  }

    public int getTableAmount() {
        return tableAmount;
    }

    public void setTableAmount(int tableAmount) {
        this.tableAmount = tableAmount;
    }

    public boolean isTableSituation() {
        return tableSituation;
    }

    public void setTableSituation(boolean tableSituation) {
        this.tableSituation = tableSituation;
    }

    public List<Client> getClient() {
        return clientList;
    }

    public void setClient(List<Client> clientList) {
        this.clientList = clientList;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Table number: " + this.tableNumber + "\n");
        sb.append("Bill: " + this.billTable + "\n");
        sb.append("Table situation: " + this.tableSituation + "\n");
        sb.append("Tip for the table: " + this.tip + "\n");
        return sb.toString();
    }
}
