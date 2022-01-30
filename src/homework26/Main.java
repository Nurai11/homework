package homework26;

public class Main {
    public static void main(String[] args) {
        City city1 = new City("Tokyo");
        City city2 = new City("Kioto");
        City city3 = new City("Nagoya");

        Village village1 = new Village();
        Village village2 = new Village();

        Supervisor supervisor = new Supervisor();
        city1.searchBySupervisor();


    }
}
