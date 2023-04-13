package com.example.demo2.repositoryPackage;

import org.springframework.data.repository.CrudRepository;

import com.example.demo2.entitypackage.UsersEntity;

public interface UsersRepositoryInterface extends CrudRepository<UsersEntity, Integer>{

}
