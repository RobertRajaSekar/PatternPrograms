package patternPrograms;

public class AllPatterns3 {
public static void main(String[] args) {
	int n=5;
	System.out.println("--------Upper Pyramid-----------");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<n*2;j++) {			
			if( i+j>=n+1 && j-i<=n-1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	System.out.println("--------Left Pyramid-----------");
	for(int i=1;i<=n*2-1;i++) {
		for(int j=1;j<=n;j++) {			
			if( i>=j  &&i+j<=n*2) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	System.out.println("--------Down Pyramid-----------");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<n*2;j++) {			
			if( j>=i && i+j<=n*2) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	System.out.println("--------Right Pyramid-----------");
	for(int i=1;i<=n*2-1;i++) {
		for(int j=1;j<=n;j++) {			
			if(i+j>=n+1 && i-j<=n-1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	System.out.println("--------Diamond-----------");
	for(int i=1;i<=n*2-1;i++) {
		for(int j=1;j<=n*2-1;j++) {			
			if(i+j>=n+1 && j-i<=n-1 && i+j<=n*3-1 && i-j<=n-1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	System.out.println("--------ButterFly-----------");
	for(int i=1;i<=n*2-1;i++) {
		for(int j=1;j<=n*2-1;j++) {			
			if((i>=j && i+j<=n*2) || (i+j>=n*2 &&j>=i)) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	System.out.println("--------Upper pyramid - 2 -----------");//it will work for odd numbers only
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n*2-1;j++) {			
			if( i+j>=n+1 &&(i+j)%2==0 && j-i<=n-1 ) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	System.out.println("--------Down pyramid - 2 -----------");//it will work for odd numbers only
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n*2-1;j++) {			
			if(i-j<=0 &&(i+j)%2==0 && j+i<=n*2) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	System.out.println("--------Timer Hand -----------");//it will work for odd numbers only
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {			
			if(i-j==0 || j+i==n+1 || i==1 || i==n) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
