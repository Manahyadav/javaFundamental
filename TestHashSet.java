package com.collection;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Manah");
		hashSet.add("yadav");
		hashSet.add("shiv");
		hashSet.add("ram");
		System.out.println(hashSet);
		hashSet.add("Manah");
		System.out.println(hashSet);

	}

}
