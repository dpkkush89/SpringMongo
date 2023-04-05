package com.dktech.joblisting.repositories;

import java.util.List;

import com.dktech.joblisting.modal.Post;

public interface SearchRepo {

	List<Post> findByText(String text);

}
