import java.util.Scanner;

public class if_else{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		if(N%2==0){
			if(N>=2 && N<=5){
				System.out.println("Not Wired");
			}
			else if(N>=6 && N<=20){
				System.out.println("Wired");
			}
			else{
				System.out.println("Not Wired");
			}
			
		}
		else
			System.out.println("Wired");
	}
}
