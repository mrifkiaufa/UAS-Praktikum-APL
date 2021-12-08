package Anime;

import AnimeAdapter.AnimeAdapter;

/**
 * Class AnimeContext
 * Menset pilihan anime yang ingin ditonton.
 * Memutar anime yang ingin ditonton.
 * Memanggil class AnimeAdapter, agar bisa menkonversi
 * anime ke dalam bentuk manga(komik).
 */
public class AnimeContext {
    /**
     * Memanggil objek dari class lain
     * objek anime adalah pilihan anime yang ingin ditonton
     * objek manga adalah anime yang sudah diconvert ke manga
     */
    AnimeStrategy anime;
    AnimeAdapter manga;

    /**
     * method setAnimeStrategy berfungsi menset pilihan anime.
     * Memanggil method setAnimeAdapter, agar anime-nya juga
     * bisa dinikmati dalam format manga.
     * @param anime pilihan anime yang ingin diset
     */
    public void setAnimeStrategy(AnimeStrategy anime) {
        this.anime = anime;
        setAnimeAdapter(anime);
    }

    /**
     * method setAnimeAdapter mengadaptasi anime yang diinginkan
     * ke dalam format manga.
     * @param anime berisi objek anime yang ingin dikonversi ke manga
     */
    public void setAnimeAdapter(AnimeStrategy anime) {
        this.manga = new AnimeAdapter(anime);
    }

    /**
     * method mediaPlayer memanggil method watch dari objek anime
     * tujuannya untuk memutar anime yang diinginkan.
     * @param start jika bernilai true anime diputar,
     * jika bernilai false anime ditutup/selesai.
     */
    public void mediaPlayer(Boolean start) {
        anime.watch(start);
    }

    /**
     * method mediaReader memanggil method read dari objek manga
     * tujuannya untuk membuka file manga yang diinginkan.
     * @param start jika bernilai true file mangan dibuka,
     * jika bernilai false file manga ditutup/selesai dibaca.
     */
    public void mediaReader(Boolean start) {
        manga.read(start);
    }
}
