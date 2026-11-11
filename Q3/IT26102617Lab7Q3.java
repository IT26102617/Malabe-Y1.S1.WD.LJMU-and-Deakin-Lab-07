import java.util.Scanner;
public class IT26102617Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double bill, discount, amount;
        char payment;

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nCustomer " + i);

            System.out.print("Enter total bill amount: ");
            bill = input.nextDouble();

            System.out.print("Enter payment mode (C/O): ");
            payment = input.next().charAt(0);

            if (payment == 'C' || payment == 'c') {

                discount = bill * 0.05;
                amount = bill - discount;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amount);

            }
            else if (payment == 'O' || payment == 'o') {

                discount = 0;
                amount = bill;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amount);

            }
            else {
                System.out.println("Payment Mode is Not Valid");
            }
        }
    }
}
