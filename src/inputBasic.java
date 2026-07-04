import java.util.Scanner;
public class inputBasic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Name: ");
        String name = sc.nextLine();
        System.out.print("Enter a Age: ");
        int age = sc.nextInt();
        System.out.print("Enter a CGPA: ");
        double CGPA = sc.nextDouble();
        System.out.print("Are you student of Parul university? (true/false): ");
        boolean isStudent =  sc.nextBoolean();

        System.out.print("hello my self " + name + " and i am " + age + " years old and my CGPA is " + CGPA );
        if(isStudent){
            System.out.println(" I am student of Parul university.");
        }else
        {System.out.println(" I am not student of Parul university.");}
    }


}
