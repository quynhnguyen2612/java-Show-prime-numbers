
// in ra 20 số nguyên tố đầu tiên

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int numbers = 20;
        int N = 2;


        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}