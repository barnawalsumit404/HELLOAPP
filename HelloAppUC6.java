public class HelloAppUC6 {
    public static void main(String[] args) {
        if (args.length == 0) {
            // Default greeting
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Append each name followed by ", "
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove the trailing ", " using substring
            if (nameBuilder.length() > 0) {
                nameBuilder = new StringBuilder(
                    nameBuilder.substring(0, nameBuilder.length() - 2)
                );
            }

            System.out.println("Hello, " + nameBuilder + "!");
        }
    }
}