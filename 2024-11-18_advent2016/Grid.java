import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Grid{

  public static int move(String move){
		int numMoves;
		int direction;
    if (move.charAt(0) == 'R'){
    	direction = 1;
    }
		else{
			direction = -1;
		}
		numMoves = Integer.parseInt(move.substring(1));
		return (direction * numMoves);
  }
	
	public static int distance(String filename) {
  		try {
  			File file = new File(filename);
  			Scanner input = new Scanner(file);
  			int xCord;
        int yCord;
        int direction = 0;
				if (hasNext()){
					
				}



  			input.close();
  		} catch (FileNotFoundException e) {
  			return -1;
			}
		}
		
	public static void main(String[] args){
		System.out.println(move("R4"));
		System.out.println(move("L4"));
	}


}
