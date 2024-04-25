package patternPrograms;

public class NumberPatters {
public static void main(String[] args) {
	int n=4;
	System.out.println("--------Box-----------");
	int num1=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {			
			System.out.print(num1+" ");
			num1++;
		}
		System.out.println();
	}
	System.out.println("--------Left Upper-----------");
	for(int i=1;i<=n;i++) {
		int num2=1;
		for(int j=1;j<=n;j++) {	
			if(i>=j) {
				System.out.print(num2+" ");
				num2++;
			}
		}
		System.out.println();
	}
	System.out.println("--------Right Upper-----------");
	for(int i=1;i<=n;i++) {
		int num3=1;
		for(int j=1;j<=n;j++) {	
			if(i+j>=n+1) {
				System.out.print(num3+" ");
				num3++;
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	System.out.println("--------Left Down-----------");
	int num4=4;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {	

			if(i+j<=n+1) {
				System.out.print(num4+" ");
			}
			else {
				System.out.print("  ");
			}
		}
		num4--;
		System.out.println();
	}
	System.out.println("--------Right Down-----------");
	int num5=4;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {	

			if(i<=j) {
				System.out.print(num5+" ");
			}
			else {
				System.out.print("  ");
			}
		}
		num5--;
		System.out.println();
	}
	System.out.println("--------Box2-----------");
	int num6=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {	
			 
			System.out.print(num6+" ");
			num6=num6+n;
		}
		System.out.println();
		num6=i+1;
	}
}
}
