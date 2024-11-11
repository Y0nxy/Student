import java.util.Scanner;

public class isMoreThanTEN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for variable x: ");
        int x=input.nextInt();
        System.out.print("Enter number for variable y: ");
        int y=input.nextInt();
        System.out.printf("(x<10) && (y<10) is %b\n",(x<10)&&(y<10));
        System.out.printf("(x<10) || (y<10) is %b\n",(x<10)||(y<10));
        
    }
}
