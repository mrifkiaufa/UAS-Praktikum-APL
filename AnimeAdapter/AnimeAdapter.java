package AnimeAdapter;

import Anime.*;

/**
 * class AnimeAdapter
 * Mengadaptasi anime agar bisa dibaca dalam bentuk manga
 */
public class AnimeAdapter implements Manga {
    /**
     * objek anime dari class AnimeStrategy
     * merupakan anime yang akan dikonversi.
     */
    AnimeStrategy anime;


    /**
     * constructor AnimeAdapter akan mengisi nilai untuk objek anime.
     * @param anime
     */
    public AnimeAdapter(AnimeStrategy anime)
    {
        this.anime = anime;
    }

    @Override
    public void read(Boolean start)
    {
        if(start) {
            System.out.println(">>>Membuka manga "+ anime.getName() +"<<<");
        } else {
            System.out.println("<<<Manga "+ anime.getName() +" telah selesai>>>");
        }
    }
}
