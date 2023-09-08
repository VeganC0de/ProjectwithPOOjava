
package videogames.logica;


public class VideoGame {
    
    private int code;
    private String tittle;
    private String console;
    private int numPlayers;
    private String category;

    public VideoGame() {
    }

    
    

    public VideoGame(int code, String tittle, String console, int numPlayers, String category) {
        this.code = code;
        this.tittle = tittle;
        this.console = console;
        this.numPlayers = numPlayers;
        this.category = category;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
     @Override
    public String toString() {
        return "VideoGame{" + "code=" + code + ", tittle=" + tittle + ", console=" + console + ", numPlayers=" + numPlayers + ", category=" + category + '}';
    }
    
    
}
