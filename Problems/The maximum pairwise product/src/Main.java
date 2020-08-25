import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }
        int product = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] * a[i + 1] > product) {
                product = a[i] * a[i + 1];
            }
        }
        System.out.println(product);
    }
}