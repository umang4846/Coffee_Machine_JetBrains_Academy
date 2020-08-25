import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }
        int count = 1;
        int length = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                count++;
            } else {
                if (length < count) {
                    length = count;
                }
                count = 1;
            }
        }
        System.out.print(Math.max(length, count));
    }
}