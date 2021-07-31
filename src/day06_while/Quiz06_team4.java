package day06_while;

import java.util.Scanner;

public class Quiz06_team4 {
	public static void main(String[] args) {
		//문제 1번 별 찍기
		/*
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		//문제 2번
		/*
		for(int hour=1; hour<=23; hour++) {
			for(int min=0; min<=59; min++) {
				System.out.println(hour+"시"+min+"분");
			}
		}
		*/
		//문제 3번
		/*
		Scanner input=new Scanner(System.in);
		int n=1;
		System.out.println("수를 입력하시오 : ");
		n=input.nextInt();
		for(;n>=1 ; n--) {
			int sum=0;
			int k=n/2;
			
			for(int j=1; j<=k; j++) {
				if(n%j==0) 
					sum=sum+j;
			}
			if(n==sum) {
				System.out.print
				("완전수"+n+" = ");
				int h =n/2;
				
				for(int l=1; l<=h; l++)
					if(n%l==0)
						System.out.print("약수:"+l+",");
				System.out.println("");
			}
		}
		*/
		//문제 4번
		/*
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=3-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=2*i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		//문제 5번
		/*
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			}System.out.println();
		}
		*/

	}
}