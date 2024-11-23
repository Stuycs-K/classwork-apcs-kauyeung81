import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class dayFour{
	
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
	
	public static int countNum(ArrayList<String> array){
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
		return maxCount;
	}
	
	public static String reorder(ArrayList<String> array){
		String mostUsed = "";
		ArrayList<Integer> counts = new ArrayList<Integer>();
		ArrayList<String> temp1 = new ArrayList<String>();
		while(array.size() > 0){
			mostUsed = count(array);
			counts.add(countNum(array));
			temp1.add(mostUsed);
			while (array.remove(mostUsed)){}
		}
		//System.out.println(temp1);
		//System.out.println(counts);
		
		//Sorting if ties between letters
		ArrayList<String> temporary = new ArrayList<String>();
		for (int i = 0; i < counts.size()-1; i++){
			if (counts.get(i) == counts.get(i+1)){
				int start = counts.indexOf(counts.get(i));
				int end = counts.lastIndexOf(counts.get(i));
				Collections.sort(temp1.subList(start,end+1));
			}
			
		}
		
		//System.out.println(temp1);
		String temp2 = "";
		for (int i = 0; i < temp1.size(); i++){
			temp2 += temp1.get(i);
		}
		
		return temp2;
	}
	
	public static int solve(ArrayList<String> array, String checksum, int id){
		String reorderedEncrypt = reorder(array);
		int sum = 0;
		if ((reorderedEncrypt.substring(0,5)).equals(checksum)){
			sum = id;
		}
		return sum;
	}


	public static int security (String filename){
		try {
			File file = new File(filename);
			Scanner input = new Scanner(file);
			//String encryptOut = "";
			//ArrayList<String> tempOut = new ArrayList<String>();
			/*String idStr = "";
			int id = 0;
			String checksum = "";*/
			
			ArrayList<Integer> ans = new ArrayList<Integer>();

			while (input.hasNextLine()) {
				String line = input.nextLine();
				//System.out.println(line);
				String[] nums = line.split("-");
				
				//ArrayList<String> encrypt = new ArrayList<String>();
				String encrypt = "";
				ArrayList<String> last = new ArrayList<String>();
				for (int i = 0; i < nums.length; i++){
					if (i != nums.length-1){
						encrypt += (nums[i]);
					}
					else{
						last.add(nums[i]);
					}
				}
				
				//separates encryption into arraylist
				String[] temp1 = encrypt.split("");
				ArrayList<String> temp = new ArrayList<String>();
				for (int i = 0; i < temp1.length; i++){
					temp.add(temp1[i]);
				}
				
				//separates last into id and checksum
				String idStr = "";
				int id = 0;
				String checksum = "";
				for (int i = 0; i < last.get(0).length(); i++){
					if (Character.isDigit(last.get(0).charAt(i))){
						idStr += last.get(0).charAt(i);
					}
					if (Character.isLetter(last.get(0).charAt(i))){
						checksum += last.get(0).charAt(i);
					}
				}
				
				id = Integer.parseInt(idStr);
				
				ans.add(solve(temp, checksum, id));
				//System.out.println(ans);
				
				
				//System.out.println(encrypt);
				//System.out.println(id);
				//System.out.println(checksum);
				
			}
			
			int answer = 0;
			for (int i = 0; i < ans.size(); i++){
				answer += ans.get(i);
			}
			
			return answer;
		} catch (FileNotFoundException e) {
			return -1;
		}
	}
	
	public static void main (String[] args){
		System.out.println(security("adventDay4.txt"));
	}


	}
