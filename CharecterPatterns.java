package patternPrograms;

public class CharecterPatterns {
	public static void main(String[] args) {
		int n=4;
		System.out.println("--------Box-----------");
		char c1='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {			
				System.out.print(c1+" ");
				c1++;
			}
			System.out.println();
		}
		System.out.println("--------Left Upper-----------");
		for(int i=1;i<=n;i++) {
			char c2='A';
			for(int j=1;j<=n;j++) {	
				if(i>=j) {
					System.out.print(c2+" ");
					c2++;
				}
			}
			System.out.println();
		}
		System.out.println("--------Right Upper-----------");
		for(int i=1;i<=n;i++) {
			char c3='A';
			for(int j=1;j<=n;j++) {	
				if(i+j>=n+1) {
					System.out.print(c3+" ");
					c3++;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------Left Down-----------");
		char c4='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {	

				if(i+j<=n+1) {
					System.out.print(c4+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			c4++;
			System.out.println();
		}
		System.out.println("--------Right Down-----------");
		char c5='D';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {	

				if(i<=j) {
					System.out.print(c5+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			c5--;
			System.out.println();
		}
		System.out.println("--------Upper Pyramid-----------");
		for(int i=1;i<=n;i++) {
			char c6='A';
			for(int j=1;j<n*2;j++) {			
				if( i+j>=n+1 && j-i<=n-1) {
					System.out.print(c6+" ");
					c6++;
				}
				else {
					System.out.print("  ");
				}	
			}
			System.out.println();
		}
	}
}
