package com.cg.transport.dao;

import java.util.Map;

import com.cg.transport.exception.TicketException;
import com.cg.transport.ticketBean.Ticket;

public interface ITransportDao {
	Map<String, String> getTransportDetails() throws TicketException;

	void addTransportTicket(Ticket bean) throws TicketException;

}
