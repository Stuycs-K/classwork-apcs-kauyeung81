public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
	  public static double distance(Point a, Point b){
		  return (Math.sqrt(Math.pow(a.getX()-b.getX(),2)+(Math.pow(a.getY()-b.getY(),2))));
	  }

	  public static void main(String[]args){
		  Point p1 = new Point(1,1);
		  Point p2 = new Point(-1,-1);
		  Point p3 = new Point(3,4);
		  System.out.println(p3);
		  System.out.println(distance(p1,p2));
		  System.out.println(Point.distance(p1,p2));
		  System.out.println(p1.distanceTo(p2));
		  
		  System.out.println(distance(p2,p3));
		  System.out.println(Point.distance(p2,p3));
		  System.out.println(p2.distanceTo(p3));
		  
		  System.out.println(distance(p3,p1));
		  System.out.println(Point.distance(p3,p1));
		  System.out.println(p3.distanceTo(p1));

    	  //testing 2nd Point constructor
		  Point p4 = new Point(p1);
    	  System.out.println(p4);
    	  Point p5 = new Point(p2);
    	  System.out.println(p5);

    	  //equilateral triangle
    	  Point p1Triangle = new Point(0, 0);
    	  Point p2Triangle = new Point(1, 0);
    	  Point p3Triangle = new Point(0.5, (Math.sqrt(3)/2));
		  System.out.println(distance(p1Triangle, p2Triangle));
		  System.out.println(Point.distance(p2Triangle, p3Triangle));
		  System.out.println(p3Triangle.distanceTo(p1Triangle));
	  }
}