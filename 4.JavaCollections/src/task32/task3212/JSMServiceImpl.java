package task32.task3212;

public class JSMServiceImpl implements Service {

    @Override
    public void execute() {
        System.out.println("Execute JMSService");
    }

    @Override
    public String getName() {
        return "JMSService";
    }
}
