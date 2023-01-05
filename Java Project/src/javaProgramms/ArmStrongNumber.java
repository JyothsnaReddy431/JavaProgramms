package javaProgramms;

public class ArmStrongNumber {
	
	
	public static void Isarmstrongnumber(int num) {
		int cube=0;
		int r;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("it's not armstrong number");
		}
	}

	public static void main(String[] args) {
		Isarmstrongnumber(153);
		Isarmstrongnumber(371);
		Isarmstrongnumber(370);
		Isarmstrongnumber(0);
	}

}
