/*
判断两个数是否相等
x == y 当x和y相等时，结果为true
x != y 当x和y不相等时，结果为true
*/
import java.util.Scanner;

class Equal {

	public static void main (String[] args){
		Scanner stdIn = new Scanner (System.in);
		
		System.out.print("整数a："); int a = stdIn.nextInt();
		System.out.print("整数b："); int b = stdIn.nextInt();
		
		if (a != b)
			System.out.println("两个值不相等");
		else
			System.out.println("两个值相等");
	}
}