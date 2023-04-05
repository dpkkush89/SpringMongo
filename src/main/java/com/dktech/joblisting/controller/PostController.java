package com.dktech.joblisting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dktech.joblisting.modal.Post;
import com.dktech.joblisting.repositories.PostRepo;
import com.dktech.joblisting.repositories.SearchRepo;

@RestController
public class PostController {
	
	@Autowired
	PostRepo repo;
	@Autowired
	SearchRepo searchRepo;
	
	@GetMapping("/posts")
	public List<Post> getAllPost(){
		return repo.findAll();
	}
	
	@PostMapping("/post")
	public Post addPost(@RequestBody Post post) {
		return repo.save(post);
	}
	
	@GetMapping("/posts/{text}")
	public List<Post> search(@PathVariable String text){
		return searchRepo.findByText(text);
		
		
	}
}
