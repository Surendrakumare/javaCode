package com.example.demo2.repositoryPackage;

import org.springframework.data.repository.CrudRepository;

import com.example.demo2.entitypackage.PostsEntity;

public interface PostsRepositoryInterface extends CrudRepository<PostsEnitys, Integer> {

}
