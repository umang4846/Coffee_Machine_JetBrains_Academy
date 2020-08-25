import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }
        boolean sorted = true;
        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] < a[i - 1]) {
                sorted = false;
            }
        }
        System.out.println(sorted);
    }
}