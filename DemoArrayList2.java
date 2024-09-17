package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList2 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		System.out.println(arrayList);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		System.out.println(arrayList);
////		arrayList.add(0,5);
//		System.out.println(arrayList);
//		
//		for (int i = 0 ; i < arrayList.size(); i++) {
//			System.out.println("the element is = " + arrayList.get(i));	
//		}
		
//		for (Integer integer : arrayList) {
//			System.out.println("for each loop = " + integer);	
//		}
		
		Iterator itr = arrayList.iterator();
		
		while (itr.hasNext()) {
			System.out.println("Iterator = "+ itr.next());
			
		}
		
	

		
		
		
		
		
		
		
		
		
		
		
//		int n = 10;
//		for (int i = arrayList.size() - 1 ; i < n; i++) {
//	
//			System.out.println("the element is = " + arrayList.get(i));	
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ArrayList<Integer> arrayList2 = new ArrayList<>();
//		arrayList2.add(102);
//		arrayList2.add(204);
//		System.out.println(arrayList2);
//		arrayList.addAll(arrayList2);
//		System.out.println(arrayList);
//		System.out.println(arrayList2.get(1));
//		System.out.println(arrayList.contains(103));		//to check value is there in array
//		System.out.println(arrayList.set(1, 89));		//to set value at index
//		System.out.println(arrayList);
//		arrayList.remove(0);			//for remove
//		System.out.println(arrayList);
//		arrayList.clear();				//for clear
//		System.out.println(arrayList);
	}

}
