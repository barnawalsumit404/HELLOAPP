public class HelloAppUC3 {
    public static void main(String[] args) {
        // Use ternary operator to handle default
        String name = (args.length > 0) ? args[0] : "World";

        // Display personalized greeting
        System.out.println("Hello, " + name + "!");
    }
}