package day06_while;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int money;
		System.out.println("����� �����ϼ���>>>");
		money = input.nextInt();
		while(true) {
			System.out.println("============Ŀ�� ���Ǳ�============");
			System.out.println();
			System.out.println("1. Ŀ��(200)\t 2. ���ھ�(250)\t 3.��ȯ\t 4.����");
			int select = input.nextInt();
			switch(select) {
			case 1:
				int coffee=200;
				if(money>=coffee) {
					money-=coffee;
					System.out.println("���ְ� �弼��");
				}else{
					System.out.println("����� �����մϴ�.");
				}break;
			case 2:
				int cocoa=250;
				if(money>=cocoa) {
					money-=cocoa;
					System.out.println("���ְ� �弼��");
				}else{
					System.out.println("����� �����մϴ�.");
				}break;
			case 3:
				System.out.println("�Ž����� : "+money);break;
			case 4:System.out.println("����");
				System.exit(1);
			}
		}
		
	}
}
