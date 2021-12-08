package Anime;

/**
 * Interface AnimeStrategy
 * Memberikan opsi pilihan anime yang bisa ditonton
 * kepada para class yang ingin mengimplementasikannya.
 */
public interface AnimeStrategy {
    /**
     * Method watch, berfungsi untuk memutar/menghentikan 
     * anime yang ingin ditonton.
     * @param start jika bernilai true, anime diputar
     * dan jika bernilai false, anime dihentikan.
     */
    public void watch(boolean start);

    /**
     * Method getName, mengembalikan nama anime dari class.
     * @return nama anime milik si class.
     */
    public String getName();
}
