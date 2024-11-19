import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayTwo{

	public static int solve(String str){
		int[][] keypad = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		int xStart = 1, yStart = 1;
		int position = keypad[1][1];
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == 'U'){
				position = keypad[xStart-1][yStart];
			}
			if (str.charAt(i) == 'R'){
				position = keypad[xStart][yStart+1];
			}
			if (str.charAt(i) == 'D'){
				position = keypad[xStart+1][yStart];
			}
			if (str.charAt(i) == 'L'){
				position = keypad[xStart][yStart-1];
			}
		}
		return position;
	}

	public static String bathroom(String filename){
		try {
			File file = new File(filename);
			Scanner input = new Scanner(file);

			//System.out.println(start);
			String output = "";
			int ans = 0;

			while (input.hasNext()) {
				String row = input.next();
				System.out.println("\n" + row);
				ans = solve(row);
				output = output + ans;
			}

			return output;
		} catch (FileNotFoundException e) {
			return null;
		}
	}

	public static void main(String[] args){
		System.out.println(bathroom("adventDay2.txt"));
	}

}
