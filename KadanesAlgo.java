import java.util.Scanner;

public class KadanesAlgo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		for(int i=0; i<n; i++) {
			int m=in.nextInt();
			int[] b=new int[m];
			for(int j=0; j<m; j++) {
				b[j]=in.nextInt();
				
			}
			findMaxSum(b);
		}
		
		/*int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		findMaxSum(a);*/

	}
	
	public static void findMaxSum(int[] a) {
		int start=0, end=0, s=0;
		int max=Integer.MIN_VALUE;
		int maxTemp=0;
		
		for(int i=0; i< a.length; i++) {
			maxTemp=maxTemp+a[i];
			if(max<maxTemp) {
				max=maxTemp;
				start=s;
				end=i;
			}if(maxTemp<0) {
				maxTemp=0;
				s=i+1;
			}
			
		}
		
		System.out.println(max);
		
	}

}
