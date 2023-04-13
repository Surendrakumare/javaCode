package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.FileDeatils;
import com.example.demo.service.FileService;

@RestController
public class FileContorller {
	@Autowired
	private FileService filedetails;
	
@PostMapping("/create/file")
public String createFile(@RequestBody FileDeatils file) throws IOException {
	return filedetails.createFile(file);
}
@DeleteMapping("/delete/file")
public String deleteFile(@RequestParam String file)
{
	return filedetails.deleteFile(file);
}
@GetMapping("/reading file")
public String readFile(@RequestParam String file) throws IOException {
	return filedetails.readingFile(file);
}


}
