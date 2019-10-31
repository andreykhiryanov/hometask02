package com.generation.brainless.hometask02;

import org.springframework.beans.factory.annotation.Value;
import java.util.List;

public class MusicPlayer {

    private List<Music> genres;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> genres) {
        this.genres = genres;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {

        int i = (int) (Math.random()*3);

        try {
            System.out.println(genres.get(i).getSong());
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(genres.get(2).getSong());
        }

    }

}