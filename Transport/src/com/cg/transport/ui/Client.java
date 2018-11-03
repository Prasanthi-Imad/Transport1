package com.cg.transport.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

import com.cg.transport.exception.TicketException;
import com.cg.transport.exception.TicketExceptionMesaages;
import com.cg.transport.service.ITransportService;
import com.cg.transport.service.TransportServiceImpl;
import com.cg.transport.ticketBean.Ticket;



public class Client {
	
	public static void main(String[] args) throws TicketException {
		try{
			Scanner sc = new Scanner(System.in);
			Ticket bean = new Ticket();
			ITransportService ticketService = new TransportServiceImpl();
			Map<String, String> transportDetails = ticketService
					.getTransportDetails();
			System.out.println(" Mode of Transport ");
			// set id
			int id = (int) ((Math.random()) * 10000);
			bean.setId(id);
			// set TransportCategoryId
			int count = 1;
			for (Map.Entry<String, String> entrySet : transportDetails.entrySet()) {
				System.out.println(count + ". " + entrySet.getValue());
				count++;
			}
			System.out.println();
			System.out.println(" Enter transport option :");
			int option = sc.nextInt();
			int count1 = 1;
			if(option==1||option==2||option==3){
			for (Map.Entry<String, String> entrySet : transportDetails.entrySet()) {
				if (count1 == option) {
					bean.setTransportCategoryId(entrySet.getKey());
					break;
				}
				count1++;
			}
			}
			else{
				System.out.println("Select a valid option");
				System.exit(0);
			}
			
			// set reason
			System.out.println(" Enter reason");
			sc.nextLine();
			String reason = sc.nextLine();
			// or String reason = scanner.next();
			
			bean.setReason(reason);
			// set when
			System.out.println(" Enter when");
			System.out.println(" 1. This week \n 2. Next week \n 3. Next month");
			int whenChoice = sc.nextInt();
			
			if (whenChoice == 1) {
				bean.setWhen("This week");
			}else if (whenChoice == 2) {
				bean.setWhen("Next week");
			}else if (whenChoice == 3) {
				bean.setWhen("Next month");
			}
			ticketService.addTransportTicket(bean);
			LocalDateTime dateTime=LocalDateTime.now();
			DateTimeFormatter format=DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm a");
			System.out.println(" bopoked with id "+bean.getId()+" on "+dateTime.format(format));
		
			sc.close();
			}
		catch(TicketException ticketException){
				System.out.println("Error in fetching details and adding data");
			}catch (Exception e) {
				throw new TicketException(TicketExceptionMesaages.ERROR1);
			}
}
}
