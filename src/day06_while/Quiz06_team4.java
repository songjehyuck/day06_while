package day06_while;

import java.util.Scanner;

public class Quiz06_team4 {
	public static void main(String[] args) {
		//���� 1�� �� ���
		/*
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		//���� 2��
		/*
		for(int hour=1; hour<=23; hour++) {
			for(int min=0; min<=59; min++) {
				System.out.println(hour+"��"+min+"��");
			}
		}
		*/
		//���� 3��
		/*
		Scanner input=new Scanner(System.in);
		int n=1;
		System.out.println("���� �Է��Ͻÿ� : ");
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
				("������"+n+" = ");
				int h =n/2;
				
				for(int l=1; l<=h; l++)
					if(n%l==0)
						System.out.print("���:"+l+",");
				System.out.println("");
			}
		}
		*/
		//���� 4��
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
		//���� 5��
		/*
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			}System.out.println();
		}
		*/

	}
}