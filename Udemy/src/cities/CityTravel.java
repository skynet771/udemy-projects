package cities;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CityTravel {
	 
	public static void main(String[] args) {
		LinkedList<String> citiesToVisit = new LinkedList<String>();
		/* 
		citiesToVisit.add("Sofia");
		citiesToVisit.add("Vratsa");
		citiesToVisit.add("Burgas");
		citiesToVisit.add("Melnik");*/
		 
		addInOrder(citiesToVisit,"Sofia");
		addInOrder(citiesToVisit,"Aitos");
		addInOrder(citiesToVisit,"Burgas");
		addInOrder(citiesToVisit,"Aitos");
		printList(citiesToVisit);
		//visitForward( "f");
		//printList(citiesToVisit);
		
		
	}
	private static void printList(LinkedList<String> citiesToVisit) {
		Iterator<String> stringIterator = citiesToVisit.iterator();
		
		while(stringIterator.hasNext()) {
			System.out.println("We are at city:"+stringIterator.next());
		}
	}
	
	private static boolean addInOrder(LinkedList<String> linkedList, String newItem) {
		ListIterator<String> stringIterator = linkedList.listIterator();
		while(stringIterator.hasNext()) {
			int compare = stringIterator.next().compareTo(newItem);
		if(compare==0) {
			//two cities are equal , do nothing
			System.out.println("The two cities are equal");
			 return false;
		}else if(compare>0) {
			stringIterator.previous();
			stringIterator.add(newItem);
			return true;
		}else if(compare<0) {
		}
		}
		stringIterator.add(newItem);
		return true;
	}
	
	/*private static void visitForward(String direction) {
		ListIterator<String> stringIterator = citiesToVisit.listIterator();
		boolean goingForward = true;
		for(int i = 0; i <3;i++) {
		 
				if (!goingForward) {
					if (stringIterator.hasNext()) {
						stringIterator.next();
						goingForward = true;
					}
				}
				if (stringIterator.hasNext()) {
					System.out.println("We are at :" + stringIterator.next());
					goingForward = true;
				} else {
					System.out.println("End of the list");
					goingForward = false;
				}
			 
		}
		for(int i = 0; i<2;i++) {
				if(goingForward) {
					if(stringIterator.hasPrevious()) {
						stringIterator.previous();
						goingForward = false;
					}
				} 
				if(stringIterator.hasPrevious()) {
					System.out.println("We are at :"+ stringIterator.previous());
					goingForward = false;
				}else {
					System.out.println("We are at start of the list");
					goingForward = true;
				}
			} 
		 

		 }*/
 		 
	}
	 
