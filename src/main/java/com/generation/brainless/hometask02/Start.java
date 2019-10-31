package com.generation.brainless.hometask02;

import com.generation.brainless.hometask02.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer player = context.getBean(MusicPlayer.class);

        for (int i = 0; i < 6; i++) {
            player.playMusic();
        }

    }

}