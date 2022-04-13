import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
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

		Path path = Paths.get("src", "main", "resources", "musics", "02-paranoid.mp3");

		// Instantiating Media class
		Media media = new Media(path.toUri().toString());

		// Instantiating MediaPlayer class
		MediaPlayer mediaPlayer = new MediaPlayer(media);

		// Sets the audio playback volume. Its effect will be clamped to the range [0.0,
		// 1.0].
		mediaPlayer.setVolume(0.5);

		// by setting this property to true, the audio will be played
		mediaPlayer.setAutoPlay(true);

		// Play the music in loop
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	}

}
