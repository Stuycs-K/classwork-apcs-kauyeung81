public class ArrayMethods{
  public static void main(String args[]){
    //System.out.println("Expected: [2, 3, 4, 9] vs my function: " + aryToString(new int[2, 3, 4, 9]));
	System.out.println("Expected: {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}} vs my function: " + arrToString(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}} ));
    System.out.println("Expected: 42 vs my function: " + arr2DSum(new int[][]{{2, 3, 4}, {5, 6, 7}, {2, 4, 9}}));
    //System.out.println("Expected: {{1, 4}, {2, 5}, {3, 6}} vs my function: " + swapRC(new int[] [] {{1,2,3},{4,5,6}}));
	}

  public static String aryToString(int[] nums) {
	  String ans = "{";
	  for (int i = 0; i < nums.length; i++) {
		  ans += nums[i];
		  if (i < nums.length - 1) {
			  ans += ", ";
		  }
	  }
	  return ans + "}";
  }

  public static String arrToString(int[][] nums) {
	  String ans = "{";
	  for (int i = 0; i < nums.length; i++){
		  ans += aryToString(nums[i]);
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
		return ans + "}";
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

  /*public static int[][] swapRC(int[][] nums){
	  int[][] ans = new int[nums[0]][2];
	  for (int i = 0; i < nums[i].length; i ++){
		  for (int j = 0; j < nums.length; j++){
			  ans[i][j] += nums[i][j];
		  }
	  }
	  return ans;
  }*/

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
    return null;//placeholder so it compiles
  }

}
