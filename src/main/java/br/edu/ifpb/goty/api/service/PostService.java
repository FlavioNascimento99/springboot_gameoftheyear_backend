package br.edu.ifpb.goty.api.service;


import br.edu.ifpb.goty.api.model.Post;
import br.edu.ifpb.goty.api.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getPosts() {

        return (List<Post>) this.postRepository.findAll();

    }

    public Post getPostById(Long idPost) {

        return this.postRepository.findById(idPost).orElse(null);

    }

    @Transactional
    public Post insertOrUpdate(Post post) {

        Post postInsert = this.postRepository.save(post);

        return postInsert;

    }

    public void deletePost(Long id) {

        this.postRepository.deleteById(id);

    }

}
