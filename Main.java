import Anime.*;
import java.util.Scanner;

/**
 * Class Main
 * Yang menjalankan implementasi dari pattern yang sudah dibuat
 */
public class Main {
    /**
     * Membuat objek
     * objek input untuk menerima input(scanner)
     * objek anime untuk menampung anime yang dipilih
     */
    static Scanner input = new Scanner(System.in);
    static AnimeContext anime;

    public static void main(String[] args) {
        anime = new AnimeContext();
        String lanjut = "y";
        
        // Akan terus mengulang program selama user masih menginput "y"
        while(lanjut.equals("y")) {

            pilihJudul();
            System.out.println();

            System.out.print("Tekan 'y' bila ingin mengulang: ");
            lanjut = input.nextLine();
            lanjut = input.nextLine();

            // Jika program dihentikan
            if(!lanjut.equals("y")) {
                System.out.println();
                System.out.println(">>>Terima kasih sudah menggunakan layanan kami :)");
                break;
            }
            System.out.println("----------------------------");
        } 
	}
        
    /**
     * Berisi scanner agar bisa memilih anime mana
     * yang ingin ditonton/diadaptasi ke manga.
     */
    public static void pilihJudul() {
        System.out.println();
        System.out.println("Pilih judul");
        System.out.println("1. Naruto");
        System.out.println("2. One Piece");
        System.out.println("3. Dragon Ball");
        System.out.print("Pilihan: ");

        int option = Main.input.nextInt();

		switch(option) {
            // Jika dipilih anime Naruto
			case 1 :
                // Menset anime yang dipilih
				anime.setAnimeStrategy(new NarutoStrategy());

                /*  Memilih metode(ingin dalam bentuk anime
                atau dikonversi ke manga) */
                setMetode();
				break;

            // Jika dipilih anime One Piece
			case 2:
                anime.setAnimeStrategy(new OnePieceStrategy());
                setMetode();
				break;

            // Jika dipilih anime Dragon Ball
			case 3:
                anime.setAnimeStrategy(new DragonBallStrategy());
                setMetode();
				break;
            default:
                System.out.println("Inputan kamu salah, silakan pilih ulang!!!");
                pilihJudul();
		}
    }

    /**
     * Berisi scanner untuk memilih apakah ingin
     * langsung menonton anime
     * atau
     * diubah ke format manga terlebih dahulu untuk dibaca.
     */
    public static void setMetode() {
        System.out.println();
        System.out.println("Pilih Metode");
        System.out.println("1. Nonton anime");
        System.out.println("2. Baca manga");
        System.out.print("Pilihan: ");
        int choice = 0;
        choice = input.nextInt();

        // Kondisi jika ingin langsung menonton dalam format anime
        if(choice == 1) {
            /* Memanggil method mediaPlayer untuk memutar 
            dan juga menghentikan anime jika sudah selesai*/
            anime.mediaPlayer(true);
            anime.mediaPlayer(false);
        }

        // Kondisi jika ingin mengubah anime ke format manga
        else if(choice == 2) {
            /* Memanggil method mediaReader untuk membuka 
            dan juga menutup file manga jika sudah selesai dibaca*/
            anime.mediaReader(true);
            anime.mediaReader(false);
        }
        // Jika input bukan 1 atau 2
        else{
            System.out.println("Inputan kamu salah, silakan pilih ulang!!!");
            setMetode();
        }
    }
}
