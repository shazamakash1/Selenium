package com.akash.Report;

public class Data {

	String tcID;
	String desctiption;
	String expRes;
	String result;
	
	public Data(String tcID, String desctiption, String expRes, String result) {
		this.tcID = tcID;
		this.desctiption = desctiption;
		this.expRes = expRes;
		this.result = result;
	}

	public String getTcID() {
		return tcID;
	}

	public void setTcID(String tcID) {
		this.tcID = tcID;
	}

	public String getDesctiption() {
		return desctiption;
	}

	public void setDesctiption(String desctiption) {
		this.desctiption = desctiption;
	}

	public String getExpRes() {
		return expRes;
	}

	public void setExpRes(String expRes) {
		this.expRes = expRes;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
}
