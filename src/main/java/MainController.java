import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    void initialize() {
        
    	String path = getClass().getClassLoader().getResource("musics/02-paranoid.mp3").getFile();  
        
        //Instantiating Media class  
        Media media = new Media(new File(path).toURI().toString());  
          
        //Instantiating MediaPlayer class   
        MediaPlayer mediaPlayer = new MediaPlayer(media);  
        
        // Sets the audio playback volume. Its effect will be clamped to the range [0.0, 1.0].
        mediaPlayer.setVolume(0.5);
          
        //by setting this property to true, the audio will be played   
        mediaPlayer.setAutoPlay(true);  
 
    }

}

