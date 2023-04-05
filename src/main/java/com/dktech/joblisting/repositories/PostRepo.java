
package com.dktech.joblisting.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dktech.joblisting.modal.Post;




public interface PostRepo extends MongoRepository<Post, String> {

}
