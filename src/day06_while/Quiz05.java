package day06_while;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		//문제 1번
		/*
		int rice=100000, mouse=2, day;
		for(day=1; rice>0; day++) {
			rice-=mouse*20;
			if(day%10==0) {
				mouse *=2;
			}
		}
		day--;
		System.out.println(day+"일"+mouse+"마리");
		*/
		//문제 2번
		/*
		Scanner input = new Scanner(System.in);
		int num1, num2, max=0, min=0, i=2;
		System.out.println("두 수 입력:");
		num1=input.nextInt();
		num2=input.nextInt();
		while(i<=num1&&i<=num2) {
			if(num1%i==0 && num2%i==0)
				min=i;
				i++;
		}
		max=num1*num2/min; //최소 공배수 구하는 방법
		System.out.println("최소 공배수 : "+max);
		System.out.println("최대 공약수 : "+min);
		*/
		//문제 3번
		/*
		Scanner input = new Scanner(System.in);
		int num, cnt=1;
		System.out.println("수 입력 : ");
		num =input.nextInt();
		while(true) {
			if(num%cnt==0)
				System.out.println(cnt+" ");
			if(num==cnt)
				break;
			cnt++;
		}
		*/
		//문제 4번
		/*
		int i=1,sum=0;
		for(i=1; i<=1000; i++) {
			if(i%4==1 && i%6==1) {
				sum+=i;
			}
		}System.out.println("나머지가 1인 수의 합 : "+sum);
		*/
	}
}
