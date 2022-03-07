package com.cursoudemy.workshopmongo.resources;

import com.cursoudemy.workshopmongo.domain.Post;
import com.cursoudemy.workshopmongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

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
