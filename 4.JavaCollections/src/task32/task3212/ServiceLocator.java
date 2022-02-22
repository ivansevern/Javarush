package task32.task3212;

import javax.naming.InitialContext;

public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }


    public static Service getService(String jndiName) {
        Service service = cache.getServices(jndiName);
        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        service = (Service) context.lookup(jndiName);
        cache.addService(service);
        return service;
    }
}
