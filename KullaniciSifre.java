import java.util.Scanner;

public class KullaniciSifre {
    public static void main(String[] args) {
        String username, password;

        Scanner input = new Scanner(System.in);

        //--------------LOG İN KISMI----------------

        System.out.println("Web Sitemize HoşGeldiniz !");
        System.out.print("Kullanıcı Adınızı Giriniz:  ");
        username = input.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        //-------------TANIMLANMIŞ VERİLER KISMI----------------

        if (username.equals("tubamhd") && password.equals("523456Vb")) {
            System.out.println("Başarılı bir şekilde giriş yaptınız! Bravo ");
        } else {
            System.out.println("Girilen Bilgiler Yanlış! ");
        }

        //-------------ŞİFRENİN YANLIŞ OLMASI DOĞRULTUSUNDA ŞİFRE YENİLEME KISMI-----------

        System.out.print("Hangi işlem ile devam etmek istersiniz?\n1-Şifreyi Değiştir.\n2-Şifremi Unuttum : ");
        int select = input.nextInt();

        switch (select) {
            case 1:
                String newpassword;
                System.out.print("Yeni şifreniz : " + input.nextLine());
                newpassword = input.nextLine();
                if (newpassword.equals("523456Vb")) {
                    System.out.println("Yeni Şifre Eskisi ile aynı olamaz. Yeni şifre oluşturulamadı. ");
                } else {
                    System.out.println("Şifreniz oluşturuldu. ");
                }
                break;
            case 2:
                System.out.println("Mutlu Günler Dileriz!");
                break;
        }

    }
}
