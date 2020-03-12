package com.example.ws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.persistance.AuctionItem;
import com.example.persistance.Item;

@RestController
public class GetAuctionItemsController {

	@RequestMapping("/hello")
	public String hello() {
		return "HelloWorld!";
	}
	
	 @GetMapping("auctionItems")
		public List<AuctionItem> getAllAutionItems()
		{
			 List<AuctionItem> auctionItems = new ArrayList<AuctionItem>();
			 List<Item> itemList = new ArrayList<Item>();
			 
			 AuctionItem auctionItem = new AuctionItem();
			 Item item = new Item();
			 item.setItemId("PQRS");
			 item.setItemDescription("PQRS item description");
			 itemList.add(item);
			 
			 auctionItem.setAuctionItemId("1234");
			 auctionItem.setCurrentBid(0.00);
			 auctionItem.setReservePrice(10450.00);
			 auctionItem.setItems(itemList);
			 auctionItems.add(auctionItem);
			 
			 item.setItemId("RTYU");
			 item.setItemDescription("RTYU item description");
			 itemList.add(item);
			 
			 auctionItem.setAuctionItemId("5678");
			 auctionItem.setCurrentBid(0.00);
			 auctionItem.setReservePrice(10750.00);
			 auctionItem.setItems(itemList);
			 auctionItems.add(auctionItem);

			 return auctionItems;
		}
	 
	 @GetMapping("auctionItems/{auctionItemId}") 
	 public List<AuctionItem> actionItems(@RequestParam(value = "auctionItemId", defaultValue = "1234") String auctionItemId) 
	 {
		 List<AuctionItem> auctionItems = new ArrayList<AuctionItem>();
		 List<Item> itemList = new ArrayList<Item>();
		 
		 AuctionItem auctionItem = new AuctionItem();
		 Item item = new Item();
		 item.setItemId("abcd");
		 item.setItemDescription("item description");
		 itemList.add(item);
		 
		 auctionItem.setAuctionItemId("1234");
		 auctionItem.setCurrentBid(0.00);
		 auctionItem.setReservePrice(10450.00);
		 auctionItem.setItems(itemList);
		 auctionItems.add(auctionItem);
		 
		 
		 return auctionItems;
	 }

}
