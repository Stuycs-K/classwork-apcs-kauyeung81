import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayThree{

	//Part A
	public static boolean checkTriangle(int a, int b, int c) {
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			return true;
		} else {
			return false;
		}
	}

	public static int countTrianglesA(String filename) {
		try {
			File file = new File(filename);
			Scanner input = new Scanner(file);
			int count = 0;
			while (input.hasNextLine() && input.hasNextInt()) {
				int a = input.nextInt();
				int b = input.nextInt();
				int c = input.nextInt();
				if (checkTriangle(a, b , c)) {
					count++;
				}
			}
			input.close();
			return count;
		} catch (FileNotFoundException e) {
			return -1;
		}
	}

  public static int countTrianglesB (String filename) {
		try {
			File file = new File(filename);
			Scanner input = new Scanner(file);
			int count = 0;
			while (input.hasNextLine() && input.hasNextInt()) {
				int a1 = input.nextInt();
				int b1 = input.nextInt();
				int c1 = input.nextInt();
				int a2 = input.nextInt();
				int b2 = input.nextInt();
				int c2 = input.nextInt();
				int a3 = input.nextInt();
				int b3 = input.nextInt();
				int c3 = input.nextInt();
				if (checkTriangle(a1, a2, a3)){
					count ++;
				}
				if (checkTriangle(b1, b2, b3)){
					count ++;
				}
				if (checkTriangle(c1, c2, c3)){
					count ++;
				}
			}
			input.close();
			return count;
		} catch (FileNotFoundException e) {
			return -1;
		}
	}

	public static void main(String[] args) {
		//Testing part a
		//System.out.println(countTrianglesA("inputTri.txt"));
		//Testing part break;
		System.out.println(countTrianglesB("adventDay3.txt"));
	  }

}
