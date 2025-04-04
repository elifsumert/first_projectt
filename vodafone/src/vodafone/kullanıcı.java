package vodafone;
public class kullanıcı {
	 // Kullanıcı bilgilerini oluşturdum
    int bakiye;
    int sms;
    int Gb;
    int dk;
    String tarife;
    
    // Yapıcı metodun ismi sınıf ismiyle aynı olmalıdır ve parametre alacak şekilde tanımlanmalıdır
    public void Kullanıcı(int bakiye, int sms, int Gb, int dk, String tarife) {
        this.bakiye = bakiye;
        this.sms = sms;
        this.Gb = Gb;
        this.dk = dk;
        this.tarife = tarife;
    }

    // Parametresiz bir yapıcı metod da ekleyebilirsiniz (Opsiyonel)
   /* public void Kullanıcı() {
    	
    }*/
}
