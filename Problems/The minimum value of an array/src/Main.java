import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }
        int num = Integer.MAX_VALUE;
        for (int i : a) {
            if (num > i) {
                num = i;
            }
        }
        System.out.println(num);
    }
}