package com.nare.bean;


public class CurrencyEntity {
	
	private int id;
	
	private String cfrom;

	private String to;
	private int value;
	public CurrencyEntity() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCfrom() {
		return cfrom;
	}
	public void setCfrom(String cfrom) {
		this.cfrom = cfrom;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "CurrencyEntity [id=" + id + ", cfrom=" + cfrom + ", to=" + to + ", value=" + value + "]";
	}
	
}
