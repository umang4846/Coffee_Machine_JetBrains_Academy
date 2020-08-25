import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        int[] a = new int[size];
        int[] b = new int[2];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(scanner.next());
        }
        boolean isTrue = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == b[0] && a[i + 1] == b[1]) {
                isTrue = true;
            }
            if (a[i] == b[1] && a[i + 1] == b[0]) {
                isTrue = true;
            }
        }
        System.out.println(isTrue);
    }
}