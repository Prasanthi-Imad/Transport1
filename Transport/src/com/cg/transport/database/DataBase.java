package com.cg.transport.database;

import java.util.HashMap;
import java.util.Map;

import com.cg.transport.ticketBean.Ticket;

public class DataBase {
	public static Map<String, String> transportDetails = new HashMap<String, String>();
	private static Map<Integer, Ticket> transportTicketDetails = new HashMap<>();

	static {
		transportDetails.put("Fl-1", "Flight");
		transportDetails.put("Tr-1", "Train");
		transportDetails.put("Ta-1", "Taxi");
	}

public static Map<String, String> getTransportDetails() {
	
	return transportDetails;
}

public static void addTransportTicket(Ticket bean) {
	transportTicketDetails .put(bean.getId(), bean);
	
}
}
