import java.util.Scanner;
public class Keywordexample{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int grade;
        System.out.print("Enter your Grade:");
        grade= sc.nextInt();
        if(grade>=70)
        {
            System.out.println("Excellent, Grade = A");
        }
        else if(grade >= 60)
        {
            System.out.println("Good, Grade = B");
        }
        else if (grade >= 50)
        {
            System.out.println("Fair,Grade C");
        }
        else if (grade >= 40)
        {
            System.out.println("Poor,Grade D");
        }
        else
        {
            System.out.println("Grade E, Supplimentary Case!");
        }
       sc.close();
    }
}