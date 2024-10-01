//Karen Au-Yeung: kau-yeung60@stuy.edu, karena101@nycstudents.net
//Kayden Au: kau60@stuy.edu, kaydena6@nycstudents.net

public class ArrayMethods{
  public static void main(String args[]){
	
	//test cases for arrToString
    System.out.println("Expected: [2, 3, 4, 9] vs my function: " + arrToString(new int[] {2, 3, 4, 9}));
	
	//test cases for arrToString
	System.out.println("Expected: [[2, 3, 4], [5, 6, 7], [2, 4, 9]] vs my function: " + arrToString(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}}));
	System.out.println("Expected: [[32, 1, 54], [65, 100, 3], [1111, 542, 19]] vs my function: " + arrToString(new int[][] {{32, 1, 54}, {65, 100, 3}, {1111, 542, 19}}));
	
	//test cases for arr2DSum
    System.out.println("Expected: 42 vs my function: " + arr2DSum(new int[][]{{2, 3, 4}, {5, 6, 7}, {2, 4, 9}}));
	System.out.println("Expected: 1927 vs my function: " + arr2DSum(new int[][]{{32, 1, 54}, {65, 100, 3}, {1111, 542, 19}}));
	
	//test cases for swapRC
    System.out.println("Expected: [[1, 4}, [2, 5], [3, 6]] vs my function: " + arrToString(swapRC(new int[] [] {{1, 2, 3}, {4, 5, 6}})));
	System.out.println("Expected: [[21, 6, 11], [19, 321, 213]] vs my function: " + arrToString(swapRC(new int[] [] {{21, 19}, {6, 321}, {11, 213}})));
	
	//test cases for replaceNegative
	System.out.print("Expected: [[1, 0, 0], [0, 1, 0]] vs my function: "); replaceNegative(new int[][] {{-1, -2, -3}, {-4, -5, -6}});
	System.out.print("Expected: [[1, 2, 0], [0, 1, 3], [1111, 0, 1]] vs my function: "); replaceNegative(new int[][] {{-32, 2, -54}, {-65, -100, 3}, {1111, -542, -19}});
	
	//test cases for copy
	int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}};
	String ans1 = arrToString(copy(arr1));
	System.out.println("Expected: " + arrToString(arr1) + " vs my function: " + ans1);
	arr1[0][0] = 2;
	System.out.println(arrToString(arr1));
	System.out.println(ans1);
	
	int[][] arr2 = new int[][]{{2, 3, 4}, {5, 6, 7}, {2, 4, 9}};
	String ans2 = arrToString(copy(arr1));
	System.out.println("Expected: [[2, 3, 4], [5, 6, 7], [2, 4, 9]] vs my function: " + ans2);
	arr1[0][0] = 2;
	System.out.println(arrToString(arr1));
	System.out.println(ans1);
	}

  public static String arrToString(int[] nums) {
	  String ans = "[";
	  for (int i = 0; i < nums.length; i++) {
		  ans += nums[i];
		  if (i < nums.length - 1) {
			  ans += ", ";
		  }
	  }
	  return ans + "]";
  }

  public static String arrToString(int[][] nums) {
	  String ans = "[";
	  for (int i = 0; i < nums.length; i++){
		  ans += arrToString(nums[i]);
		  if (i < nums.length - 1){
			  ans += ", ";
		  }
	  }
    /*for (int i = 0; i < nums.length; i++) {
      if (i < nums.length - 1) {
        ans += ", ";
        for (int j = 0; j < nums[i].length; j++) {
          ans += nums[i][j];
          if (j < nums[i].length - 1) {
            ans += ", ";
          }
        }
	  }
      ans += "}";
	}
	*/
		return ans + "]";
	}

  public static int arr2DSum(int[][] nums){
	  int sum = 0;
	  for (int i = 0; i < nums.length; i++){
		  for (int j = 0; j < nums[i].length; j++){
			  sum += nums[i][j];
		  }
	  }
	  return sum;
  }

  public static int[][] swapRC(int[][] nums){
	  int[][] ans = new int[nums[0].length][nums.length];
	  for (int i = 0; i < nums.length; i++){
		  for (int j = 0; j < nums[i].length; j++){
			  ans[j][i] += nums[i][j];
		  }
	  }
	  return ans;
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

}
