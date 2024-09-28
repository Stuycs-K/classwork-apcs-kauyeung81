public class MyArrays{

  public static void main(String args[]){
	  int[] array1 = new int[]{1,2,3};
	  int[] array2 = new int[]{4,5,6};
	  int[] array3 = new int[]{100,200,300,400,500};
	  int[] array4 = new int[]{1000,2000,3000,4000,5000,6000};
	  System.out.println("Expected: [1, 2, 3] " + "aryToString function: " + (aryToString(array1)));
	  
	  System.out.println("Expected: [1, 2, 3] " + "returnCopy function: " + (aryToString(returnCopy(array1))));
	  System.out.println("Expected: [4, 5, 6] " + "returnCopy function: " + (aryToString(returnCopy(array2))));
	  System.out.println("Expected: [100, 200, 300, 400, 500] " + "returnCopy function: " + (aryToString(returnCopy(array3))));
	  System.out.println("Expected: [1000, 2000, 3000, 4000, 5000, 6000]" + "returnCopy function: " + (aryToString(returnCopy(array4))));
	  
	  System.out.println("Expected: [1, 2, 3, 4, 5, 6] " + "concatArray function: " + (aryToString(concatArray(array1, array2))));
	  System.out.println("Expected: [4, 5, 6, 100, 200, 300, 400, 500] " + "concatArray function: " + (aryToString(concatArray(array2, array3))));
	  System.out.println("Expected: [100, 200, 300, 400, 500, 1000, 2000, 3000, 4000, 5000, 6000] " + "concatArray function: " + (aryToString(concatArray(array3, array4))));
  }

  public static String aryToString(int[] nums){
	  String ans = "[";
	  for (int i = 0; i < nums.length; i ++){
		  ans += nums[i];
		  if (i < nums.length-1){
			  ans += ", ";
		  }
	  }
	  return (ans + "]");
  }

  public static int[] returnCopy(int[]ary){
	  int[] copy = new int[ary.length];
	  for (int i = 0; i < ary.length; i++){
		  copy[i] = ary[i];
	  }
	  return copy;
  }

  public static int[] concatArray(int[]ary1, int[]ary2){
	  int[] arr = new int[ary1.length + ary2.length];
      for (int i = 0; i < ary1.length; i++){
        arr[i] = ary1[i];
      }
      for (int i = ary1.length, arr2i = 0; arr2i < ary2.length; i++, arr2i++){
        arr[i] = ary2[arr2i];
      }
      return arr;
    }

}
