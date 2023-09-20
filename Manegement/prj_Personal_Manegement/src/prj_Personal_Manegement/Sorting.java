package prj_Personal_Manegement;

import java.util.ArrayList;

public class Sorting {
	
	static String longestName = "";
	static String shortestName = "";

	public static void main(String[] args) {
		
		ArrayList<Student> Sorting = new ArrayList<Student>();
		
		Student s1 = new Student("Jamie", "Tentler", 16, 001, 12);
		Student s2 = new Student("Nico", "Pergande", 18, 002, 12);
		Student s3 = new Student("Tabea", "Laschen", 17, 003, 12);
		Student s4 = new Student("Tom", "Huppke", 18, 004, 12);
		
		Sorting.add(s1);
		Sorting.add(s2);
		Sorting.add(s3);
		Sorting.add(s4);
		
		longestName = longestName(Sorting);
		shortestName = shortestName(Sorting);
		System.out.println(longestName);
		System.out.println(shortestName);
	}
	

	public static String longestName(ArrayList<Student> pArrayList) {
		
		int elementLength = 0;
		
		for (Student i : pArrayList) {
			if (i.getfirstName().length() > elementLength) {
				elementLength = i.getfirstName().length();
				longestName = i.getfirstName();
			}
		}
/*		System.out.println("Longest Name:");
		
		for (Student i : pArrayList) {
			if (i.getfirstName().length() == elementLength) {
				System.out.println("Name: " + i.getfirstName() + " | " + (i.getfirstName().length() - 1));
				longestName = i.getfirstName();
			}
		}	*/
		return longestName;
	}
	
	public static String shortestName(ArrayList<Student> pArrayList) {
		int elementLength = 10;
		
		for (Student i : pArrayList) {
			if (i.getfirstName().length() < elementLength) {
				elementLength = i.getfirstName().length();
				shortestName = i.getfirstName();
			}
		}
/*		System.out.println("Shortest Name:");
		
		for (Student i : pArrayList) {
			if (i.getName().length() == elementLength) {
				System.out.println("Name: " + i.getName() + " | " + (i.getName().length() - 1));
			}
		}	*/
		return shortestName;
	}
	
	public static void bubblesortName(ArrayList<Student> pArrayList) {
		boolean change = true;
		
		while (change) {
			change = false;
			for (int i = 0; i < pArrayList.size() - 1; i++) {
				if (pArrayList.get(i).getfirstName().length() > pArrayList.get(i + 1).getfirstName().length() ) {
					change = true;
					
					Student studentWithLongestName = pArrayList.get(i);
					pArrayList.set(i, pArrayList.get(i + 1));
					pArrayList.set(i + 1, studentWithLongestName);
				}
			}
		}
	}
	
	public static void bubblesortLongestName(ArrayList<Student> pArrayList) {
		bubblesortName(pArrayList);
		System.out.println(pArrayList.get(pArrayList.size() - 1).getfirstName());
	}
}
