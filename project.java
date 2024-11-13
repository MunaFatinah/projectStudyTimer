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
        System.out.println("Waktu belajar selesai! Selamat istirahat");
    }

    public static void Tampilan() {
        System.out.println("=====Selamat Datang di Study Timer=====");
        System.out.println("1. Atur timer belajar yang kamu inginkan dalam menit");
        System.out.println("2. Keluar");
    }

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in); 
        int [] Timer = new int [20]; 
        
    }
}
