package vodafone;

import java.util.Scanner;

public class main {
	 public static void main(String[] args) {
	        // Kullanıcı nesnesini parametrelerle başlatıyoruz
	        kullanıcı kullanıcı1 = new kullanıcı();  
	        kullanıcı1.bakiye=1000;
			kullanıcı1.dk= 0;
			kullanıcı1.Gb=0;
			kullanıcı1.sms=0; 


	        Scanner entry = new Scanner(System.in);
	        
	        // Sistemin tekrarlanması için döngü oluşturduk
	        while (kullanıcı1.bakiye > 0) {
	            while (true) {
	                System.out.println();
	                System.out.println("KULLANICI MENÜSÜ:");
	                System.out.println("1) DK Satın al (2000 DK - 130 TL)");
	                System.out.println("2) SMS Satın al (500 SMS - 250 TL)");
	                System.out.println("3) GB Satın al (40 GB - 340 TL)");
	                System.out.println("4) Hazır Tarifeler");
	                System.out.println("5) Bakiye Öğrenme");
	                System.out.print("Bir seçeneği seçiniz: ");
	                
	                // Kullanıcıdan seçim alınır
	                int i = entry.nextInt();
	                System.out.println();
	                
	                // Kullanıcının seçimine göre işlemler yapılır
	                switch (i) {
	                    case 1:
	                        if (kullanıcı1.bakiye >= 130) {
	                            kullanıcı1.bakiye -= 130;
	                            kullanıcı1.dk += 2000;
	                            kullanıcı1.tarife = "Dakika";
	                        } else {
	                            System.out.println("Bakiye yetersiz!");
	                        }
	                        break;
	                    
	                    case 2:
	                        if (kullanıcı1.bakiye >= 250) {
	                            kullanıcı1.bakiye -= 250;
	                            kullanıcı1.sms += 500;
	                            kullanıcı1.tarife = "SMS";
	                        } else {
	                            System.out.println("Bakiye yetersiz!");
	                        }
	                        break;
	                    
	                    case 3:
	                        if (kullanıcı1.bakiye >= 340) {
	                            kullanıcı1.bakiye -= 340;
	                            kullanıcı1.Gb += 40;
	                            kullanıcı1.tarife = "GB";
	                        } else {
	                            System.out.println("Bakiye yetersiz!");
	                        }
	                        break;
	                    
	                    case 4:
	                        System.out.println("1) Vodafone Red (1 GB, 100 SMS, 1000 DK) - 310 TL");
	                        System.out.println("2) Vodafone Öğrenci (20 GB, 250 SMS, 750 DK) - 200 TL");
	                        System.out.println("3) İnternet Paketi (15 GB) - 100 TL");
	                        System.out.println("4) Tunahanzi Paket (8 GB, 100 SMS, 500 DK) - 180 TL");
	                        System.out.print("Bir seçeneği seçiniz: ");
	                        
	                        int a = entry.nextInt();
	                        System.out.println();
	                        
	                        switch (a) {
	                            case 1:
	                                if (kullanıcı1.bakiye >= 310) {
	                                    kullanıcı1.tarife = "Vodafone Red";
	                                    kullanıcı1.bakiye -= 310;
	                                    kullanıcı1.dk += 1000;
	                                    kullanıcı1.Gb += 1;
	                                    kullanıcı1.sms += 100;
	                                } else {
	                                    System.out.println("Bakiye yetersiz!");
	                                }
	                                break;
	                            
	                            case 2:
	                                if (kullanıcı1.bakiye >= 200) {
	                                    kullanıcı1.tarife = "Vodafone Öğrenci";
	                                    kullanıcı1.bakiye -= 200;
	                                    kullanıcı1.dk += 750;
	                                    kullanıcı1.Gb += 20;
	                                    kullanıcı1.sms += 250;
	                                } else {
	                                    System.out.println("Bakiye yetersiz!");
	                                }
	                                break;
	                            
	                            case 3:
	                                if (kullanıcı1.bakiye >= 100) {
	                                    kullanıcı1.tarife = "İnternet Paketi";
	                                    kullanıcı1.bakiye -= 100;
	                                    kullanıcı1.Gb += 15;
	                                } else {
	                                    System.out.println("Bakiye yetersiz!");
	                                }
	                                break;
	                            
	                            case 4:
	                                if (kullanıcı1.bakiye >= 180) {
	                                    kullanıcı1.tarife = "Tunahanzi Paket";
	                                    kullanıcı1.bakiye -= 180;
	                                    kullanıcı1.dk += 500;
	                                    kullanıcı1.Gb += 8;
	                                    kullanıcı1.sms += 100;
	                                } else {
	                                    System.out.println("Bakiye yetersiz!");
	                                }
	                                break;
	                            
	                            default:
	                                System.out.println("Geçersiz seçenek girdiniz.");
	                                break;
	                        }
	                        break;
	                    
	                    case 5:
	                        System.out.println("Bakiye: " + kullanıcı1.bakiye + " TL");
	                        break;
	                    
	                    default:
	                        System.out.println("Geçersiz seçenek girdiniz.");
	                        break;
	                }
	                
	                // Her işlemden sonra bakiye durumunu gösteriyoruz
	                System.out.println("-- Bakiye: " + kullanıcı1.bakiye
	                        + " TL, Dakika: " + kullanıcı1.dk
	                        + " DK, İnternet: " + kullanıcı1.Gb
	                        + " GB, SMS: " + kullanıcı1.sms
	                        + " SMS, Kullanılan Tarife: " + kullanıcı1.tarife + " --");
	            }
	        }
	        
	        
	    }
}

