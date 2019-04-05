// Service setter interface.
public interface ServiceSetter {
    public void setService(Service service);
}

class Client implements ServiceSetter {
    // Internal reference to the service used by this client
    private ConnectionService service;

    // Service setter interface.
    public void setService(Service service){
    	this.service = service;
    }
    // Constructor
    Client() {
    }

    // Method within this client that uses the services
    public String greet() {
        return "Connection: " + service.connectServer();
    }
}
