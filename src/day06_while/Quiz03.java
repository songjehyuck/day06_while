package day06_while;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		//�α��� ���α׷� �����
		Scanner input = new Scanner(System.in);
		String id1,id2 = null,pw1,pw2 = null;
		while(true) {
			System.out.print("1.�α��� \n2.ȸ������ \n3.������ \n>>>");
			int select = input.nextInt();
			switch(select) {
			case 1:
				System.out.println("���̵� �Է� : ");
				id1=input.next();
				System.out.println("��й�ȣ �Է� : ");
				pw1=input.next();
				if(id2.equals(id1)&&pw2.equals(pw1)) {
					System.out.println("���� ���� !!!");
				}else {
					System.out.println("���� ���� !!!");
				}break;
			case 2:
				System.out.println("������ ���̵� �Է�");
				id2=input.next();
				System.out.println("������ ��й�ȣ �Է�");
				pw2=input.next();
				System.out.println("���� �Ϸ�!!!");break;
			case 3:System.out.println("����");
				System.exit(1);
			}
		}
}
}

