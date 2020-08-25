import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split("[ ]");
        boolean isAlphabetical = true;
        for (int i = 1; i < a.length; i++) {
            if (a[i].compareTo(a[i - 1]) < 0) {
                isAlphabetical = false;
            }
        }
        System.out.print(isAlphabetical);
    }
}