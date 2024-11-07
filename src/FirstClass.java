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
				"%s|%s|%s"+"\n%s|%s|%s"+"\n%s|%s|%s\n", array);
		Boolean isX= true;
		Scanner input= new Scanner(System.in);
		/*void GameOver() {
			System.out.println("Game Over! %s Won!", isX);
		}*/

		while (true) {
			int num_in_Array= input.nextInt();
			while (true) {
				if (num_in_Array>8 || num_in_Array<0) {
					System.out.printf("%s is NOT VALID TRY AGAIN: ", num_in_Array);
				}
				else if (num_in_Array==99) {
					//GameOver();
				}
				else {
				
					if (array[num_in_Array].equals("X") || array[num_in_Array].equals("O")) {
						System.out.printf("%s is TAKEN by %s TRY AGAIN: ", num_in_Array, array[num_in_Array]);											
					}
					else {
						break;
					}
				}
				num_in_Array= input.nextInt();
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
					"%s|%s|%s"+"\n%s|%s|%s"+"\n%s|%s|%s\n", array);
			if (num_in_Array == -1)
			{
				break;
			}
		}
		input.close();
	}

}
