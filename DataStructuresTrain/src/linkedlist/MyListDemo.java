package linkedlist;

import java.util.HashSet;
import java.util.LinkedList;

import hashset.MyHashSet;

public class MyListDemo {
	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		list.add(15);
		list.add(12);
		list.add(12);
		list.add(13);
		list.add(14);
		System.out.println(list.size());
		System.out.println(list.toString());
		System.out.println(list.get(4).toString());
		
		LinkedList<String> original = new LinkedList<>();
		HashSet<String> hash= new HashSet<>();
		
		MyHashSet mySet = new MyHashSet();
		System.out.println("----");
		mySet.add("A");
		mySet.add("B");
		mySet.add("C");
		mySet.add("D");
		mySet.add("E");
		mySet.add("F");
		mySet.add("hf");
		mySet.add("F");
		mySet.add("F");
		mySet.add("asd");
		mySet.add("safdgvb");
		mySet.add("dsfdbb");
		mySet.add("dddd");
		mySet.add("qqq");
		mySet.add("nvnv");
		mySet.add("F");
		mySet.add("dsff");
		mySet.add("312423");
		mySet.add("234");
		mySet.add("hghggh");
		mySet.add("bvnbmn");
		mySet.add("bvsnbmn");
		mySet.add("bvngbmn");
		mySet.add("bvndbmn");
		mySet.add("bvqnbmn");
		mySet.add("768");
		mySet.add("bvn654bmn");
		mySet.add("bvn0-bmn");
		mySet.add("bv67564654654654nbmn");
		mySet.add("bvnbm423423324n");
		mySet.add("bv312424355346nbmn");
		mySet.add("bvnjikujkbmn");
		mySet.add("we");
		mySet.add("sdddd");
		mySet.add("www");
		mySet.add("33");
		mySet.add("");
		mySet.add("wess");
		mySet.add("bvn11bmn");
		mySet.add("bvn3333bmn");
		mySet.add("bv1nbmn");
		mySet.add("bvnb2mn");
		mySet.add("bv  snbmn");
		mySet.add("bvsnb34 mn");
	
		System.out.println(mySet.contains("wess"));
		System.out.println(mySet);
		System.out.println(mySet.size());
		
				
	}
}
