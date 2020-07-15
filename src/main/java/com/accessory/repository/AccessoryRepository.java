package com.accessory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accessory.entity.AccessoryEntity;

@Repository
public interface AccessoryRepository extends JpaRepository<AccessoryEntity, Integer>{

}
