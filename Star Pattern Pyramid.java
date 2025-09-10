public class StarPattern {
    public static void main(String[] args) {
        int rows = 5; // pyramid ki height

        for (int i = 1; i <= rows; i++) {
            // spaces print karo
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // stars print karo
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
