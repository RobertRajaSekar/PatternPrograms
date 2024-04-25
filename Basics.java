package patternPrograms;

public class Basics {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1 || j==4) {
					System.out.print("* ");//1space
				}
				else {
					System.out.print("  ");//2spaces --> cause of in if statement we pass one space 
				}
			}
			System.out.println();
		}	
	System.out.println("");
	
	}
}
