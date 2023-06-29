package br.edu.ifpb.goty.api.controller;


import br.edu.ifpb.goty.api.model.Post;
import br.edu.ifpb.goty.api.service.PostService;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return this.postService.getPosts();
    }

    @GetMapping("/posts/{id}")
    public Post getPostById(@PathVariable("id") Long idPost ) {
        return this.postService.getPostById(idPost);
    }

    @PostMapping("/posts")
    public Post insertPost(@RequestBody Post post) {
        return this.postService.insertOrUpdate(post);
    }

    @PutMapping("/posts/{id}")
    public Post updatePost(@RequestBody Post post) {
        return this.postService.insertOrUpdate(post);
    }

    @DeleteMapping("posts/{id}")
    public void deletePost(@PathVariable ("id") Long id) {
        this.postService.deletePost(id);
    }
}
