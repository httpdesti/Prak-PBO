class User {
    private String name;
    private String username;
    private String password;
    private int phoneNumber; 
    private String email;

    public User(String name, String username, String password, int phoneNumber, String email) { // Perbarui konstruktor
        this.name = name;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public void displayUserInfo() {
        System.out.println("Nama : " + name);
        System.out.println("Username : " + username);
        System.out.println("Nomor HP : " + phoneNumber);
        System.out.println("Email : " + email);
    }
}