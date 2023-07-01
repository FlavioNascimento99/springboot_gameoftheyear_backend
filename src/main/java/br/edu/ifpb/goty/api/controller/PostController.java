package br.edu.ifpb.goty.api.controller;


import br.edu.ifpb.goty.api.model.Post;
import br.edu.ifpb.goty.api.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getPosts() {
        return this.postService.getPosts();
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable("id") Long idPost ) {
        return this.postService.getPostById(idPost);
    }

    @PostMapping
    public Post insertPost(@RequestBody Post post) {
        return this.postService.insertOrUpdate(post);
    }

    @PutMapping("/{id}")
    public Post updatePost(@RequestBody Post post) {
        return this.postService.insertOrUpdate(post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable ("id") Long id) {
        this.postService.deletePost(id);
    }
}
