import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

    //comparing built-in vs my function
    int[] arr1 = new int[] {1, 2, 3};
    System.out.println("Built-in toString function: " + Arrays.toString(arr1) + " vs my function: " + arrToString(arr1));
    int[] arr2 = new int[] {123, 4319, 12398, 10, 1, 232};
    System.out.println("Built-in toString function: " + Arrays.toString(arr2) + " vs my function: " + arrToString(arr2));

    //countZeros2D test cases
    int[][] arr3 = new int[][] {{1, 2, 0}, {0, 2, 1}};
    System.out.println("Expected: 2 vs my function: " + countZeros2D(arr3));
    int[][] arr4 = new int[][] {{0, 0, 1}, {100, 0, 1}, {1, 421, 0}, {213, 320, 10}};
    System.out.println("Expected: 4 vs my function: " + countZeros2D(arr4));
    int[][] arr5 = new int[][] {{1, 10}, {231, 0}, {0, 0}, {20, 0}};
    System.out.println("Expected: 4 vs my function: " + countZeros2D(arr5));
	
	//arr2DSum test cases
	int[][] arr6 = new int[][] {{-321, 123, -53}, {65, -31, -31}, {-95, -95, -95}};
	System.out.println("Expected: -533 vs my function: " + arr2DSum(arr6));
	System.out.println("Expected: 1057 vs my function: " + arr2DSum(arr4));
	
	//replaceNegative test cases
	System.out.print("Expected: [[1, 123, 0], [65, 1, 0], [0, 0, 1]] vs my function: "); replaceNegative(arr6);
	int[][] arr7 = new int[][] {{2, -1}, {32, -1}, {31, -31}};
	System.out.print("Expected: [[2, 0], [32, 1], [31, 0]] vs my function: "); replaceNegative(arr7);
	
	//copy test cases
	String copyarr5 = arrToString(copy(arr5));
	System.out.println("Expected: " + arrToString(arr5) + " vs my function: " + copyarr5);
	arr5[0][1] = -10000;
	arr5[3][0] = -10000;
	System.out.println(arrToString(arr5));
	System.out.println(copyarr5);
	
	String copyarr7 = arrToString(copy(arr7));
	System.out.println("Expected: " + arrToString(arr7) + " vs my function: " + copyarr7);
	arr7[1][1] = -10000;
	arr7[2][0] = -10000;
	System.out.println(arrToString(arr7));
	System.out.println(copyarr7);
	
	//swapRC test cases
	System.out.println("Expected: [[0, 100, 1, 213], [0, 0, 321, 320], [1, 1, 0, 10]] vs my function: " + arrToString(swapRC(arr4)));
	System.out.println("Expected: [[-321, 65, -95], [123, -31, -95], [-53, -31, -95]] vs my function: " + arrToString(swapRC(arr6)));
	
	//htmlTable test cases
	System.out.println("Expected: <table><tr><td>1</td><td>2</td><td>0</td></tr><tr><td>0</td><td>2</td><td>1</td></tr></table> vs my function: " + htmlTable(arr3));
	int[][] arr8 = new int[][] {{1,2},{3}};
	System.out.println("Expected: <table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table> vs my function: " + htmlTable(arr8));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String ans = "[";
	  for (int i = 0; i < ary.length; i++) {
		  ans += ary[i];
		  if (i < ary.length - 1) {
			  ans += ", ";
		  }
	  }
	  return ans + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String ans = "[";
	  for (int i = 0; i < ary.length; i++){
		  ans += arrToString(ary[i]);
		  if (i < ary.length - 1){
			  ans += ", ";
		  }
	  }
    return ans + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++){
      for (int j = 0; j < nums[i].length; j++){
        if (nums[i][j] == 0){
          sum += 1;
        }
      }
    }
    return sum;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][] nums){
	  int sum = 0;
	  for (int i = 0; i < nums.length; i++){
		  for (int j = 0; j < nums[i].length; j++){
			  sum += nums[i][j];
		  }
	  }
	  return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
	  for (int i = 0; i < vals.length; i++) {
		  for (int j = 0; j < vals[i].length; j++) {
			  if (j == i && vals[i][j] < 0) {
				  vals[i][j] = 1;
			  }
			  if (vals[i][j] < 0) {
				  vals[i][j] = 0;
			  }
		  }
	  }
	  System.out.println(arrToString(vals));
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
	  int[][] ans = new int[nums.length][nums[0].length];
	  for (int i = 0; i < nums.length; i++){
		  for (int j = 0; j < nums[i].length; j++){
			  ans[i][j] = nums[i][j];
		  }
	  }
	  return ans;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][] nums){
	  int[][] ans = new int[nums[0].length][nums.length];
	  for (int i = 0; i < nums.length; i++){
		  for (int j = 0; j < nums[i].length; j++){
			  ans[j][i] += nums[i][j];
		  }
	  }
	  return ans;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
	  String ans = "<table><tr>";
	  for (int i = 0; i < nums.length; i++){
		  for (int j = 0; j < nums[i].length; j++){
			  ans += "<td>";
			  ans += nums[i][j];
			  ans += "</td>";
		  }
		  ans += "</tr>";
	  }
    return ans + "</table>";
  }
}
