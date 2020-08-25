import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }
        int num = Integer.MIN_VALUE;
        for (int i : a) {
            if (num < i) {
                num = i;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                System.out.println(i);
                break;
            }
        }
    }
}