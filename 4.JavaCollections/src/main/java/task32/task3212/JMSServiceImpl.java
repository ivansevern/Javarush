package task32.task3212;

public class JMSServiceImpl implements Service {
    @Override
    public void execute() {
        System.out.println("Executing JMSService");
    }

    @Override
    public String getName() {
        return "JMSService";
    }
}
