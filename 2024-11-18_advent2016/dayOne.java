import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class dayOne{

  public static int solve(String[] movement){
    int direction = 0;
		int xCord = 0;
		int yCord = 0;
		int[] position = new int[]{xCord, yCord};
		int[] dir = new int[]{1,0};
		int moveset = 0;

    for (int i = 0; i < movement.length; i++){
			int move = Integer.parseInt(movement[i].substring(1));
    	if (movement[i].charAt(0) == 'L'){
    		direction--;
    	}
    	if (movement[i].charAt(0) == 'R'){
    		direction++;
    	}
			//System.out.println("dir = " + direction);

			direction = direction % 4;
			if (direction == 0){
				move = move * 1;
				yCord += move;
			}
			if (direction == 1 || direction == -3){
				move = move * 1;
				xCord += move;
			}
			if (direction == 2 || direction == -2){
				move = move * -1;
				yCord += move;
			}
			if (direction == 3 || direction == -1){
				move = move * -1;
				xCord += move;
			}
      //System.out.println(move);
			position = new int[]{xCord, yCord};
			//System.out.println(Arrays.toString(position));
    }

		moveset += Math.abs(position[0]);
		moveset += Math.abs(position[1]);
		return moveset;
  }

	public static int distance(String filename) {
  		try {
        File file = new File(filename);
  			Scanner input = new Scanner(file);
				String in = input.nextLine();
				String[] instructions = in.split(", ");
				input.close();

				int[] position = new int[]{0, 0};
				int[] direction = new int[]{1,0};

        int x = 0;
				int y = 0;
				int output = 0;

				output = solve(instructions);

				return output;

  		} catch (FileNotFoundException e) {
  			return -1;
			}
		}

	public static void main(String[] args){
    System.out.println(distance("adventDay1.txt"));
	}


}
