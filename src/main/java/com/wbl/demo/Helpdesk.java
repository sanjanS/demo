package com.wbl.demo;

import static com.wbl.demo.Category.PHONE;
import static com.wbl.demo.Category.PRINTER;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.logging.Logger;

public class Helpdesk {
	public static class HelpDesk {
		 private static final Logger log = Logger.getLogger(HelpDesk.class.getName());
	    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

	    /**
	     * Method to add Enquiry to Queue.
	     * offer method - tries to add an element to a queue,
	     *  and returns false if the element can't be added
	     * (like in case when a queue is full),
	     * or true if the element was added,
	     * and doesn't throw any specific exception.
	     * add method - tries to add an element to a queue,returns true if the element was added,
	     * or throws an IllegalStateException if no space is currently available.
	     * @param customer multiple People
	     * @param category Device
	     */
	    public void enquire(Customer customer, Category category) {
	        enquiries.offer(new Enquiry(customer,category));
	    }
	    
	    /**
	     * Method to Categorise Printer Enquiries
	     */
	    public void processPrinterEnquiry() {
	        final Enquiry enquiry = enquiries.peek();
	        if (enquiry != null && enquiry.getCategory() == PRINTER) {
	            enquiries.remove();
	            enquiry.getCustomer().reply("Is it out of paper");
	        } else {
	            log.info("No work to do, let's have some tea");
	        }
	    }

	    /**
	     * Method to Categorise General Enquiries.
	     */
	    public void processGeneralEnquiry() {
	        final Enquiry enquiry = enquiries.peek();
	        if (enquiry != null && enquiry.getCategory() != PRINTER) {
	            enquiries.remove();
	            enquiry.getCustomer().reply("Have you tried turning it off and on again");
	        } else {
	            log.info("No work to do, let's have some tea");
	        }
	    }
	    /**
	     * Main Method.
	     *
	     * @param args String
	     */
	    public static void main(String[] args) {
	        HelpDesk helpDesk = new HelpDesk();
	        Customer jack = new Customer("jack");
	        Customer jill = new Customer("jill");
	//        HelpDesk helpDesk = new HelpDesk();
	        helpDesk.enquire(jack, PHONE);
	        helpDesk.enquire(jill, PRINTER);
	        helpDesk.processPrinterEnquiry();
	        helpDesk.processGeneralEnquiry();
	        helpDesk.processPrinterEnquiry();
	        }
}
}