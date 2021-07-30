package day06_while;

public class Quiz05 {
	public static void main(String[] args) {
		//문제 1번
		//문제 2번
		//문제 3번
		//문제 4번
		int i=1,sum=0;
		for(i=1; i<=1000; i++) {
			if(i%4==1 && i%6==1) {
				sum+=i;
			}
		}System.out.println("나머지가 1인 수의 합 : "+sum);
	}
}
