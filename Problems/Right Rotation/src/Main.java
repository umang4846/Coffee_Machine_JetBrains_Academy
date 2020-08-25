import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split("[ ]");
        int num = scanner.nextInt();
        String temp;
        for (int i = 1; i <= (num % a.length); i++) {
            temp = a[a.length - 1];
            System.arraycopy(a, 0, a, 1, a.length - 1);
            a[0] = temp;
        }
        for (String i : a) {
            System.out.print(i + " ");
        }

    }
}