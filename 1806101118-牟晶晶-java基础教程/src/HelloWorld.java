public class HelloWorld {
    private static HelloWorld ourInstance = new HelloWorld();

    public static HelloWorld getInstance() {
        return ourInstance;
    }

    private HelloWorld() {
    }
}
