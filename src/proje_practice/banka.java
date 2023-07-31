package proje_practice;

import java.util.Scanner;

public class banka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctPin = 1234; // Örnek doğru şifre
        int pin;
        String cardNumber;

        System.out.print("Kart Numarasını Giriniz: ");
        cardNumber = scanner.nextLine().replaceAll("\\s", ""); // Boşlukları kaldırma

        while (!isValidCardNumber(cardNumber)) {
            System.out.print("Geçersiz Kart Numarası. Lütfen Tekrar Giriniz: ");
            cardNumber = scanner.nextLine().replaceAll("\\s", "");
        }

        System.out.print("Şifreyi Giriniz: ");
        pin = scanner.nextInt();

        while (pin != correctPin) {
            System.out.print("Yanlış Şifre. Lütfen Tekrar Giriniz: ");
            pin = scanner.nextInt();
        }

        // Kart numarası ve şifre doğrulandı, işlemleri göster
        showMenu();
        int choice = scanner.nextInt();

        while (choice != 6) {
            switch (choice) {
                case 1:
                    // Bakiye sorgula işlemi
                    // Bakiye sorgulama işlemini gerçekleştir
                    break;
                case 2:
                    // Para yatırma işlemi
                    // Para yatırma işlemini gerçekleştir
                    break;
                case 3:
                    // Para çekme işlemi
                    // Para çekme işlemini gerçekleştir
                    break;
                case 4:
                    // Para gönderme işlemi
                    // Para gönderme işlemini gerçekleştir
                    break;
                case 5:
                    // Şifre değiştirme işlemi
                    // Şifre değiştirme işlemini gerçekleştir
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                    break;
            }

            showMenu();
            choice = scanner.nextInt();
        }

        System.out.println("İyi günler!");
    }

    private static boolean isValidCardNumber(String cardNumber) {
        // Burada kart numarasının doğruluğunu kontrol edebilirsiniz.
        // Örneğin, kart numarasının uzunluğu, başlangıç karakteri vb. kontrol edilebilir.
        // Burada sadece basit bir doğrulama yapıyoruz.
        return cardNumber.length() == 16;
    }

    private static void showMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1. Bakiye Sorgula");
        System.out.println("2. Para Yatırma");
        System.out.println("3. Para Çekme");
        System.out.println("4. Para Gönderme");
        System.out.println("5. Şifre Değiştirme");
        System.out.println("6. Çıkış");
        System.out.print("Seçiminizi Giriniz: ");
    }


}
