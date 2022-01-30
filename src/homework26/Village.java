package homework26;

public class Village extends AbstractLocality{
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
