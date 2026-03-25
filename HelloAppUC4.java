public class HelloAppUC4 {
    public static void main(String[] args) {
        String greeting;

        if (args.length > 0) {
            // Join all names with commas
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        } else {
            // Default to World
            greeting = "Hello, World!";
        }

        System.out.println(greeting);
    }
}