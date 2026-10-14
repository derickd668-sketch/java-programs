import java.util.Scanner;
public class CustomerLoyalty2 {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String CustomerName;
        double purchaseAmount;
        int points = 0;
        int choice;
        int qualifyingPurchases = 0;

        System.out.print("Enter customer name:");
        CustomerName = sc.nextLine();
        do {
            System.out.println("\n===CUSTOMER LOYALTY SYSTEM===");
            System.out.println("1.Record Purchase");
            System.out.println("2.Check reward points");
            System.out.println("3.Redeem rewards");
            System.out.println("4.Exit");
            System.out.print("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter purchase amount (ksh):");
                    purchaseAmount = sc.nextDouble();
                    if (purchaseAmount >= 100) {
                        qualifyingPurchases++;
                        int earnedPoints = fibonacci(qualifyingPurchases);
                        points = points + earnedPoints;
                        System.out.println("Purchase recorded successfully!");
                        System.out.println("Fibonacci bonus points earned:" + earnedPoints);
                        System.out.println("Total reward points:" + points);
                    } else if (purchaseAmount > 0) {
                        System.out.println("Purchase recorded,but you need" + "at least Ksh 100 to earn points.");
                    } else {
                        System.out.println("Invalid Purchase Amount.");
                    }
                    break;
                case 2:
                    System.out.println("Customer:" + CustomerName);
                    System.out.println("Qualifying purchases:" + qualifyingPurchases);
                    System.out.println("Total Reward Points:" + points);
                    break;
                case 3:
                    if (points >= 100) {
                        points = points - 100;
                        System.out.println("Remaining ponts:" + points);
                    } else {
                        System.out.println("You need 100 points to redeem.");
                    }
                    break;
                case 4:
                    System.out.println("Thank You for shopping with us!" + CustomerName + "!");
                    break;
                default:
                    System.out.println("Invalid choice.Try again.");
            }
        } while (choice != 4);
        sc.close();
    }
}


