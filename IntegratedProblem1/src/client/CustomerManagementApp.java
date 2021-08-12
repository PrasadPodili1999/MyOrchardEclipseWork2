package client;
import java.util.LinkedList;
import java.util.Scanner;

import model.Customr;
import services.AddCustomer;
 
public class CustomerManagementApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LinkedList<Customr> list=new LinkedList<Customr>();
		byte loopVar=0;
		do
		{
			displayMenu();
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:services.AddCustomer.addCustomers(list);
					
				break;
			case 2:services.UpdateCustomer.updateCustomer(list);
				break;
			case 3:services.DeleteCustomer.deleteCustomer(list);
				break;
			case 4:services.SortCustomers.sortCustomersByAddress(list);
				break;
			case 5:services.SortCustomers.sortCustomersByAcNo(list);
				break;
			case 6:services.DisplayCustomers.displayByBalance(list);
				break;
			case 7:services.DisplayCustomers.displayByName(list);
				break;
			case 8:services.DisplayCustomers.displayCustomers(list);
				break;
			case 9:
				loopVar++;
				break;
			default:
					
			}
			
		}while(loopVar==0);
	}
	static void displayMenu()
	{
		System.out.println("***********Menu*************");
		System.out.println("1.add customer");
		System.out.println("2.update customer");
		System.out.println("3.delete customer");
		System.out.println("4.sort customer by address(location wise) and display");
		System.out.println("5.sort customer by account number and display");
		System.out.println("6.display all customers who have non-zero balance");
		System.out.println("7.display customers based on name");
		System.out.println("8.diplay all customers in the bank");
		System.out.println("9.exit");
		System.out.println("****************************");
	}

}
