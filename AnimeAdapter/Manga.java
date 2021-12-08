package AnimeAdapter;

/**
 * interface Manga
 * Akan diimplementasika oleh class AnimeAdapter.
 * Tujuannya adalah mengubah anime agar bisa 
 * dinikmati dalam bentuk manga.
 */
interface Manga {
    
    /**
     * method read bertugas membaca manga yang
     * diadaptasi dari format anime.
     * @param Start jika bernilai true file manga dibuka,
     * jika bernilai false file manga ditutup/selesai.
     */
    public void read(Boolean Start);
}