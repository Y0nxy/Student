import java.util.Scanner;

public class FirstClass {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {
				"0","1","2",
				"3","4","5",
				"6","7","8"
		};
		System.out.printf(
				"%s|%s|%s"+"\n%s|%s|%s"+"\n%s|%s|%s\n", (Object[]) array);
		Boolean isX= true;
		Scanner input= new Scanner(System.in);
		/*void GameOver() {
			System.out.println("Game Over! %s Won!", isX);
		}*/

		while (true) {
			float num_in_Array_FLOAT= input.nextFloat();
			int num_in_Array;
			while (true) {
				if (num_in_Array_FLOAT>8 || num_in_Array_FLOAT<0 ||num_in_Array_FLOAT%1!=0) {
					if (num_in_Array_FLOAT%1==0) {
						System.out.printf("%s is NOT VALID TRY AGAIN: ", (int) num_in_Array_FLOAT);
					}
					else {
						System.out.printf("%s is NOT VALID TRY AGAIN: ", num_in_Array_FLOAT);						
					}
				}
				else if (num_in_Array_FLOAT==99) {
					//GameOver();
					//CHECK!
				}
				else {
					num_in_Array = (int) num_in_Array_FLOAT;
					if (array[num_in_Array].equals("X") || array[num_in_Array].equals("O")) {
						System.out.printf("%s is TAKEN by %s TRY AGAIN: ", num_in_Array, array[num_in_Array]);											
					}
					else {
						break;
					}
				}
				num_in_Array_FLOAT= input.nextFloat();
			}
			if (isX) {
				array[num_in_Array] ="X";
				isX=false;
				}
				else {
					array[num_in_Array] ="O";
				isX=true;
				}
			System.out.printf(
					"%s|%s|%s"+"\n%s|%s|%s"+"\n%s|%s|%s\n", (Object[]) array);
			if (num_in_Array == -1)
			{
				break;
			}
		}
		input.close();
	}

}
