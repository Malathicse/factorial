import java.util.Scanner;

public class Factorial {

	
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a number");
		int number=scr.nextInt();
		int num=number;
		while(number>1){
			num=num*(number-1);
			number--;
		}
		System.out.println(num);
		}

}

