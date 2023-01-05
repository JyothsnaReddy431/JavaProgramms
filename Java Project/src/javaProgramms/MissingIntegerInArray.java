package javaProgramms;

public class MissingIntegerInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,7,8,9,10};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
      System.out.println(sum);
      int Sum1=0;
      for(int j=1;j<=10;j++) {
    	  Sum1=Sum1+j;
      }
      System.out.println(Sum1);
      System.out.println("Missing numbers is:"+(Sum1-sum));
	}

}
