import java.util.*;
public class matrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[10][10];

		System.out.print("Enter no. of rows and columns:");
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		System.out.println("Enter First matrix:");
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int s=0;
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				if(i == j)
					s=s+a[i][j];
			}
		}
		System.out.println("Diagoal Entrys sum="+s);
		sc.close();
	}
}