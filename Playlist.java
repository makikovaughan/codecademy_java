//Build Playlist.java with the best possible playlist of music using a Java ArrayList.
import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        //Add songs
        desertIslandPlaylist.add("Hero");
        desertIslandPlaylist.add("Y.M.C.A.");
        desertIslandPlaylist.add("Siging in The Rain");
        desertIslandPlaylist.add("My Heart is Left in San Francisco");
        desertIslandPlaylist.add("I Swear");
        desertIslandPlaylist.add("Another Irish Drinking Song");

        //Render the list of songs
        System.out.println("Music List: " + desertIslandPlaylist.toString());

        //Render the size of ArrayList
        System.out.println("The length of music list is " + desertIslandPlaylist.size());

        //Remove 1 song
        desertIslandPlaylist.remove(3);

        //Render the size of ArrayList
        System.out.println("The length of music list is " + desertIslandPlaylist.size());

        //Swap the song order
        String tmpSong = desertIslandPlaylist.get(0);
        desertIslandPlaylist.set(0, desertIslandPlaylist.get(4));
        desertIslandPlaylist.set(4, tmpSong);

        //Render the song list
        System.out.println("Music List: " + desertIslandPlaylist.toString());

        //Swap songs
        int indexA = desertIslandPlaylist.indexOf("Siging in The Rain");
        int indexB = desertIslandPlaylist.indexOf("Y.M.C.A.");
        String tempA = desertIslandPlaylist.get(indexA);
        desertIslandPlaylist.set(indexA, desertIslandPlaylist.get(indexB));
        desertIslandPlaylist.set(indexB, tempA);

        //Render the song list
        System.out.println("Music List: " + desertIslandPlaylist.toString());

    }
}