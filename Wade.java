public class Wade {

    /**
     * Start Server.
     */
    public static void DoServer() {
        System.out.println("Starting Server!");

        DataPollerFactory.addDataPoller("WebDataPoller", "WebDataPoller");
        Server s = Server.instance();
        s.addDataPoller("WebDataPoller");
        s.runServer();
    }

    /**
     * Start Client.
     */
    public static void DoClient() {
        System.out.println("Starting Client!");

        WidgetFactory.addWidget("BusWidget", "Bus");
        WidgetFactory.addWidget("WeatherWidget", "Weather");
        Client c = new Client();
        c.addWidget("Bus");
        c.addWidget("Weather");
        c.run();
    }

    /**
     * Main function.
     * @param args arguments for main.
     */
    public static void main(String[] args) {
        if (args[0].contentEquals("--server")) {
            DoServer();
        } else if (args[0].contentEquals("--client")) {
            DoClient();
        }
    }

}