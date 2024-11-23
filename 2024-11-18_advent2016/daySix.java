import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class daySix{
	
	public static String count(ArrayList<String> array){
		String mostUsed = "";
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < array.size(); i++){
			count = 1;
			for (int j = 0; j < array.size(); j++){
				if (array.get(i).equals(array.get(j))){
					count++;
				}
				if (count > maxCount){
					maxCount = count;
					mostUsed = array.get(i);
				}
			}
		}
		return mostUsed;
	}

	public static String signal(String filename){
		try {
			File file = new File(filename);
			Scanner input = new Scanner(file);
			String signal = "";
			int count = 0;
			ArrayList<String> first = new ArrayList<String>();
			ArrayList<String> second = new ArrayList<String>();
			ArrayList<String> third = new ArrayList<String>();
			ArrayList<String> fourth = new ArrayList<String>();
			ArrayList<String> fifth = new ArrayList<String>();
			ArrayList<String> sixth = new ArrayList<String>();
			ArrayList<String> seventh = new ArrayList<String>();
			ArrayList<String> eighth = new ArrayList<String>();
			
			while (input.hasNextLine()) {
				String nextLine = input.nextLine();
				
				first.add(nextLine.substring(0,1));
				second.add(nextLine.substring(1,2));
				third.add(nextLine.substring(2,3));
				fourth.add(nextLine.substring(3,4));
				fifth.add(nextLine.substring(4,5));
				sixth.add(nextLine.substring(5,6));
				seventh.add(nextLine.substring(6,7));
				eighth.add(nextLine.substring(7));
				
			}
			String firstLetter = count(first);
			String secondLetter = count(second);
			String thirdLetter = count(third);
			String fourthLetter = count(fourth);
			String fifthLetter = count(fifth);
			String sixthLetter = count(sixth);
			String seventhLetter = count(seventh);
			String eighthLetter = count(eighth);
			//System.out.println(eighth);
			signal = firstLetter + secondLetter + thirdLetter + fourthLetter + fifthLetter + sixthLetter
				+ seventhLetter + eighthLetter;
			return signal;
		} catch (FileNotFoundException e) {
			return null;
		}
	}
		
	public static void main (String[] args){
		ArrayList<String> test = new ArrayList<String>();
		test.add("f");
		test.add("g");
		test.add("g");
		test.add("v");
		test.add("r");
		//System.out.println(count(test));
		System.out.println(signal("adventDay6.txt"));
	}
		
	}