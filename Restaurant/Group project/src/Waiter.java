public class Waiter extends Employee{

    public Waiter(String name)
    {
        super(name);
    }

    public int checkTable(MainFunctions mainFunctions)
    {
        int tableNumber;
        for(int i = 0; i < mainFunctions.getTables().size(); i++)
        {
            Table theTable = mainFunctions.getTables().get(i);
            if(theTable.getTableSituation() == true)
            {
                mainFunctions.getTables().get(i).setTableSituation(false);
                tableNumber = mainFunctions.getTables().get(i).getTableNumber();
                return tableNumber;
            }
        }
        tableNumber = 0;
        return tableNumber;
    }

    public String[][] bringMenu(MainFunctions mainFunctions)
    {
        return mainFunctions.getMenu();
    }
}
