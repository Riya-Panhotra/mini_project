package com.example.demo.service;

import com.example.demo.model.Users;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    //getAllPosts, getPost, addPost, updatePost, deletePost

    @Autowired
    private UserRepository userRepository;
    public void addPost(Users post)
    {
        this.userRepository.save(post);
    }
    public List<Users> getAllPost()
    {
        return userRepository.findAll();
    }
    public void deletePost(Integer id){
        this.userRepository.deleteById(id);
    }

}