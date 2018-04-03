package assignment_5;

public class AreaCal {

	public static void main(String[] args) {
			int circle( int radius);
			int triangle(int base, int height);
			int square(int side);
			int rectangle(int length, intwidth)
	}
	
	
	
	 public void  circle(int radius) {
			float total = 3.14f * (radius * radius);
			System.out.println(total);
			
		}
	 
	 public void triangle(int base, int height) {
			
		 float total = (float) (0.5*(base*height));
		 System.out.println(total);
		}
	 
	 public void square(int side) {
			
		 int total = (side*side);
		 System.out.println(total);
		}
	 
	 public static void rectangle(int length, int width) {
			int total = (length*width);
		 System.out.println(total);
		}



}


