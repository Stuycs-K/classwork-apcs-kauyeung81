import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Grid{

  public static int move(String move, int direction){
    
  }

  public static int distance(String filename) {
  		try {
  			File file = new File(filename);
  			Scanner input = new Scanner(file);
  			int xCord;
        int yCord;
        int direction = 1;




  			input.close();
  			return count;
  		} catch (FileNotFoundException e) {
  			return -1;
  		}
  	}


}
