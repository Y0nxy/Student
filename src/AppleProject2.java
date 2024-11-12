import java.util.Scanner;

public class AppleProject2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        float Apple_Price = 1.5f;
        System.out.println("input how many apples you bought: ");
        int Apple_Amount = input.nextInt(); //input from roomate
        int ApplesIbuy= 6; // 6 apples i bought
        int sum = Apple_Amount +ApplesIbuy; //all apples
        System.out.printf("You bought %d Apples & paid %.2f",sum, sum*Apple_Price);
        input.close();
    }
}
