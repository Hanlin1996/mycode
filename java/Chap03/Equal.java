/*
�ж��������Ƿ����
x == y ��x��y���ʱ�����Ϊtrue
x != y ��x��y�����ʱ�����Ϊtrue
*/
import java.util.Scanner;

class Equal {

	public static void main (String[] args){
		Scanner stdIn = new Scanner (System.in);
		
		System.out.print("����a��"); int a = stdIn.nextInt();
		System.out.print("����b��"); int b = stdIn.nextInt();
		
		if (a != b)
			System.out.println("����ֵ�����");
		else
			System.out.println("����ֵ���");
	}
}