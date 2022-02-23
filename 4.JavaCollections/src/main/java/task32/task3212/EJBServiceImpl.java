package task32.task3212;

public class EJBServiceImpl implements Service {
    @Override
    public void execute() {
        System.out.println("Executing EJBService");
    }

    @Override
    public String getName() {
        return "JMSService";
    }
}
