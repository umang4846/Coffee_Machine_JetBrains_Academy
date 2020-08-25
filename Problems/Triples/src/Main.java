import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }
        int triples = 0;
        for (int i = 0; i < a.length - 2; i++) {
            if (a[i] + 1 == a[i + 1] && a[i + 1] + 1 == a[i + 2]) {
                triples++;
            }

        }
        System.out.println(triples);
    }
}