import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        ArrayList<Hewan> dataHewan = new ArrayList<>();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        while(true) {
            System.out.println("""
                =============================
                |            Menu           |
                =============================
                | 1. Tambah data hewan      |
                | 2. Lihat data hewan       |
                | 3. Ubah data hewan        |
                | 4. Hapus data hewan       |
                | 0. Exit                   |
                =============================
                """);
            System.out.print("input : ");
            String menu = br.readLine();
            if (menu.equals("1")) {
                tambahData(dataHewan, br);
            } else if (menu.equals("2")) {
                tampilkanData(dataHewan);
            } else if (menu.equals("3")) {
                if (!dataHewan.isEmpty()) {
                    tampilkanData(dataHewan);
                    ubahData(dataHewan, br);
                } else {
                    System.out.println("Tidak ada data hewan. Tidak dapat mengubah data.");
                }
            } else if (menu.equals("4")) {
                if (!dataHewan.isEmpty()) {
                    tampilkanData(dataHewan);
                    hapusData(dataHewan, br);
                } else {
                    System.out.println("Tidak ada data hewan. Tidak dapat menghapus data.");
                }
            } else if (menu.equals("0")) {
                System.out.println("Keluar dari Program...");
                System.exit(0);
            } else {
                System.out.println("Input Salah");
            }
        }
    }

    public static void tambahData(ArrayList<Hewan> dataHewan, BufferedReader br) throws IOException {
        System.out.print("Masukkan Nama Hewan : ");
        String nama = br.readLine();
        System.out.print("Masukkan Jenis Hewan : ");
        String jenis = br.readLine();
        int umur = validasiUmur(br);

        Hewan hwnBaru = new Hewan(nama, jenis, umur);
        dataHewan.add(hwnBaru);
    }

    public static void tampilkanData(ArrayList<Hewan> dataHewan) {
        if (dataHewan.isEmpty()) {
            System.out.println("Tidak ada data hewan.");
        } else {
            for (int i = 0; i < dataHewan.size(); i++) {
                System.out.println("Data Hewan ke-" + (i + 1));
                dataHewan.get(i).tampil();
                System.out.println("================================================================");
            }
        }
    }

    public static int validasiUmur(BufferedReader br) {
        int umur = 0;
        boolean valid = false;
        do {
            try {
                System.out.print("Masukkan Umur Hewan : ");
                String input = br.readLine();
                umur = Integer.parseInt(input);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Umur harus berupa angka. Silakan masukkan kembali.");
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan saat membaca input. Silakan coba lagi.");
            }
        } while (!valid);
        return umur;
    }

    public static void ubahData(ArrayList<Hewan> dataHewan, BufferedReader br) throws IOException {
        for (int i = 0; i < dataHewan.size(); i++) {
            System.out.println("Data Hewan ke-" + (i + 1));
            dataHewan.get(i).tampil();
            System.out.println("============================================");
        }
        
        int nomorData = validasiNomorData("Ubah", dataHewan.size(), br);
        int ubah = nomorData - 1;
    
        if (ubah >= 0 && ubah < dataHewan.size()) {
            System.out.print("Masukkan nama hewan baru : ");
            dataHewan.get(ubah).nama = br.readLine();
            System.out.print("Masukkan jenis hewan baru : ");
            dataHewan.get(ubah).jenis = br.readLine();
            dataHewan.get(ubah).umur = validasiUmur(br);
            System.out.println("Berhasil ubah data!");
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }

    public static void hapusData(ArrayList<Hewan> dataHewan, BufferedReader br) throws IOException {
        int nomorData = validasiNomorData("Hapus", dataHewan.size(), br);
        
        if (nomorData >= 1 && nomorData <= dataHewan.size()) {
            dataHewan.remove(nomorData - 1);
            System.out.println("Data berhasil dihapus!");
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }

    public static int validasiNomorData(String tindakan, int jumlahData, BufferedReader br) throws IOException {
        int nomor = 0;
        boolean valid = false;
        do {
            try {
                System.out.print("Masukkan nomor data yang akan " + tindakan + " : ");
                String input = br.readLine();
                nomor = Integer.parseInt(input);
                if (nomor >= 1 && nomor <= jumlahData) {
                    valid = true;
                } else {
                    System.out.println("Nomor data tidak valid. Silakan masukkan nomor yang sesuai.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nomor data harus berupa angka. Silakan masukkan kembali.");
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan saat membaca input. Silakan coba lagi.");
            }
        } while (!valid);
        return nomor;
    }
}