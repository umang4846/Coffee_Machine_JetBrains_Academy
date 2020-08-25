import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCompany = Integer.parseInt(scanner.next());
        int[] companyIncome = new int[totalCompany];
        int[] companyTax = new int[totalCompany];
        for (int i = 0; i < companyIncome.length; i++) {
            companyIncome[i] = Integer.parseInt(scanner.next());
        }
        for (int i = 0; i < companyTax.length; i++) {
            companyTax[i] = Integer.parseInt(scanner.next());
        }
        double maxTax = 0;
        int company = 0;
        for (int i = 0; i < companyIncome.length; i++) {
            double taxPay = companyIncome[i] * companyTax[i];
            if (taxPay > maxTax) {
                maxTax = taxPay;
                company = i + 1;
            }
        }
        System.out.println(company);

    }
}