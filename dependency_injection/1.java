class Client {
    // Internal reference to the service used by this client
    private ConnectionService service;

    // Constructor
    Client() {
        // Specify a specific implementation in the constructor instead of using dependency injection
        service = new ConnectionService();
    }

    // Method within this client that uses the services
    public String greet() {
        return "Connection: " + service.connectServer();
    }
}
