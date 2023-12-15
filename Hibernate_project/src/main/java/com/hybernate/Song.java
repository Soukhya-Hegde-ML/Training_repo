package com.hybernate;

import jakarta.persistence.*;


@Entity
@Table(name="Song")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int song_id;
    @Column(name="song_name",nullable = false)
    private String song_name;
    @Column(name="singer",length=50)
    private String artist;
    @Transient
    private String released_date;

    public int getSong_id() {
        return song_id;
    }

    public void setSong_id(int song_id) {
        this.song_id = song_id;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "song_id=" + song_id +
                ", song_name='" + song_name + '\'' +
                ", artist='" + artist + '\'' +
                //", released_date='" + released_date + '\'' +
                '}';
    }
}
//@TableGenerator(name="Table_GEN",table="pk_Generator",pkColumnName = "PK_column",valueColumnName = "value",allocationSize = 100)
//@GeneratedValue(strategy = GenerationType.AUTO, generator = "Table_Gen")