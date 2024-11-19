import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayOne{

  public static int solve(String movement, int d){
    int direction = d;
    if (movement.charAt(0) == 'L'){
      direction--;
    }
    if (movement.charAt(0) == 'R'){
      direction++;
    }
		return direction;
  }

	public static int distance(String filename) {
  		try {
        File file = new File(filename);
  			Scanner input = new Scanner(file);
        int x = 0; y = 0; direction = 0;

        while (input.hasNext()){
          String movement = input.next();
          direction = solve(movement, direction);

        }

  		} catch (FileNotFoundException e) {
  			return -1;
			}
		}

	public static void main(String[] args){
    System.out.println()
	}


}
