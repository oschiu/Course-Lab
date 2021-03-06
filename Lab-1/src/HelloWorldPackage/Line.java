/**
 * 
 */
package HelloWorldPackage;

/**
 * @author ochiu
 *
 */
public class Line {
		/* the state of object is defined by values of its data */
		private Point p0;
		private Point p1;
		final Point CONST_POINT = new Point (50,60);

		/* Constructor */
		public Line (double x0, double y0, double x1, double y1) {
			p0 = new Point (x0,y0);
			p1 = new Point (x1,y1);
		};
		
		public Line ( ) {
			p0 = CONST_POINT;
			p1 = CONST_POINT;
		}
		/* the behaviors of an object is defined by its methods */
		public void drawLine () {
			System.out.println("Drawing a line from " + p0 + " to "+ p1); 
			System.out.println("Constant point = " + CONST_POINT);
			if (p0 != null && p1 != null)
				System.out.println("Draw directly from the P0 (" + p0.x + "," + p0.y + ")" + 
									" to P1 (" + p1.x + "," + p1.y + ")");
		}
		
		/* Internal class to defined my own type of Point */
		public class Point {
			private double x = 0;
			private double y = 0;
			
			public Point(double x, double y) {
				this.x = x;
				this.y = y;
			}
			
			@Override
			public String toString() {
				return "(" + x + "," + y + ")";
			}
		}
}



