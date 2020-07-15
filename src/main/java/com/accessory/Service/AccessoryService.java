package com.accessory.Service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accessory.entity.AccessoryEntity;
import com.accessory.repository.AccessoryRepository;

@Service
@Transactional
public class AccessoryService {

	@Autowired
	AccessoryRepository repo;

	public List<AccessoryEntity> getAccessoryList(int modelID) {
		
		return repo.findAll().stream().filter(y->y.getModelId()==modelID).collect(Collectors.toList());
	}
	
}
