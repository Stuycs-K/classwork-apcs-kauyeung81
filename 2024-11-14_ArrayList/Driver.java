import java.util.ArrayList;

public class Driver{
  public static void main(String[] args){
		
		System.out.println("Testing createRandomArray");
    System.out.println(ArrayListPractice.createRandomArray(10).toString());
		
    ArrayList<String> temp1 = ArrayListPractice.createRandomArray(10);
    ArrayListPractice.replaceEmpty(temp1);
    System.out.println("\ntemp1 after replaceEmpty: " + temp1.toString());
    System.out.println("temp3 makeReversedList: " + ArrayListPractice.makeReversedList(temp1).toString());

    ArrayList<String> temp2 = ArrayListPractice.createRandomArray(14);
    ArrayListPractice.replaceEmpty(temp2);
    System.out.println("\ntemp2 after replaceEmpty: " + temp2.toString());
    System.out.println("temp3 makeReversedList: " + ArrayListPractice.makeReversedList(temp2).toString());

    ArrayList<String> temp3 = ArrayListPractice.createRandomArray(7);
    ArrayListPractice.replaceEmpty(temp3);
    System.out.println("\ntemp3 after replaceEmpty: " + temp3.toString());
    System.out.println("temp3 makeReversedList: " + ArrayListPractice.makeReversedList(temp3).toString());
		
		ArrayList<String> temp4 = ArrayListPractice.createRandomArray(200000);
		ArrayListPractice.replaceEmpty(temp4);
    System.out.println("\ntemp4 after replaceEmpty: " + temp4.toString());
    System.out.println("temp4 makeReversedList: " + ArrayListPractice.makeReversedList(temp4).toString());

		System.out.println("\nTesting mixLists");
		System.out.println("mixLists(temp1, temp2): " + ArrayListPractice.mixLists(temp1, temp2));
		System.out.println("mixLists(temp1, temp3): " + ArrayListPractice.mixLists(temp1, temp3));
		System.out.println("mixLists(temp1, temp4): " + ArrayListPractice.mixLists(temp1, temp4));
		System.out.println("mixLists(temp2, temp3): " + ArrayListPractice.mixLists(temp2, temp3));
		System.out.println("mixLists(temp2, temp4): " + ArrayListPractice.mixLists(temp2, temp4));
		System.out.println("mixLists(temp3, temp4): " + ArrayListPractice.mixLists(temp3, temp4));

  }
}