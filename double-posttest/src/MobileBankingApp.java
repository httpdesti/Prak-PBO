import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;


public class MobileBankingApp {
    private static Map<String, User> users = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMainMenu();
    }

    private static void showMainMenu() {
        System.out.println("Selamat datang di Mobile Banking App");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Lihat Informasi Pengguna");
        System.out.println("0. Exit");

        try {
            System.out.print("Pilih menu : ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    viewUserInfo();
                    break;
                case 0:
                    System.out.println("Keluar dari Program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silahkan coba kembali.");
                    showMainMenu();
            }
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka.");
            scanner.nextLine(); // consume invalid input
            showMainMenu();
        }
    }

    private static void login() {
        System.out.print("Masukkan username : ");
        String username = scanner.nextLine();
        System.out.print("Masukkan  password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username) && users.get(username).checkPassword(password)) {
            System.out.println("Login berhasil!");
            showMainMenu();
        } else {
            System.out.println("Username atau password salah, silahkan coba kembali.");
            showMainMenu();
        }
    }

    private static void register() {
        System.out.print("Masukkan nama : ");
        String name = scanner.nextLine();
        System.out.print("Masukkan username : ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password : ");
        String password = scanner.nextLine();
        int phoneNumber = 0;

        try {
            System.out.print("Masukkan nomor HP : ");
            phoneNumber = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Nomor HP harus berupa angka.");
            scanner.nextLine(); // consume invalid input
            register();
        }

        System.out.print("Masukkan email : ");
        String email = scanner.next();

        if (users.containsKey(username)) {
            System.out.println("Username sudah digunakan, silahkan gunakan username lain.");
            register();
        } else {
            User user = new User(name, username, password, phoneNumber, email);
            users.put(username, user);
            System.out.println("Registrasi Berhasil!");
            showMainMenu();
        }
    }

    private static void viewUserInfo() {
        System.out.print("Masukkan username : ");
        String username = scanner.nextLine();

        if (users.containsKey(username)) {
            System.out.println("Informasi Pengguna :");
            users.get(username).displayUserInfo();
            System.out.println("===============================");
        } else {
            System.out.println("Pengguna tidak ditemukan.");
        }
        showMainMenu();
    }
}