package day06_while;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		//���� 1��
		/*
		int rice=100000, mouse=2, day;
		for(day=1; rice>0; day++) {
			rice-=mouse*20;
			if(day%10==0) {
				mouse *=2;
			}
		}
		day--;
		System.out.println(day+"��"+mouse+"����");
		*/
		//���� 2��
		/*
		Scanner input = new Scanner(System.in);
		int num1, num2, max=0, min=0, i=2;
		System.out.println("�� �� �Է�:");
		num1=input.nextInt();
		num2=input.nextInt();
		while(i<=num1&&i<=num2) {
			if(num1%i==0 && num2%i==0)
				min=i;
				i++;
		}
		max=num1*num2/min; //�ּ� ����� ���ϴ� ���
		System.out.println("�ּ� ����� : "+max);
		System.out.println("�ִ� ����� : "+min);
		*/
		//���� 3��
		/*
		Scanner input = new Scanner(System.in);
		int num, cnt=1;
		System.out.println("�� �Է� : ");
		num =input.nextInt();
		while(true) {
			if(num%cnt==0)
				System.out.println(cnt+" ");
			if(num==cnt)
				break;
			cnt++;
		}
		*/
		//���� 4��
		/*
		int i=1,sum=0;
		for(i=1; i<=1000; i++) {
			if(i%4==1 && i%6==1) {
				sum+=i;
			}
		}System.out.println("�������� 1�� ���� �� : "+sum);
		*/
	}
}
