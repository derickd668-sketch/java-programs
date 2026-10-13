import java.util.Scanner;

public class cookies{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of cookies eaten: ");
    int c=sc.nextInt();
    if(c >40)
    {
    System.out.println("invalid input,please try amount 40 and below");
    }
    else
    {
        System.out.println("Total calories ="+c*300);
    }
    }

}