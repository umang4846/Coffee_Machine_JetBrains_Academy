import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }
        int temp = a[a.length - 1];
        System.arraycopy(a, 0, a, 1, a.length - 1);
        a[0] = temp;
        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}