package org.sweeter.application.model.service;

import java.util.List;

import org.sweeter.application.model.dto.Post;

public interface PostService {
	List<Post> getPostList(int category, int page, int count);
	void create(Post post);
	void modify(Post post);
	void delete(String id);
	void count(String count);
	void count(int count);
}
