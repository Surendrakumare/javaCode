package com.example.demo.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FileDeatils;

@Service
public class FileService {

	public void createExel(HttpRequest https) {

	}

	@SuppressWarnings("null")
	public String createFile(FileDeatils file) throws IOException {
		File files = new File(file.getFileName());
//		FileDeatils newfile = new FileDeatils();
//	BufferedWriter br = new BufferedWriter()
//		FileWriter fw = null;
		String message;
		FileWriter fw;
		if (files.exists()) {
			fw = new FileWriter(files, true);
			message = "file already exists";
		} else {
			fw = new FileWriter(files);
			message = "file created succesfully";
		}
		fw.write(file.getText());
		fw.close();
		return message;
	}
	
	public String deleteFile(String file) {
		File files = new File(file);
		files.delete();
		return "delected"+file;
		
	}
	
	public String readingFile(String file) throws IOException {
	
		FileReader fr=new FileReader(file);
		 BufferedReader br = new BufferedReader(fr);
		 List<String> alllines = new ArrayList<String>();
		 
		 String line;
		while((line=br.readLine()) != null)
			alllines.add(line);
		
	     br.close();
	     String str=String.join("\n", alllines);
				return str;
//	Files.readAllLines(Path.of(file, null));
	}

}
