
package videogames;

import java.util.ArrayList;
import java.util.List;
import videogames.logica.VideoGame;


public class VideoGames {

   
    public static void main(String[] args) {
       
        List<VideoGame> listVideoGames = new ArrayList<VideoGame>();
        
        
        //2
        VideoGame game1 = new VideoGame (123,"Banjo Kazooie","Nintendo 64",4,"Plataform");
        VideoGame game2 = new VideoGame (456,"Mario 64","Nintendo 64",1,"Plataform");
        VideoGame game3 = new VideoGame (789,"Legend of Zelda","Nintendo 64",1,"Plataform");
        VideoGame game4 = new VideoGame (101,"GTA: San Andreas","PlayStation 2",2,"Plataform");
        VideoGame game5 = new VideoGame (112,"Bully","PlayStation 2",1,"Plataform");
        
        
        listVideoGames.add(game1);
        listVideoGames.add(game2);
        listVideoGames.add(game3);
        listVideoGames.add(game4);
        listVideoGames.add(game5);
        
        //3 
         System.out.println("----------------------------------------------------------------------------------------------------------------------");
        for(VideoGame game : listVideoGames){
            System.out.println("Tittle: " + game.getTittle() + " Console: "+ game.getConsole() + " Number of Players: " + game.getNumPlayers());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        //4 - Changes: tittle and Number of players
        
        game1.setTittle("Banjo Kazooie II");
        game1.setNumPlayers(2);
        
        game2.setTittle("Super Mario Sunshine");
        game2.setNumPlayers(3);
        
        //5
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        for(VideoGame game : listVideoGames){
            if(game.getConsole().equals("Nintendo 64")){
                System.out.println(game.toString());
            }
            
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------"); 
    }
    
}
