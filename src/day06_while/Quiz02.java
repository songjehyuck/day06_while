package day06_while;

public class Quiz02 {
	public static void main(String[] args) {
		//���� 1��
		/*
		int money=0;
		for(int day=1; day<=30;day++) {
			if(day==1) {
				money=1;
			}else {
				money*=2;
			}System.out.println(day+" : "+money);
		}
		System.out.println("30��° ��ġ �ݾ� : "+money);
		*/
		//���� 2��
		/*
		int i=0, sum=0, sum1=0;
		for(i=1; i<1000; i++) {
			if(i%3==0&&i%5!=0) {
				sum1+=i;
			sum+=i;
			}
			sum=sum-sum1;
			System.out.println(sum);
			
		}
		*/
		
		//���� 3��
		/*
		int num=1, sum=0;
		for( ; ; num++) {
				if(num%2==1) {
					sum+=num;
				}
				if(sum>=10000)break;
				//System.out.println(num+" : "+sum);
			}
			System.out.println(num+" : "+sum);
			*/
	}
		
}
	
