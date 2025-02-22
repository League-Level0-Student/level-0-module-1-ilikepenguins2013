package _05_for_loops._2_badgers;

public class Badgersong {


	public static void main(String[] args) {
		for(int i=0; i<2; i++) {
			for(int b=0; b<12; b++) {
				System.out.print("Badger");
				if(b<11) {
					System.out.print(", ");
				}
			}
			System.out.println();
			for(int m=0; m<2; m++) {
				System.out.print("Mushroom");
				if(m<1) {
					System.out.print(", ");
				}
			}
			System.out.println();
			System.out.println();
		}
		System.out.println("A snake!!!");

	}

}
