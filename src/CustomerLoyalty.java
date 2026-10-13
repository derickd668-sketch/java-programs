import java.util.Scanner;
public class CustomerLoyalty {
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       String customerName;
       double purchaseAmount;
       int points=0;
       int choice;

       System.out.print("Enter customer name:");
       customerName = sc.nextLine();
       do {
           System.out.println("==== CUSTOMER LOYALTY SYSTEM===");
           System.out.println("1. Record Purchase");
           System.out.println("2. Check Reward Points");
           System.out.println("3. Redeem rewards");
           System.out.println("4. Exit");
           System.out.print("Enter Your Choice:");
           choice=sc.nextInt();
           switch(choice)
           {
               case 1:
                   System.out.print("Enter purchase amount (KSH):");
                   purchaseAmount=sc.nextDouble();
                   if(purchaseAmount > 0)
                   {
                       int earnedPoints = (int) (purchaseAmount / 100);//(int) converts purchaseAmount from double to int,
                       points+=earnedPoints;
                       System.out.println("Purchase recorded!");
                       System.out.println("Points earned:"+earnedPoints);
                   }
                   else
                   {
                       System.out.println("Invalid purchase amount.");
                   }
                   break;
               case 2:
               {
                   System.out.println("Customer:"+customerName);
                   System.out.println("Total points:"+points);
               }
               break;
               case 3:
                   if (points >= 100)
                   {
                       points=points - 100;
                       System.out.println("Congratulations! You redeemed"+"Ksh 100 discount.");
                       System.out.println("Remaining points:"+points);
                   }
                   else
                   {
                       System.out.println("You need 100 points to redeem.");
                   }
                   break;
               case 4:
                   System.out.println("Thank You For Shopping with us."+ customerName+"!");
                   break;
               default:
                   System.out.println("Invalid choice.Try again.");
           }
       }while(choice != 4);
   }
}
