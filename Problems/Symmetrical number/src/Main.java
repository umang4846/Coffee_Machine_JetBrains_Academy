import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (String.valueOf(num).length() == 4) {
            if (checkSymmetricOrNot(String.valueOf(num))) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        } else if (String.valueOf(num).length() == 3) {
            if (checkSymmetricOrNot("0" + String.valueOf(num))) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        } else if (String.valueOf(num).length() == 2) {
            if (checkSymmetricOrNot("00" + String.valueOf(num))) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        } else if (String.valueOf(num).length() == 1) {
            if (checkSymmetricOrNot("000" + String.valueOf(num))) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }


    private static boolean checkSymmetricOrNot(String val) {
        StringBuilder sb = new StringBuilder(val);
        return (val.equals(sb.reverse().toString()));
    }
}