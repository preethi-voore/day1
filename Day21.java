import java.util.*;
public class Day21 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //input size
		int[] a=new int[n];
		int max_value=0;
		for(int i=0;i<n ;i++) {
			a[i]=sc.nextInt();	
		}
		for(int i=0;i<n-1;i++) {
			for (int j=i+1;j<n;j++) {
				if ((a[j]>a[i])&&((a[j]-a[i])>max_value)) {
					max_value=a[j]-a[i];
				}
			}
			
		}
		System.out.println(max_value);
	}

}
