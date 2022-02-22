package task32.task3212;

public class EJBServiceImpl implements Service {

    @Override
    public void execute() {
        System.out.println("Execute EJBService");
    }

    @Override
    public String getName() {
        return "EJBService";
    }
}
