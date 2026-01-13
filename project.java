import java.util.*; 
public class project {
    
    public static void penghitungWaktu(int t) {
        Long WaktuAwal = System.currentTimeMillis(); 
        while (t>0) {
            Long WaktuSekarang = System.currentTimeMillis(); 
            if (WaktuSekarang-WaktuAwal >= 1000) { 
                WaktuAwal = WaktuSekarang; 
                int Menit = t / 60; 
                int Detik = t % 60; 
                System.out.printf("%02d:%02d%n", Menit, Detik);
                t--;
            }
        }
        System.out.println("Waktu belajar selesai! Selamat istirahat!");
    }

    public static void Tampilan() {
        System.out.println("=============================================================");
        System.out.println("----Selamat Datang di Study Timer----");
        System.out.println("Study Timer hadir untuk membantu kamu fokus dalam belajar");
        System.out.println("1. Atur timer belajar yang kamu inginkan dalam menit");
        System.out.println("2. Keluar");
    }

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in); 
        int [] Timer = new int [20]; 
        int PenghitungTimer = 0; 

        while (true) {
            Tampilan();
            System.out.println("Ayo tentukan pilihanmu! Belajar atau tunda?");
            System.out.println("Silahkan pilih opsi 1 atau 2");
            System.out.println("=============================================================");
            int Pilihan = v.nextInt(); 

            if (Pilihan == 1) {
                if (PenghitungTimer < Timer.length) {
                    System.out.println("Silahkan masukkan waktu belajar! (dalam menit)");
                    int WaktuMenit = v.nextInt(); 
                    int WaktuDetik = WaktuMenit*60; 
                    Timer [PenghitungTimer] = WaktuDetik; 
                    PenghitungTimer++;
                    System.out.println("Timer untuk " + WaktuMenit + " menit telah diset!");
                    penghitungWaktu(WaktuDetik);
                } else {
                    System.out.println("Timer sudah mencapai batas maksimum.");
                }
            } else if (Pilihan == 2) {
                System.out.println("Terima kasih sudah menggunakan Study Timer!");
                break;  
            } else {
                System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
        v.close();
 }
} 
