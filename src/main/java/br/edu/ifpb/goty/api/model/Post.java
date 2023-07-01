package br.edu.ifpb.goty.api.model;

import jakarta.persistence.*;

@Entity
@Table(name= "table_post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String theme;
    private String commentary;


    // Getters
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getTheme() {
        return theme;
    }
    public String getCommentary() {
        return commentary;
    }


    // Setters
    public void setTitle (String title) {
        this.title = title;
    }
    public void setTheme(String theme) {
        this.theme = theme;
    }
    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }
}
