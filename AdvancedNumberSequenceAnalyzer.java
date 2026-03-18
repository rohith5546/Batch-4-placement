import java.util.Scanner;

class AdvancedNumberSequenceAnalyzer {

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0, even = 0, odd = 0, prime = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;

            if (isPrime(arr[i]))
                prime++;
        }

        double avg = (double) sum / n;

        boolean ascending = true, descending = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1])
                ascending = false;
            if (arr[i] < arr[i + 1])
                descending = false;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Even Count: " + even);
        System.out.println("Odd Count: " + odd);
        System.out.println("Prime Count: " + prime);

        if (ascending)
            System.out.println("Sequence is Ascending");
        else if (descending)
            System.out.println("Sequence is Descending");
        else
            System.out.println("Sequence is Unordered");
    }
}