package ArrayList;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ArrayListMethodsUsuage {
	public List<Integer> list =null;
	public ArrayList<Integer> arrList =null;
	public ArrayList arrList1 =  null;
	public List<Integer> capList =null;
	public List<Integer> capList_1 =null;

	@BeforeTest
	public void init() {
		//We can create object of array in any one of the following way
		
		//1 List is interface and it's reference stores ArrayList object 
		list = new ArrayList<>();

		//2 : With generics as integer; we can specify any generic like String, Float etc
		arrList = new ArrayList<>();

		//3 No generics and no < > brackets; most of the time generics are specified
		arrList1 = new ArrayList();

		//4 We can declare capacity of the arrayList (capacity is not size but memory)
		capList = new ArrayList<>(2); // it accepts more than 2 values also

		//5 By default capacity is 10, adding only one value to this will create a capacity of 10 memory
		capList_1 = new ArrayList<>(); 
	}

	@Test
	public void addMethods() {

		//Use overloaded add methods in list reference
		list.add(18);  // adding value to list refernce at index 0
		list.add(23);  // adding value to list refernce at index 1
		list.add(1, 44);  // Override the value present at index 1 and update old value with new value 

		//print all values added above inside array

		System.out.print("1. All values in array format : "+list); // Output: [18, 44, 23]

		//get the values one by one using get method

		System.out.println("\n2. get value using GET method : "+list.get(0)); // gives you first index value

		//Print values using for each loop
		System.out.print("3. Values present in list using for each loop : ");
		for(Integer a:list) {
			System.out.print(a+" ");

		}

		//Print values using for loop
		System.out.print("\n4. Values present in list using for loop : ");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");

		}
	}

	@Test
	public void arrayCapacity() {
		capList.add(12);
		capList.add(345);
		capList.add(2156);

		System.out.println(capList);
	}

}
