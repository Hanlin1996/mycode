import java.util.Scanner;

class Ab_V{
	
	public static void main (String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("ÕûÊýÖµ£º");
		int n = stdIn.nextInt();
		
		if (n > 0)
			System.out.println(n);
		else
			System.out.println(-n);
	}
}