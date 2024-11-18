import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {

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

	//Part B
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

	public static int countTrianglesX (String filename){
		try {
			File file = new File(filename);
			Scanner input = new Scanner(file);
			int count = 0;
			while (input.hasNextLine()) {
				String line = input.nextLine();
				String[] nums = line.split("x");
				int a = Integer.parseInt(nums[0]);
				int b = Integer.parseInt(nums[1]);
				int c = Integer.parseInt(nums[2]);
				if (checkTriangle(a, b , c)) {
					count++;
				}
			}
			return count;
		} catch (FileNotFoundException e) {
			return -1;
		}
	}

	public static void main(String[] args) {
		//Testing part a
		//System.out.println(countTrianglesA("inputTri.txt"));
		//Testing part break;
		System.out.println(countTrianglesB("inputTri.txt") + " should be 95");
		System.out.println(countTrianglesX("inputTriX.txt") + " should be 1");
		System.out.println(countTrianglesA("adventDay3.1.txt"));
		System.out.println(countTrianglesB("adventDay3.1.txt"));
	  }

}
