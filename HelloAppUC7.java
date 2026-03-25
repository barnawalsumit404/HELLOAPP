public class HelloAppUC7 {
    public static void main(String[] args) {
        if (args.length == 0) {
            // Default greeting
            System.out.println("Hello, World!");
        } else {
            // Use String.join to concatenate names with commas
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        }
    }
}