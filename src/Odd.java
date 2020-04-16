public class Odd {
    public static void main(String[] args) {
        int odd = 20;

        System.out.println("Printing Odd numbers between 1 and " + odd);

        for (int i = 1; i <= odd; i++) {

            // if the number is divisible by 2 then it is even
            for (i = 1; i <= odd; i+=2) {
                if (i <= 20)
                System.out.print(i + " ");
            }
        }
    }
}
