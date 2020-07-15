package com.accessory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accessory.Service.AccessoryService;
import com.accessory.entity.AccessoryEntity;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class AccessoryController {
	
	@Autowired
	AccessoryService service;
	
	@GetMapping("/accessory/{modelID}")
	public List<AccessoryEntity> getAccessoryList(@PathVariable int modelID){
		
		return service.getAccessoryList(modelID);
	}

}
