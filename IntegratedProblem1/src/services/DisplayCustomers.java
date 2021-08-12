package services;

import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import model.Customr;

public class DisplayCustomers {

	public static void displayCustomers(LinkedList<Customr> list) {
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Customr c = (Customr) itr.next();
			System.out.println("================");
			System.out.println("account number : " + c.getAcNo() + " \ncustomer name : " + c.getName()
					+ " \naccount type : " + c.getAcType() + " \naccount balance : " + c.getBalance()
					+ " \ncustomer address : " + c.getAddress());
			System.out.println("================");
		}
	}

	public static void displayCustomers(List<Customr> list) {
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Customr c = (Customr) itr.next();
			System.out.println("================");
			System.out.println("account number : " + c.getAcNo() + " \ncustomer name : " + c.getName()
					+ " \naccount type : " + c.getAcType() + " \naccount balance : " + c.getBalance()
					+ " \ncustomer address : " + c.getAddress());
			System.out.println("================");
		}
	}

	public static void displayByBalance(LinkedList<Customr> list) {
		List<Customr> list1 = list.stream().filter(predicate -> predicate.getBalance() != 0)
				.collect(Collectors.toList());
		displayCustomers(list1);
	}

	public static void displayByName(LinkedList<Customr> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.next();
		List<Customr> list1 = list.stream().filter(predicate -> predicate.getName().equals(name))
				.collect(Collectors.toList());
		displayCustomers(list1);
	}
}
