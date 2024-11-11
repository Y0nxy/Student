import java.util.Scanner;

public class CalcFunc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int price_C =11;
		int price_P = 100;
		System.out.print("Amount of Choclate: ");
		int  amount_Choclate = input.nextInt();
		System.out.print("Amount of Pistok in Kg: ");
		float amount_Pistok = input.nextFloat();
		float SumOrder =  amount_Choclate*price_C +amount_Pistok*price_P;
		
		System.out.println(SumOrder);
		input.close();		
	}

}
