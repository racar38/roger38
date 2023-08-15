package proje_practice;

import java.time.LocalDateTime;

public class AUser {

    /* Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak
     ekleyen ve sonrasında her dakikanın ilk 10 saniyesinde kaydolanları
     şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.
     Bunun için;
     1- Bir user(Kullanıcı) class oluşturun fields: name , registerDate(kayıtZamanı) (LocalDateTime cinsinden)
     2- Registration(Kayıt) isminde bir class oluşturun ve register()(kayıtAl()) isminde bir metod
     ekleyerek Kullanıcıdan user ismini alarak ArrayList e ekleyin ve bu list i
     return edin.
     3- Registration(Kayıt) classı na aynı zamanda kendine verilen
     ArrayListteki userlardan(kullanıcı) her dakikanın ilk 10  saniyesinde kaydolanları
     yazdıran printHappyUsers(sanslıKullanıcı) isminde bir metod daha ekleyiniz.

     */

    // 1- Bir user(Kullanıcı) class oluşturun fields: name , registerDate(kayıtZamanı) (LocalDateTime cinsinden)

    String name;                            // kalıbımızı oluşturduk...
    LocalDateTime registerDate;

    public AUser() { //p'siz cons. oluşturuldu... kalıbımızı kullanmak içim oluşturduk.Oluşturmasak da default cons.çalışır
    }

    public AUser(String name, LocalDateTime registerDate) { // p'li cons. oluşturuldu. kalıbımızı kullanmak için oluşturuldu.
        this.name = name;
        this.registerDate = registerDate;
    }


    // parametreli bir const. olusturulursa parametresiz const. devre dışı kalır...


}








