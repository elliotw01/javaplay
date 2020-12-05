package wood.elliot;

import java.util.HashMap;
import java.util.Map;

public class ArtistAndSong {

    Map<String, String> artistAndSongMap = new HashMap();

    public void populateMap() {
        artistAndSongMap.put( "abba", "money money money" );
        artistAndSongMap.put( "TJay", "F.N" );
        artistAndSongMap.put( "Guns n roses", "Sweet child o mine" );

        artistAndFirstLetters();
    }

    public void artistAndFirstLetters() {
        for (Map.Entry<String, String> entry : artistAndSongMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
