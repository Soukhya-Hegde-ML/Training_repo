package com.hybernate;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Genre")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int genre_id;
    @Column(name="genre_name",nullable = false)
    private String genre_name;

    @OneToMany(mappedBy = "genre")
    private List<Song> song;

    public int getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(int genre_id) {
        this.genre_id = genre_id;
    }

    public String getGenre_name() {
        return genre_name;
    }

    public void setGenre_name(String genre_name) {
        this.genre_name = genre_name;
    }
}
