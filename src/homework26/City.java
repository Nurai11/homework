package homework26;

public class City extends AbstractLocality {
    private District[] districts = new District[2];
    private String name;


    @Override
    void searchBySupervisor(){
        for (Supervisor supervisor: supervisors) {
            if(supervisor.getName().equals(supervisor)){
                System.out.println("Supervisor: " + supervisor);
            }else{
                System.out.println("Supervisor not found. ");
            }
        }
    }

    public City(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City: " + name;
    }
}
