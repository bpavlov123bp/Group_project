public class Table {
    private int tableNumber;
    private boolean tableSituation;
    public Table(int tableNumber, boolean tableSituation)
    {
        this.tableNumber = tableNumber;
        this.tableSituation = tableSituation;
    }

    public int getTableNumber()
    {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber)
    {
        this.tableNumber = tableNumber;
    }

    public boolean getTableSituation()
    {
        return tableSituation;
    }

    public void setTableSituation(boolean tableSituation)
    {
        this.tableSituation = tableSituation;
    }
}
