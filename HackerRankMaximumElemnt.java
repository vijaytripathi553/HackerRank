package com.practice.aftersisterwedding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class HackerRankMaximumElemnt {

	static List<Integer> list=new ArrayList<Integer>();

	// Method to insert (Push) element into a stack
	private static void push(int elmntToInsrt)
	{

		list.add(elmntToInsrt);
		System.out.println(elmntToInsrt+" "+"got inserted:");
	}
	// Method to delete the element from the stack
	private static void pop()
	{
		if(list.size()>0)
		{
			list.remove(list.size()-1);
			System.out.println("got deleted");
			System.out.println("Element in the list after deletion is"+list);
		}
		else
		{
			System.out.println("No elemnt present in the stack to delete");
		}
	
	}
	// Method to display the max element from the list
	private static int displayMax(List<Integer> list) 
	{
		Collections.sort(list);
		return list.get(list.size()-1) ;
	}
	// Main Method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many test cases you want to test here:");
		int testCase=sc.nextInt();
		for(int i=0; i<testCase; i++) 
		{
			System.out.println("1. Push element into a stack");
			System.out.println("2. Delete element from the stack:");
			System.out.println("3. Display the max element:");
			System.out.println("Enter your choice 1/2/3 :");
			int choice=sc.nextInt();

			if(choice==1)
			{
				System.out.println("Enter element to insert:");
				int elmntToInsrt=sc.nextInt();
				push(elmntToInsrt);

			}
			else if(choice==2)
			{
				pop();

			}
			else
			{
				int maxElement=displayMax(list);
				System.out.println(maxElement);
			}
		}
	}
}	