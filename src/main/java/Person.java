import utils.LinkedList;
import utils.Node;

public class Person extends Node<Person> {
    private final String name; // since we do not have to swap values of persons (sort the persons) that variable would be final
    private LinkedList<Song> likedSongs = new LinkedList<>();

    public Person(String name) { // all we need is name of the person that we're going to create
        super(name); // since we'll use Person as a node of the PersonList we should set next pointer to null in the first place
        this.name = name;
    }

    public void likeSong(String songName) { // to make a person to like a song
        Song song = new Song(songName);
        if (likedSongs.contains(likedSongs, song)) { // if song is already liked by the person
            System.out.println(name + " already likes " + song);
            return;
        }
        if (Interface.songs.contains(Interface.songs, song)) { // if the song is already in present in Interface.songs
            likedSongs = likedSongs.add(likedSongs, song); // first we're saving this instance into likedSongs
            song = Interface.songs.get(Interface.songs, song); // then getting the instance of the song in the present
            song.increaseCounter(); // the rest is just increasing the counter
            System.out.println(name + " likes " + songName);
        } else { // if song does not contain in Interface.songs, all we have to do is just simply increasing its counter
            song.increaseCounter(); // hence song's counter become 1 and song will automatically add itself into Interface.songs
            Song likedSong = new Song(songName); // we should create a new instance of the same song
            likedSongs = likedSongs.add(likedSongs, likedSong); // and add into likedSongs because of the previous one is also a node of Interface.songs
            System.out.println(name + " likes " + songName);
        }
    }

    public void doesntLikeSong(String songName) { // to disgust a person from a song :)
        Song song = new Song(songName);
        likedSongs = likedSongs.remove(likedSongs, song);
        Interface.songs.get(Interface.songs, song).decreaseCounter(); // we're just decreasing and increasing the counter
    }

    public LinkedList<Song> getLikedSongs() {
        return likedSongs;
    } // to print liked songs of a person in L command

    @Override
    public String toString() {
        return name;
    } // to easy print names of the persons

    @Override
    public boolean equals(Object object) { // it's required when comparisons made
        boolean isEqual = false;
        if (object != null && object instanceof Person) isEqual = ((Person) object).name.equals(this.name);
        return isEqual;
    }
}
