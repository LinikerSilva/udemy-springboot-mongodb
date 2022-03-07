package com.cursoudemy.workshopmongo.resources;

import com.cursoudemy.workshopmongo.domain.Post;
import com.cursoudemy.workshopmongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/posts")
public class PostResource {

    @Autowired
    private PostService PostService;

    @GetMapping("{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = PostService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
