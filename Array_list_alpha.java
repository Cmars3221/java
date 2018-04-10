package assigment_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//
//class array_list_methods{
//	
//	
//	public  static String replace(String x) {
//		blah1.add(4, x);
//		System.out.println(blah1);
//	}
//	
//	
//	
//}//end of class;


public class Array_list_alpha {
	
	//Q3
	public  static void  replace( List<String> blah1, String x ) {
		blah1.set(4, x);
		System.out.println(blah1);
	}
	
	//Q4
	public  static void  removing( List<String> blah1 ) {
		blah1.remove(2);
		System.out.println(blah1);
	}
	
	
	//Q5 
	
	public static boolean search(ArrayList<String> listing, String y) {
		for (String c : listing) {
			if (c.equals(y)) return true;
		}
		return false;
	}
	
	
	//6
	 public static ArrayList<String>sorting(ArrayList<String>x){
		 Collections.sort(x);
		 return x;
	 }
	 
  //7
	 public static ArrayList<String> reverse(ArrayList<String> x){
		 Collections.reverse(x);
		 return x; 
	 }
	 
//8 
	 public static ArrayList<String> copy(ArrayList<String> x, ArrayList<String>y){
		 y = new ArrayList<String>(x);
		 remove(x,2);
		 return y;
	 }
	 
	 //9
	 
		public static ArrayList<String> comparing(ArrayList<String> x, ArrayList<String> y) {
			
			Set<String> first = new HashSet<String>(x);
			first.retainAll(y);

			return new ArrayList<String>(first);
			
		}
	 
	 //10
		public static ArrayList<String> appending(ArrayList<String>x, ArrayList<String> y) {
			
			x.addAll(y);
			return x;
		}
		
     //11
		
		public static void looping(ArrayList<String> x) {
			

			for (String y : x) {
				System.out.println("Item : " + y);
			}
			
		
		}
		
		
		//12
		
		public static ArrayList<Object> convert(Object[] x) {
			
			ArrayList<Object> newarr = new ArrayList<Object>();
			for ( Object y : x) {
				newarr.add(y);
			}
			return newarr;
		}
		
	
	
	private static void remove(ArrayList<String> x, int i) {
		if (i < x.size()) {
			x.remove(i);
		}
		
	}

	public static void main(String[] args) {
	//1	
		ArrayList<String> blah1 = new ArrayList<String>();
		blah1.add("Black");
		blah1.add("Charcoal");
		blah1.add("Onxy");
		blah1.add("Carbon");
		blah1.add("Vantablack");
		blah1.add("Ebony");
		
		 System.out.println(blah1);
			
	//2	  
		
		
		for(String x : blah1) {
			System.out.println( "Today's color is: " +x + " !");
		}
		
		
	//3
		
//		Replace method call: 
		replace(blah1,"magenta");
		
	//4   Remove 
		removing(blah1);

		
	//5 Searching
		search(blah1, "orange");
		
		
   //6 
		sorting(blah1);
	
   //7 
		reverse(blah1);
		
   //8 
		copy(blah1, new ArrayList<String>());
		
		
 //9
		ArrayList<String> blah2 = new ArrayList<String>();
		blah2.add("green");
		blah2.add("marble");
		blah2.add("teal");
		blah2.add("aquamarine");
		blah2.add("light_green");
		comparing(blah1, blah2);
		
		
 //10    
		ArrayList<String> blah3 = new ArrayList<String>();
		blah2.add("red");
		blah2.add("rouge");
		blah2.add("pink");
		blah2.add("ruby");
		blah2.add("wine");
		appending(blah1,blah2);
		
//11    
		looping(blah1);
		
//12    
		Integer[] obj_need_array1 = {1,2,3,4,5,6,7};
		
		convert(obj_need_array1);
		
	} //end of main method.
	
}



// ArrayList<Integer> array1 =  new ArrayList<array1> {1,2,3,4} 
//int [] array2={3,21,33,34}

// Set<Integer> set1 = new Set<Integer>(array1)
   // set1.retainAll(array2);
  // return new ArrayList<Integer> (set1);

    

