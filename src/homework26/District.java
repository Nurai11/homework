package homework26;

public class District extends AbstractLocality{

    @Override
    void searchBySupervisor(){
        for (Supervisor supervisor: supervisors) {
            if(supervisor.getName().equals(supervisor)){
                System.out.println(supervisor);
            }else{
                System.out.println("Supervisor not found. ");
            }
        }
    }
}
