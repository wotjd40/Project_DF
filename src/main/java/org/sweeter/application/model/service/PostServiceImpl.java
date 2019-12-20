package org.sweeter.application.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sweeter.application.model.dto.Post;
import org.sweeter.application.model.mapper.PostMapper;
@Service
public class PostServiceImpl implements PostService{
	@Autowired 
	PostMapper postMapper;
	
	
	
	
	@Override
	public List<Post> getPostList(int category, int page, int count) {
		return postMapper.getPostList(category, page, count);
	}
	
	
	@Override
	public void write(Post post) {
		postMapper.writePost(post);
	}
	
	@Override
	public void modify(Post post) {
		postMapper.updatePost(post);
		
	}

	@Override
	public void delete(String id) {
		postMapper.deletePost(id);
		
	}


	@Override
	public Post getPost(int id) {
		return postMapper.getPostById(id);
	}


	@Override
	public List<Post> getAllPosts() {
		return postMapper.getAllPost();
	}

}
