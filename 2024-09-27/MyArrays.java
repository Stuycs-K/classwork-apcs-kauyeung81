public class MyArrays{

  public static void main(Strings[] args){
    int[] array1 = new int[]{1,2,3};
  }

  public static String aryToString(int[] nums){
    String ans = "[";
    for (int i = 0; i < nums.length; i ++){
      ans += nums[i];
      if (i < nums.length-1){
        as += ", ";
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
    for (int i = 0; i < arr1.length; i++){
      arr[i] = arr1[i];
    }
    for (int i = arr1-1, arr2i = 0; arr2i < arr2.length; arr2i++){
      arr[i] = arr2[arr2i];
    }
    return arr;
  }

}
