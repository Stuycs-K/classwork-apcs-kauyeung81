import java.util.Arrays;

public class Driver{
//MODIFIERS
public static final int BRIGHT = 1;
public static final int DARK = 2;
public static final int ITALICS = 3;
//COLORS
public static final int BLACK = 30;
public static final int RED = 31;
public static final int GREEN = 32;
public static final int YELLOW = 33;
public static final int BLUE = 34;
public static final int MAGENTA = 35;
public static final int CYAN = 36;
public static final int WHITE = 37;
//CONTROLS
public static final String CLEAR_SCREEN =  "\033[2J";
public static final String HIDE_CURSOR =  "\033[?25l";
public static final String SHOW_CURSOR =  "\033[?25h";

//use this to go back to normal terminal before exiting.
public static final String RESET = "\033[0m"+SHOW_CURSOR;

//use this to convert from color to background (30 to 37 becomes 40 to 47)
public static int  background(int color){
  return color + 10;
}

//terminal specific character to move the cursor to a location
//top left is 1,1
//row is y (higher numbers go down)
//column is x
public static void go(int row,int col){
    System.out.print("\033[" + row + ";" + col + "H");
}

//Overloarded color commands (give 1 or more colors/modifiers)
public static void color(int m){
  System.out.print ("\033[;" + m + "m");
}
public static void color(int m1, int m2){
  System.out.print ("\033["+ m1 + ";" + m2 + "m");
}
public static void color(int m1, int m2, int m3){
  System.out.print ("\033["+ m1 + ";" + m2 + ";" + m3 + "m");
}
public static void color(int m1, int m2, int m3, int m4){
  System.out.print ("\033["+ m1 + ";" + m2 + ";" + m3 + ";"+m4+"m");
}

//And don't forget you can easily delay the printing if needed:
public static void wait(int millis){
  try {
    Thread.sleep(millis);
  }
    catch (InterruptedException e) {
  }
}

//erase (black bakground)
public static void erase(int r, int c, int size){
  go(r,c);
  System.out.print("\033[0m");
  for(int i = 0; i < size;i++){
    System.out.print(" ");
  }
}

public static void main(String[]args){
  System.out.print(CLEAR_SCREEN);
  System.out.print(HIDE_CURSOR);

  //Border
	int i = 0;
	int j = 0;
  for(; i < 30; i++){
    go(i+1,j);
    color(30+i,background(RED));
    System.out.print(" ");
  }
  for(; j < 80; j++){
    go(i,j+1);
    color(30+i,background(RED));
    System.out.print(" ");
  }
  for(; i >= 0; i--){
    go(i,j);
    color(30+i,background(RED));
    System.out.print(" ");
  }
  for(; j >= 0; j--){
    go(i,j);
    color(30+i,background(RED));
    System.out.print(" ");
  }

	int[] arr = new int[3];
	for (int k = 0; k < arr.length; k++){
		arr[k] = (int)(Math.random() * 100);
	}

	System.out.println(RESET);
	//System.out.println(Arrays.toString(arr));
	int col = 28;
  go(2,col);
	for (int a : arr){
		if (a < 25){
			color(BRIGHT, RED);
			System.out.print(a);
			col += 10;
			go(2,col);
		}
		if (a > 75){
			color(BRIGHT, GREEN);
			System.out.print(a);
			col += 10;
			go(2,col);
		}
		if (a > 25 && a < 75){
			color(WHITE);
			System.out.print(a);
			col += 10;
			go(2,col);
		}
	}
  
  go(3,2);
  color(RED);
	for (int a = 2; a < 80; a++){
		System.out.print("-");
	}
	
	int b = 6;
	int c = 28;
	while (b < 8){
		go(b,c);
		color(31,background(RED));
		System.out.println(" ");
		b++;
	}
	
	b = 6;
	c = 48;
	while (b < 8){
		go(b,c);
		color(30+i,background(RED));
		System.out.println(" ");
		b++;
	}
	
	b = 12;
	c = 30;
	while (b < 15){
		go(b,c);
		color(30+i,background(RED));
		System.out.println(" ");
		b++;
	}
	
	b = 12;
	c = 46;
	while (b < 15){
		go(b,c);
		color(30+i,background(RED));
		System.out.println(" ");
		b++;
	}
	
	b = 15;
	c = 30;
	while (c < 47){
		go(b,c);
		color(30+i,background(RED));
		System.out.println(" ");
		c++;
	}
  
  go(31,0);//so the prompt is printed BELOW the other text.
  System.out.println(RESET);
}

}
