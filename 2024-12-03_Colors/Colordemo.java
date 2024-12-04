public class Colordemo{

  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";

  public static int BLACK = 30;
  public static int RED = 31;

  public static void color(int foreground,int background){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
  }

  public static void color(int foreground, int background, int modifier){
    System.out.print("\u001b[" + foreground + ";" + (10+background) + ";" + modifier + "m");
  }

  public static void main(String[] args){
		/*int r = 255;
		int g = 0;
		int b = 0;
		while (g < 256){
			g+=16;
			System.out.print("\u001b[48;2;"+200+";"+255+";"+200+";7m.");
			System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
		}
		while (r > 0){
			r-=16;
			System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
		}
		while (b < 256){
			b+=16;
			System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
		}
		while (g > 0){
			g-=16;
			System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
		}*/
		
    for(int r = 255; r > 0; r-=10){
      for(int g = 0; g < 255; g+=10){
        for(int b = 0; b < 256; b+=10){
          System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
        }
      }
    //System.out.println();
    }

  }
	
}
