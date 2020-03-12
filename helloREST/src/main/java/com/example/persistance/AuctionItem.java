package com.example.persistance;

import java.util.Collection;

public class AuctionItem {
	
	String actionItemId;
	double currentBid;
	double reservePrice;
	Collection<Item> items;
	public String getAuctionItemId() {
		return actionItemId;
	}
	public void setAuctionItemId(String actionItemId) {
		this.actionItemId = actionItemId;
	}
	public double getCurrentBid() {
		return currentBid;
	}
	public void setCurrentBid(double currentBid) {
		this.currentBid = currentBid;
	}
	public double getReservePrice() {
		return reservePrice;
	}
	public void setReservePrice(double reservePrice) {
		this.reservePrice = reservePrice;
	}
	public Collection<Item> getItems() {
		return items;
	}
	public void setItems(Collection<Item> items) {
		this.items = items;
	}
}
