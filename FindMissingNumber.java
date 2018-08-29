import java.util.Scanner;

public class FindMissingNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		for(int i=0; i<n; i++) {
			int m=in.nextInt();
			int[] b=new int[m-1];
			for(int j=0; j<m-1; j++) {
				b[j]=in.nextInt();
			}
			findmissingnumber(b);
		}
		/*int[] a= {1,2,3,5};
		findmissingnumber(a);*/

	}
	
	public static void findmissingnumber(int[] a) {
		
		int n=a.length+1;
		
		int sum=(n*(n+1))/2;
		int actualSum=0;
		
		for(int i=0; i<n-1; i++) {
			actualSum+=a[i];
	}
	
	int missingNum=sum-actualSum;
	
	System.out.println(missingNum);

}
}
