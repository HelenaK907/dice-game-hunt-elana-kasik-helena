import java.util.Scanner;

public class dicegame {
	public static void main  (String[] denckerhelpedusout){

		Scanner number = new Scanner(System.in);
		int dice1=(int)(Math.random()*6)+1;
		int dice2= (int)(Math.random()*6)+1;
		int sum = dice1+dice2;
		System.out.println("roll the dice try to get nine!");
		System.out.println(dice1+"+"+dice2+" = "+sum);
		if (sum == 9){
			System.out.println("You won!");
		}  else {
			System.out.print("You lose!"); }

	}
}
