package day06_while;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		//로그인 프로그램 만들기
		Scanner input = new Scanner(System.in);
		String id1,id2 = null,pw1,pw2 = null;
		while(true) {
			System.out.print("1.로그인 \n2.회원가입 \n3.나가기 \n>>>");
			int select = input.nextInt();
			switch(select) {
			case 1:
				System.out.println("아이디 입력 : ");
				id1=input.next();
				System.out.println("비밀번호 입력 : ");
				pw1=input.next();
				if(id2.equals(id1)&&pw2.equals(pw1)) {
					System.out.println("인증 성공 !!!");
				}else {
					System.out.println("인증 실패 !!!");
				}break;
			case 2:
				System.out.println("저장할 아이디 입력");
				id2=input.next();
				System.out.println("저장할 비밀번호 입력");
				pw2=input.next();
				System.out.println("가입 완료!!!");break;
			case 3:System.out.println("종료");
				System.exit(1);
			}
		}
}
}

