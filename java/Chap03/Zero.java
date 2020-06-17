//判断键盘输入的数值是否为0

import java.util.Scanner;

class Zero{
	
	public static void main (String[] args){
		Scanner stdIn = new Scanner (System.in);
		
		System.out.print("整数值：");
		int n = stdIn.nextInt();
		
		if (!(n != 0))
			System.out.print("是0");
		else
			System.out.print("不是0");
	}
}
/**
程序控制

熟练 
1.类/对象的继承/多态/抽象/封装
2.集合框架：ArrayList/LinkedList/HashMap/HashSet

自己要写的东西：
1.链表
2.单例模式和工厂模式

*/