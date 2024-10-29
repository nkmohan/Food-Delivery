package com.mohanit.binding;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class Order {
	
	private Integer orderId;
    private Integer restaurantId;
    private List<String> items;
    private Integer customerId;
    private String deliveryInstructions; 
    private String paymentMethod;        
    private LocalDateTime orderTime;   
    private String deliveryAddress;
    
    
}
