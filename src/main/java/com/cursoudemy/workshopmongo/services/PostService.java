package com.cursoudemy.workshopmongo.services;

import com.cursoudemy.workshopmongo.domain.Post;
import com.cursoudemy.workshopmongo.repositories.PostRepository;
import com.cursoudemy.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        Optional<Post> user = postRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}