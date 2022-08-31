
import menu.Menu;
import warehouse.Warehouse;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Restaurant {
    private String name;
    private List<Employee>employeeList;
    private List<Client>clientList;
    private Menu menu;
    private int capacity;
    private BigDecimal startAmount;
    private int countOfTables;
    private List<Tables>tablesList;
    private Warehouse warehouse;

    public Restaurant()
    {
        this.name = "Napoli";
        this.employeeList = new ArrayList<>();
        this.clientList = new ArrayList<>();
        this.menu = new Menu();
        this.capacity = 80;
        this.startAmount = new BigDecimal(50000);
        this.countOfTables = 20;
    }

    public void setEmployee()
    {
        employeeList.add(new Manager("Iskra", BigDecimal.valueOf(2000)));
        employeeList.add(new Waitress("Milena", BigDecimal.valueOf(1200)));
        employeeList.add(new Waitress("Ginka", BigDecimal.valueOf(1200)));
        employeeList.add(new Waitress("Genia", BigDecimal.valueOf(1200)));
        employeeList.add(new Hostess("Milka", BigDecimal.valueOf(1200)));
        employeeList.add(new Hostess("Binka", BigDecimal.valueOf(1200)));
        employeeList.add(new Barman("Mitko", BigDecimal.valueOf(1300)));
        employeeList.add(new Barman("Petko", BigDecimal.valueOf(1300)));
        employeeList.add(new Chef("Pancho", BigDecimal.valueOf(1300)));
        employeeList.add(new Chef("Georgi", BigDecimal.valueOf(1300)));

    }

    public void tables()
    {
        for(int i = 1; i <= countOfTables; i++)
        {
            tablesList.add(new Tables(i));
        }
    }

    public void generateRandomCustomers()
    {
        Random random = new Random();
        Client client;
        for(int i = 1; i <= 30; i++)
        {
            int customersCount = random.nextInt(80);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public BigDecimal getStartAmount() {
        return startAmount;
    }

    public void setStartAmount(BigDecimal startAmount) {
        this.startAmount = startAmount;
    }

    public int getCountOfTables() {
        return countOfTables;
    }

    public void setCountOfTables(int countOfTables) {
        this.countOfTables = countOfTables;
    }

    public List<Tables> getTablesList() {
        return tablesList;
    }

    public void setTablesList(List<Tables> tablesList) {
        this.tablesList = tablesList;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
