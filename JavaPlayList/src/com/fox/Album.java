package com.fox;

import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    String albumName;
    LinkedList<Song> myAlbums = new LinkedList<Song> ();

    public Album(String albumName) {
        this.albumName = albumName;

    }

    public void addSong(Song theSong){
        myAlbums.add ( theSong );

    }

    public Song printSongsAlbum(){
        Iterator songIterator = myAlbums.iterator ();
        while (songIterator.hasNext()){
            Song item = (Song) songIterator.next ();
            return item;
//            System.out.println ( item.getTitle ());

        }
        return null;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void findSong(){


    }
}
