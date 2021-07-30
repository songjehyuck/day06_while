package day06_while;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int money;
		System.out.println("요금을 투입하세요>>>");
		money = input.nextInt();
		while(true) {
			System.out.println("============커피 자판기============");
			System.out.println();
			System.out.println("1. 커피(200)\t 2. 코코아(250)\t 3.반환\t 4.종료");
			int select = input.nextInt();
			switch(select) {
			case 1:
				int coffee=200;
				if(money>=coffee) {
					money-=coffee;
					System.out.println("맛있게 드세요");
				}else{
					System.out.println("요금이 부족합니다.");
				}break;
			case 2:
				int cocoa=250;
				if(money>=cocoa) {
					money-=cocoa;
					System.out.println("맛있게 드세요");
				}else{
					System.out.println("요금이 부족합니다.");
				}break;
			case 3:
				System.out.println("거스름돈 : "+money);break;
			case 4:System.out.println("종료");
				System.exit(1);
			}
		}
		
	}
}
