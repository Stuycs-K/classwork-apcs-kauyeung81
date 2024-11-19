import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayTwo{

	//make 2D array?
	public static int bathroom(String filename){
		try {
			File file = new File(filename);
			Scanner input = new Scanner(file);
			int count = 0;
			while (input.hasNextLine()) {
			}
			return count;
		} catch (FileNotFoundException e) {
			return -1;
		}
	}


}