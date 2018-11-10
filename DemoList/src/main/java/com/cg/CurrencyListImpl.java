package com.cg;

import java.util.ArrayList;

public class CurrencyListImpl implements CurrencyList
{

	private ArrayList<String> currList;
	
	public void setCurrList(ArrayList<String> currList) {
		this.currList = currList;
	}

	public ArrayList<String> getCurrList() {
		// TODO Auto-generated method stub
		return currList;
	}

}
