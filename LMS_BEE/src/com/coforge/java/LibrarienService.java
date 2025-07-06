package com.coforge.java;

import java.util.ArrayList;
import java.util.List;

public class LibrarienService extends BookService {

	List<Customer> custlist = new ArrayList<>();

	public Customer addcustomer(int id, String name, int allocated_bid) {
		Customer cust = new Customer(id, name, allocated_bid);
		custlist.add(cust);
		return cust;
	}

	public void allocateBook(int book_id, int cid) {
    boolean bookFound = false;

    // Find the customer
    Customer currentcust = null;
    for (Customer cust : custlist) {
        if (cust.id == cid) {
            currentcust = cust;
            break;
        }
    }

    if (currentcust == null) {
        System.out.println("Invalid Customer!!");
        return;
    }

    // Find the book
    for (Book book : books) {
        if (book.getBook_id() == book_id) {
            bookFound = true;

            // Check if customer already has the book
            if (currentcust.allocated_bid == -1) {
                currentcust.allocated_bid = book_id;
                System.out.println("Book successfully allocated to customer.");
            } else if (currentcust.allocated_bid == book_id) {
                System.out.println("Same book already allocated to this customer.");
            } else {
                System.out.println("Customer is already allocated a different book.");
            }
            break; 
        }
    }

    // If book not found in the list
    if (!bookFound) {
        System.out.println("Book with ID " + book_id + " not found.");
    }
}


	public String calculatedue(int days) {
		if (days > 10) {
			int val = days - 10;
			return "you had penalty for " + val + " please pay " + (val * 100);
		} else {
			return "you dont have any penalty...";
		}
	}

}
