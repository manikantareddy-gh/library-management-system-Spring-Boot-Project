package com.coforge.java;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		BookService service = new BookService();
		LibrarienService lservice = new LibrarienService();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Welcome to Coforge Library!!!!!");
			System.out.println("============================");
			System.out.println("1. Customer");
			System.out.println("2. Librarian");
			System.out.println("0. Exit");
			System.out.print("Please enter your option: ");
			int option = sc.nextInt();

			switch (option) {
				case 1:
					System.out.println("Hello Customer......");
					System.out.print("Enter 'yes' if you want to search book: ");
					String str = sc.next();

					if (str.equalsIgnoreCase("yes")) {
						System.out.print("Enter book id: ");
						int bid = sc.nextInt();
						System.out.print("Enter book title: ");
						String sname = sc.next();
						System.out.print("Enter author title: ");
						String author = sc.next();
						String result = service.searchbook(bid, sname, author);
						System.out.println(result);
					} else {
						System.out.println("Sorry, reach out again!!");
					}
					break;

				case 2:
					System.out.println("Hello Librarian");
					System.out.println("1. Search Book");
					System.out.println("2. Allocate Book");
					System.out.println("3. Calculate Due");
					System.out.println("4. Add a new Book");
					System.out.println("5. Add a new Customer");
					System.out.print("Please enter your option: ");
					int loption = sc.nextInt();

					switch (loption) {
						case 1:
							System.out.print("Enter book id: ");
							int bid = sc.nextInt();
							System.out.print("Enter book title: ");
							String sname = sc.next();
							System.out.print("Enter author title: ");
							String author = sc.next();
							String result = service.searchbook(bid, sname, author);
							System.out.println(result);
							break;

						case 2:
							System.out.print("Enter book ID: ");
                            int bbid = sc.nextInt();
                            System.out.print("Enter Customer ID: ");
                            int ccid = sc.nextInt();
                            lservice.allocateBook(bbid, ccid);
                            break;
							
							
						case 3:
							System.out.print("Enter number of days ");
							int num = sc.nextInt();
							lservice.calculatedue(num);
							break;

						case 4:
							sc.nextLine();
							while (true) {
								System.out.print("Enter the Book Id: ");
								int id = sc.nextInt();
								sc.nextLine();

								System.out.print("Enter the Book Name: ");
								String name = sc.nextLine();

								System.out.print("Enter the Book Author: ");
								String bookAuthor = sc.nextLine();

								System.out.print("Enter the Book Category: ");
								String category = sc.nextLine();

								System.out.print("Is the book available - true/false ");
								boolean isAvailable = sc.nextBoolean();

								service.addbook(id, name, bookAuthor, category, isAvailable);
								System.out.println("Book added successfully!");

								System.out.print("Press 1 to add another book, 0 to stop: ");
								int again = sc.nextInt();
								if (again == 0) break;
								sc.nextLine();
							}
							break;

						case 5:
							System.out.print("Enter customer ID: ");
							int customerid = sc.nextInt();

							System.out.print("Enter customer name: ");
							String customer_name = sc.next();

							lservice.addcustomer(customerid, customer_name, -1);
							break;
					}
					break;

				case 0:
					System.out.println("Exiting... Thank you!");
					sc.close();
					System.exit(0);

				default:
					System.out.println("Invalid option! Please try again.");
			}
		}
	}
}
