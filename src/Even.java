public class Even {
    public static void main(String[] args) {
        int even = 20;

        System.out.println("Printing Even numbers between 1 and " + even);

        for (int i = 1; i <= even; i++) {

            // if the number is divisible by 2 then it is even
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
