package patternPrograms;

public class AllPattern1 {
	public static void main(String[] args) {
		int n=7;

		System.out.println("------------Primary Diagonal-----------------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------Secondary Diagonal----------------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j==n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
}
		System.out.println("--------combine Primary and Secondary Diagonal----------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {			
				if(i==j || i+j==n+1) {		//if you put n=5or7or any odd number you will get proper X 
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
}
		System.out.println("--------Upward Arrow----------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j || i==1 || j==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
}
		System.out.println("--------Downward Arrow----------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j || i==n || j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
}
		System.out.println("--------RightUpward Arrow----------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j==n+1 || i==1 || j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
}
		System.out.println("--------LeftDownward Arrow----------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j==n+1|| i==n || j==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
}
		System.out.println("--------BoxCombineBothDiagonals----------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j || i+j==n+1|| i==1 || j==1 ||i==n ||j==n) {
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
