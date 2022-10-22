package _05_for_loops._2_badgers;

public class Badgers {
public static void main(String[] args) {
	for (int i = 0; i<3; i++) {
		for (int b = 0;b<10; b++) {
			System.out.println("Badger, ");
		}
		if (i < 2) {
			for (int m = 0;m<2; m++)
			System.out.println("Mushroom, ");
		}
		if (i==2) {
			System.out.println("Snake, ");
		}
	}
}
}
