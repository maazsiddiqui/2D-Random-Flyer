import java.util.Scanner;

// challenge: "A drone begins flying aimlessly beginning at the origin, (0,0). At each time step, the drone flies one meter
// in a random direction—either north, south, east, or west—with equal probability. In the language of your choosing, write
// a program that takes an integer argument n, representing the number of time steps, and prints the following:
// For each step, the location of the drone, including the starting point (0,0).  
// At the end, the final Euclidean distance (straight, "as the crow flies") from the origin."
// a sample output, with input of n=4:
// (0,0)
// (0,1)
// (0,2)
// (-1,2)
// (-1,3)
// euclidean distance: 3.1622776  // from origin to final point

public class EuclidRandomFlyer {
	
	public static void main(String[] args) {

		int random, x = 0, y = 0;
			
		System.out.print("How many steps to fly: ");
		int steps = new Scanner(System.in).nextInt();
		
		System.out.println("(" + x + "," + y + ")");
		
		while (steps-- > 0) {			
			random = (int) (Math.random() * 4) + 1;
			
			if (random == 1) x++;
			else if (random == 2) x--;
			else if (random == 3) y++;
			else y--;
			
			System.out.println("(" + x + "," + y + ")");
		}
		
		System.out.println("euclidean distance: " + Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
			
	}

}
