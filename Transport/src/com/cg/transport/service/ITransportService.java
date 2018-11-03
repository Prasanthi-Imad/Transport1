package com.cg.transport.service;

import java.util.Map;

import com.cg.transport.exception.TicketException;
import com.cg.transport.ticketBean.Ticket;

public interface ITransportService {

	Map<String, String> getTransportDetails() throws TicketException;

	void addTransportTicket(Ticket bean) throws TicketException;

}
