import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MainFunctions {
    private int tableAmount = 20;
    private int emptyTableAmount = 18;
    private int billNumber = 1;
    private String[][]menu;
    private List<Table> tables;

    public MainFunctions(int tableAmount, int emptyTableAmount, int billNumber, String[][]menu,
                         List<Table>tables)
    {
        this.tableAmount = tableAmount;
        this.emptyTableAmount = emptyTableAmount;
        this.billNumber = billNumber;
        this.menu = menu;
        this.tables = tables;
    }

    public MainFunctions()
    {
        this.tableAmount = 20;
        this.emptyTableAmount = 18;
        this.billNumber = 1;
        this.menu = new String[][]
                {
                        {"------Pizza------\n", "Margarita:\t\t\t8.50\n", "Calcone:\t\t\t9.00\n", "Capri:\t\t\t9.00\n"},
                        {"------Salad------\n", "Shopska:\t\t\t5.50\n", "Ovcharska:\t\t\t6.50\n", "Fantasy:\t\t\t7.00\n"},
                        {"------Alcohol------\n", "Vodka:\t\t\t8.00\n", "Wine:\t\t\t6.00\n", "Beer:\t\t\t2.20\n"},
                        {"------Soft Drinks------\n", "Coca cola:\t\t\t1.50\n", "Fanta:\t\t\t1.50\n", "Water:\t\t\t1.20\n"}
                };

        int[] tableNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        boolean[]tableSituation = {true, false,false,true, true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
        List<Table>theTables = new ArrayList<>();
        for(int i = 0; i < tableNumber.length; i++)
        {
            Table newTable = new Table(tableNumber[i], tableSituation[i]);
            theTables.add(newTable);
        }
        this.tables = theTables;
    }

    public int getTableAmount()
    {
        return tableAmount;
    }

    public void setTableAmount(int tableAmount)
    {
        this.tableAmount = tableAmount;
    }

    public int getEmptyTableAmount()
    {
        return emptyTableAmount;
    }

    public void setEmptyTableAmount(int emptyTableAmount)
    {
        this.emptyTableAmount = emptyTableAmount;
    }

    public int getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(int billNumber) {
        this.billNumber = billNumber;
    }

    public String[][] getMenu() {
        return menu;
    }

    public void setMenu(String[][] menu) {
        this.menu = menu;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }
}
