package com.cg.transport.service;

import java.util.Map;

import com.cg.transport.dao.ITransportDao;
import com.cg.transport.dao.TransportDaoImpl;
import com.cg.transport.exception.TicketException;
import com.cg.transport.exception.TicketExceptionMesaages;
import com.cg.transport.ticketBean.Ticket;

public class TransportServiceImpl implements ITransportService {
	ITransportDao dao = new TransportDaoImpl();

	@Override
	public Map<String, String> getTransportDetails() throws TicketException {
		return dao.getTransportDetails();
	}


	@Override
	public void addTransportTicket(Ticket bean) throws TicketException {
		if(bean.getReason().trim().length()<10){
			throw new TicketException(TicketExceptionMesaages.ERROR2);
		}
		dao.addTransportTicket(bean);
	}
	
}
