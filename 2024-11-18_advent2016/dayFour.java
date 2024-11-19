import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayFour{

	public static int count (String str){
		String[] splitting = str.split("");
		int count = 0;
		int tempCount = 0;
		String mostUsed = "";
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array.length; j++){
				if (array[i].equals(array[j])){
					tempCount++;
				}
				if (tempCount > count){
					count = tempCount;
					mostUsed = array[i];
				}
			}
			return mostUsed;
		}
	}


	public static int security (String filename){
		try {
			File file = new File(filename);
			Scanner input = new Scanner(file);
			int count = 0;
			while (input.hasNextLine()) {
				String line = input.nextLine();
				String[] nums = line.split("-");
				for (int i = 0; i < nums[i].length; i++){
					return -1;
				}
			}
			return count;
		} catch (FileNotFoundException e) {
			return -1;
		}
	}
		
		
	}