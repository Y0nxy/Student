import java.util.Scanner;

public class GreaterTHAN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for variable x: ");
        int x=input.nextInt();
        System.out.print("Enter number for variable y: ");
        int y=input.nextInt();
        System.out.printf("x<y is %b\n",x<y);
        System.out.printf("x>y is %b\n",x>y);
        System.out.printf("x<=y is %b\n",x<=y);
        System.out.printf("x>=y is %b\n",x>=y);
        System.out.printf("x==y is %b\n",x==y);
        System.out.printf("x!=y is %b",x!=y);
        
        
    }
}
