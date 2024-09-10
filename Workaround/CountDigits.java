package Workaround;

// input=>num=124324121, digit->2;
//Output=> 3

//input=>num=124324121, digit->4;
//Output=> 2



public class CountDigits {

	public static int count(int num,int  digit) {
		int countOfDigit=0;
		while(num>0) {
			if(num%10==digit) {
				countOfDigit++;
				num=num/10;
			}
		}
		
		return countOfDigit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(124324121,2));
		System.out.println(count(124324121,4));
	}

}
