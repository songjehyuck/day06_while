package day06_while;

public class Quiz05 {
	public static void main(String[] args) {
		//���� 1��
		//���� 2��
		//���� 3��
		//���� 4��
		int i=1,sum=0;
		for(i=1; i<=1000; i++) {
			if(i%4==1 && i%6==1) {
				sum+=i;
			}
		}System.out.println("�������� 1�� ���� �� : "+sum);
	}
}
