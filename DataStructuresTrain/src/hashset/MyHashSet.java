package hashset;

import linkedlist.MyLinkedList;

public class MyHashSet {

	private static final int INITIAL_SIZE = 16;
	private MyLinkedList[] table;
	private int tableSize;
	private int usedFields;
	private int elementsNum;
	
	public MyHashSet(){
		this.tableSize = INITIAL_SIZE;
		this.table = new MyLinkedList[INITIAL_SIZE];
		this.usedFields = 0;
	}
	
	public void add(Object data){
		
		int tableIdx =  Math.abs(data.hashCode()) % this.tableSize;
		
		if (table[tableIdx] == null) {
			table[tableIdx] = new MyLinkedList();
			usedFields++;
		}
		//System.out.println(tableIdx);
		
		if (!this.table[tableIdx].contains(data)) {
			table[tableIdx].add(data);
			elementsNum++;	
		}
				
			int tempSize = 0;
			
		if (this.usedFields > this.tableSize * 0.75) {
			tempSize = this.tableSize + (this.tableSize/2) + 1;
			//System.out.println("REHASH");
			rehash(tempSize);
		}
		
	}

	private void rehash(int size) {
		
		MyLinkedList[] tempTable = new MyLinkedList[size];
		int tempUsedfields = 0;
		
		for (int i = 0; i < this.tableSize; i++) {
			if (table[i] != null) {
				for (int j = 0; j < this.table[i].size(); j++) {
					int tableIdx = Math.abs(table[i].get(j).hashCode()) % size;
					//System.out.println(tableIdx);
					
					if (tempTable[tableIdx] == null) {
						tempTable[tableIdx] = new MyLinkedList();
						tempUsedfields++;
					}
					
					tempTable[tableIdx].add(this.table[i].get(j));
				}
			}
					
		}
		
		this.table = tempTable;
		this.usedFields = tempUsedfields;
		this.tableSize = size;
		
	}
	
	public boolean contains(Object data){	
		
		int idx = Math.abs(data.hashCode()) % this.tableSize;	
		
			if (table[idx] != null) {										
					if (table[idx].contains(data)) {
						return true;
					}															
				}

		return false;	
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < this.tableSize; i++) {
			if (table[i] != null) {
				for (int j = 0; j < this.table[i].size(); j++) {
					
					sb.append(table[i].get(j).toString());
					sb.append(" ");					
				}
			}		
		}
		return sb.toString();
	}
	
	public boolean isEmpty(){
		return elementsNum < 1;
	}
	
	public int size(){
		return elementsNum;
	}
	
}
