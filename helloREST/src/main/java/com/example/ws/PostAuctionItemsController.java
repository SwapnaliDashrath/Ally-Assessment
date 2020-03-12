package com.example.ws;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostAuctionItemsController {

	@PostMapping("bids")
		public String getAutionItemId()
		{
			 //TODO

			 return "Success";
		}
	 
	 @PostMapping("auctionItems") 
	 public ResponseEntity<Void> AddActionItems(@RequestParam(value = "auctionItemId", defaultValue = "1234") String auctionItemId) 
	 {
		 //TODO 
		 
		 HttpHeaders headers = new HttpHeaders();
		 return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	 }

}
