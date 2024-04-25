package patternPrograms;

public class AllPatterns2 {
	public static void main(String[] args) {
		int n=4;

		System.out.println("------------Left Upper Triangle-----------------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------------Right Lower Triangle-----------------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i<=j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------------Left Lower Triangle-----------------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j<=n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------------Right Upper Triangle-----------------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j>=n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------Combination of LeftUpper&RightUpper-----------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2-1;j++) {			//or j<n*2
				if(i>=j || i+j>=n*2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------Combination of LeftDown&RightDown-----------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n*2;j++) {			
				if( i+j<=n+1 || j-i>=n-1) {
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
