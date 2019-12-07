package com.nare.bean;

public class CurrencyConversionBean {
	
	 private String from;
	
	 private String to;
	 private int v;
	public CurrencyConversionBean() {
		super();
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	@Override
	public String toString() {
		return "CurrencyConversionBean [from=" + from + ", to=" + to + ", v=" + v + "]";
	}
	 
	

}
