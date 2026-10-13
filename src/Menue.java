import java.util.Scanner;
public class Menue{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int choice;
        System.out.println("===== Mailing List Menu =====");
        System.out.println("1.Add Email");
        System.out.println("2. View Mailing List");
        System.out.println("3.Delete Email");
        System.out.println("4. Exit");
        System.out.print("Enter your choice:");
        choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Add Email Selected.");
                break;
            case 2:
                System.out.println("View Mailing List Selected");
                break;
            case 3:
                System.out.println("Delete The Email Selected.");
                break;
            case 4:
                System.out.println("Exiting the program...");
                break;
            default:
                System.out.println("Invalid choice.");

        }
        sc.close();
    }
}