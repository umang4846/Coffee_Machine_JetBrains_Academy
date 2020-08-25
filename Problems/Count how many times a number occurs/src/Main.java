import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(scanner.next());
        }
        int num = Integer.parseInt(scanner.next());
        int count = 0;
        for (int j : array) {
            if (j == num) {
                ++count;
            }
        }
        System.out.println(count);
    }
}