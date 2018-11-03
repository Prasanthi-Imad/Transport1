package com.cg.transport.ticketBean;

public class Ticket {
	private int id;
	private String transportCategoryId;
	private String reason;
	private String when;
	private String status = "new";

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTransportCategoryId() {
		return transportCategoryId;
	}

	public void setTransportCategoryId(String transportCategoryId) {
		this.transportCategoryId = transportCategoryId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getWhen() {
		return when;
	}

	public void setWhen(String when) {
		this.when = when;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
