package org.example.exercisesCollections.videoGame_arrayList;

public class VideoGame {
    private int code;
    private  String title;
    private String console;
    private int players;
    private String category;

    public VideoGame (int code,String title, String console, int players, String category){
        this.code = code;
        this.title = title;
        this.console = console;
        this.players = players;
        this.category = category;
    }
     public void setCode(int code){
        this.code = code;
     }
     public int getCode(){
        return code;
     }
     public void setTitle (String title){
        this.title = title;
     }
     public String getTitle(){
        return title;
     }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "code=" + code +
                ", title='" + title + '\'' +
                ", console='" + console + '\'' +
                ", players=" + players +
                ", category='" + category + '\'' +
                '}';
    }
}
