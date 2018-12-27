package com.jdksingleList.java;

import java.util.Iterator;
import java.util.LinkedList;

public class main {
	public  static void main(String args[]){
		employee vikashchander = new employee("vikash","chander", 7890);
		employee rahulyadav = new employee("rahul", "yadav", 6780);
		employee vipuljain = new employee("vipul" ,"jain", 8907);
		employee abhishek = new employee("abhishek", "sharma", 89076);

		LinkedList<employee> employeesData = new LinkedList<>();
		employeesData.addFirst(vikashchander);
		employeesData.addFirst(rahulyadav);
		employeesData.addFirst(vipuljain);
		employeesData.addFirst(abhishek);

		Iterator emp = employeesData.iterator();
         System.out.print("HEAD ->");
		while(emp.hasNext()){
			System.out.print(emp.next());
			System.out.print("<=>");
		}
		System.out.println("null");
		System.out.println("remove elements from linklist");
		employeesData.remove(2);
		emp = employeesData.iterator();
		System.out.print("HEAD ->");
		while(emp.hasNext()){
			System.out.print(emp.next());
			System.out.print("<=>");
		}
		System.out.println("null");


		/*for(employee employee : employeesData){
			System.out.println(emp);
		}*/
	}
}
