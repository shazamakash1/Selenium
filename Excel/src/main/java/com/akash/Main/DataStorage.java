package com.akash.Main;

import java.util.ArrayList;

import com.akash.Report.Data;

public class DataStorage {

	public static void initializeDataStorage() {
		System.out.println("Data Storage Initialized");
	}	
	
	ArrayList<Data> list = new ArrayList<>();

	public ArrayList<Data> getList() {
		return list;
	}

	public void setList(ArrayList<Data> list) {
		this.list = list;
	}
}
