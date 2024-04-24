package org.example.exercisesCollections.videoGame;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <VideoGame> listGames = new ArrayList<>();
        listGames.add(new VideoGame(12, "Mario Bross","playStation",4, "Adventure"));
        listGames.add(new VideoGame(13, "Sonic","Nintendo 64",8, "Race"));
        listGames.add(new VideoGame(14, "looney Tunes","Nintendo 64",6, "Shooter"));
        listGames.add(new VideoGame(15, "Pepe Grillo","playStation",1, "platform"));
        listGames.add(new VideoGame(15, "Pepe Pillo","Nintendo 64",2, "Pc"));

        System.out.println("second point.........................");
        for(VideoGame game: listGames){
            System.out.println("Title = " + game.getTitle() +", Console = "+ game.getConsole()+ ", Players = " + game.getPlayers());
        }
        System.out.println("third point.........................");
        String editName = "Pepe Grillo";
        for(VideoGame game: listGames){
            if(game.getTitle().equals(editName)){
                game.setTitle("Pepe Argento");
                game.setPlayers(4);
                System.out.println("Change successful! new title= " + game.getTitle() + ", new players=  "+ game.getPlayers());
            }
        }

        System.out.println("fourth point .........................");
        for(VideoGame c: listGames){
            if(c.getConsole().equals("Nintendo 64")){ // we use equals because we are comparing objects
                System.out.println("c = " + c.toString());
            }
        }
    }
}
