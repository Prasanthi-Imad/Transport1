package com.cg.transport.dao;

import java.util.Map;

import com.cg.transport.database.DataBase;
import com.cg.transport.exception.TicketException;
import com.cg.transport.ticketBean.Ticket;


public class TransportDaoImpl implements ITransportDao {

	@Override
	public Map<String, String> getTransportDetails() throws TicketException {
		return DataBase.getTransportDetails();
	}

	@Override
	public void addTransportTicket(Ticket bean)  throws TicketException {
		DataBase.addTransportTicket(bean);
	}
	

}
