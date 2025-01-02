public class fib{

  public static int fib(int n){
    if (n == 0){
      return n;
    }
    if (n == 1){
      return n;
    }
    else{
      return fib(n-1) + fib(n-2);
    }
  }

  public static void main(String[] args){
    //System.out.println(args[0]);
    int n = Integer.parseInt(args[0]);
    System.out.println(fib(n));
  }

}
