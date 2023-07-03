package br.edu.ifpb.goty.api.repository;

import br.edu.ifpb.goty.api.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {



}
