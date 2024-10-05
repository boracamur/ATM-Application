import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bakiye1 = 2450;
        String iban1 = "TR55 5465 7899 4512 4867 2154";
        String KullaniciAdi1 = "Bora";
        String Sifre1 = "bora1234";

        double Bakiye2 = 1000;
        String iban2 = "TR68 5465 7899 4512 7787 2154";
        String KullaniciAdi2 = "Ali";
        String Sifre2 = "ali123";

        System.out.print("ATM'YE HOŞGELDİNİZ: ");
        System.out.print("LÜTFEN BİLGİLERİNİZİ GİRİNİZ: ");

        System.out.print("Kullanıcı Adı: ");
        String kullaniciAdi = scanner.nextLine();

        System.out.print("şifre: ");
        String sifre = scanner.nextLine();

        if (kullaniciAdi.equals(KullaniciAdi1) && sifre.equals(Sifre1)) {
            System.out.println("Hoşgeldin " + KullaniciAdi1);
            System.out.println("1-Para Çekme");
            System.out.println("2-Para Yatırma");
            System.out.println("3-Bakiye Sorgulama");
            System.out.println("4-Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    System.out.print("Çekmek istediğiniz tutar: ");
                    double cekilecekTutar = scanner.nextDouble();
                    if (cekilecekTutar > bakiye1) {
                        System.out.println("Yetersiz Bakiye");
                    } else {
                        bakiye1 -= cekilecekTutar;
                        System.out.println("Yeni Bakiyeniz: " + bakiye1);
                    }
                    break;
                case 2:
                    System.out.print("Yatırmak istediğiniz tutar: ");
                    double yatirilacakTutar = scanner.nextDouble();
                    bakiye1 += yatirilacakTutar;
                    System.out.println("Yeni Bakiyeniz: " + bakiye1);
                    break;
                case 3:
                    System.out.println("Bakiyeniz: " + bakiye1);
                    break;
                case 4:
                    System.out.println("Çıkış Yapıldı");
                    break;
                default:
                    System.out.println("Geçersiz İşlem");
                    break;
            }
        } else if (kullaniciAdi.equals(KullaniciAdi2) && sifre.equals(Sifre2)) {
            System.out.println("Hoşgeldin " + KullaniciAdi2);
            System.out.println("1-Para Çekme");
            System.out.println("2-Para Yatırma");
            System.out.println("3-Bakiye Sorgulama");
            System.out.println("4-Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    System.out.print("Çekmek istediğiniz tutar: ");
                    double cekilecekTutar = scanner.nextDouble();
                    if (cekilecekTutar > Bakiye2) {
                        System.out.println("Yetersiz Bakiye");
                    } else {
                        Bakiye2 -= cekilecekTutar;
                        System.out.println("Yeni Bakiyeniz: " + Bakiye2);

                    }
                    break;
                case 2:
                    System.out.print("Yatırmak istediğiniz tutar: ");
                    double yatirilacakTutar = scanner.nextDouble();
                    Bakiye2 += yatirilacakTutar;
                    System.out.println("Yeni Bakiyeniz: " + Bakiye2);
                    break;
                case 3:
                    System.out.println("Bakiyeniz: " + Bakiye2);
                    break;

                case 4:
                    System.out.println("Çıkış Yapıldı");
                    break;
                default:
                    System.out.println("Geçersiz İşlem");
                    break;

            }
        }else {
            System.out.println("Hatalı Giriş Yaptınız");
        }
    }
}