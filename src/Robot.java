import java.util.Scanner;

public class Robot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id;
        float age,height,weight;
        System.err.print("hello user input your Age: ");
        age=input.nextFloat();
        System.err.print("hello user input your Id: ");
        id=input.nextInt();
        System.err.print("hello user input your Height: ");
        height=input.nextFloat();
        System.err.print("hello user input your Weight: ");
        weight=input.nextFloat();
        System.err.printf("Hello User, your Age is %.1f\nYour Id is %d\nYour Height is %.2f\nYour Weight is %.2f. ByeBYE!", age,id,height,weight);
    }
}
