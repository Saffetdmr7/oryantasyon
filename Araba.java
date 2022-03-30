package world;

public class Araba {

    private int ilksüre = 0;
    int maxHız = 250;// KM/saat
    int ivme = 10;//  Hız/Zaman
    int ivmeArtışı = 5;// Gaza basılan saniye başı artan ivme
    int klimaDerecesi = 0; // 0 ile 25 arası ikiside dahil
    int radyoKanalı = 0;// 0 ile 7 arası ikiside dahil
    boolean klima = false;
    boolean silecek = false;
    boolean farUzun = false;
    boolean farKısa = false;
    boolean radyo = false;
    boolean acık = false;
    boolean sagSinyal = false;
    boolean solSinyal = false;
    boolean dörtlü = false;
    boolean camAcıkMı = false; // pencerenin kilit durumu
    int sağCam = 10; // pencerenin açıklık seviyesi 0-10 arası 0 full açık demek
    int solCam = 10; // pencerenin açıklık seviyesi 0-10 arası 0 full açık demek
    String aracSınıfı = "Spor";
    String renk = "Yeşil";
    String marka = "Audi";

    public Araba() {
    }

    public void ac() {
        acık = true;
        System.out.println("çalıştı");
    }

    public void kapa() {
        acık = false;
        System.out.println("Durduruldu");
    }

    public void gaz(int hız, int süre) {
        if (acık) {
            int ilkHız = 0;
            while (süre < 0 || süre == 0) {
                if (hız < 251) {
                    ilkHız += ivme;
                    ivme += ivmeArtışı;
                } else {
                    System.out.println("Maksimum hıza ulaştınız");
                    break;
                }
                süre--;

            }
            hız += ilkHız;
            System.out.println("Son hız = " + hız);
        } else {
            System.out.println("Önce aracı çalıştırınız");
        }
    }

    public void fren(int hız, int süre) {
        int ilkHız = 0;
        if (acık) {
            while (süre == 0 || süre < 0) {
                if ((hız + ilkHız) > 0) {
                    ilkHız -= ivme;
                    ivme += ivmeArtışı;
                } else {
                    System.out.println("Araç durdu");
                    break;
                }
            }
            hız += ilkHız;
            System.out.println("Son hız = " + hız);
        } else {
            System.out.println("Lütfen önce aracı çalıştırınız");
        }
    }

    public void radyoAc() {
        if (acık) {
            radyo = true;
            System.out.println("Radyo açıldı");
        } else {
            System.out.println("Önce arabayı çalıştırın");
        }
    }

    public void radyoKapa() {
        if (radyo) {
            radyo = false;
            System.out.println("Radyo kapandı");
        } else {
            System.out.println("Radyo zaten kapalı");
        }
    }

    public void radyoKanalıDeğiş(int kanal) {
        if (acık) {
            if (kanal > 0 && kanal < 8) {
                radyoKanalı = kanal;
                System.out.println("Yeni radyo kanalı = " + radyoKanalı);
            } else {
                System.out.println("1 ve 7 arasında bir kanal girmeniz gerekiyordu");
            }
        } else {
            System.out.println("Önce arabayı çalıştırınız");
        }
    }

    public void radyoArt() {
        if (radyoKanalı < 7) {
            radyoKanalı++;
            System.out.println("Radyo kanalı değişti \n Yeni kanal = " + radyoKanalı);
        } else {
            System.out.println("Son kanal çalıyor");
        }
    }

    public void radyoAzal() {
        if (radyoKanalı > 2) {
            radyoKanalı--;
            System.out.println("Radyo kanalı değişti \n Yeni kanal = " + radyoKanalı);
        } else {
            System.out.println("İlk kanal çalıyor");
        }
    }

    public void klimaAc() {
        if (acık) {
            klima = true;
            System.out.println("Klima açıldı");
        } else {
            System.out.println("Önce aracı çalıştırınız");
        }
    }

    public void klimaKapa() {
        if (klima) {
            klima = false;
            System.out.println("Klima kapandı");
        } else {
            System.out.println("Klima zaten çalışmıyor");
        }
    }

    public void klimaAyarla(int klima) {
        if (acık) {
            if (klima > -1 && klima < 26) {
                klimaDerecesi = klima;
                System.out.println("Yeni klima seviyesi = " + klimaDerecesi);
            } else {
                System.out.println("0-25 arasında bir sayı giriniz");
            }
        } else {
            System.out.println("Önce aracı çalıştırınız");
        }
    }

    public void klimaArttır() {
        if (klimaDerecesi < 25) {
            klimaDerecesi++;
            System.out.println("Yeni klima seviyesi = " + klimaDerecesi);
        } else {
            System.out.println("Maksimum dereceye ulaştı");
        }
    }

    public void klimaAzalt() {
        if (klimaDerecesi > 1) {
            klimaDerecesi--;
            System.out.println("Yeni klima seviyesi = " + klimaDerecesi);
        } else {
            System.out.println("Minimum dereceye ulaştı");
        }
    }

    public void sagSinyalVer() {
        if (acık) {
            sagSinyal = true;
            System.out.println("Sağa sinyal veriliyor");
        } else {
            System.out.println("Önce aracı çalıştırınız");
        }
    }

    public void sagSinyalKapa() {
        if (sagSinyal) {
            sagSinyal = false;
            System.out.println("Sağa verilen sinyal kapatıldı");
        } else {
            System.out.println("Sağ sinyal zaten kapalı");
        }
    }

    public void solSinyalVer() {
        if (acık) {
            solSinyal = true;
            System.out.println("Sola sinyal veriliyor");
        } else {
            System.out.println("Önce aracı çalıştırınız");
        }
    }

    public void solSinyalKapa() {
        if (solSinyal) {
            solSinyal = false;
            System.out.println("Sola verilen sinyal kapandı");
        } else {
            System.out.println("Sol sinyal zaten kapalı");
        }
    }

    public void dörtlüAç() {
        if (acık) {
            dörtlü = true;
            System.out.println("Dörtlüler açık");
        } else {
            System.out.println("Önce aracı çalıştırınız");
        }
    }

    public void dörtlüKapa() {
        if (dörtlü) {
            dörtlü = false;
            System.out.println("Dörtlüler kapandı");
        } else {
            System.out.println("Dörtlüler zaten açık");
        }
    }

    public void silecekAc() {
        if (acık) {
            silecek = true;
            System.out.println("Silecek çalışıyor");
        } else {
            System.out.println("Önce aracı çalıştırınız");
        }
    }

    public void silecekKapa() {
        if (acık && silecek) {
            silecek = false;
            System.out.println("Silecek durduruldu");
        } else {
            System.out.println("Silecek zaten kapalı");
        }
    }

    public void uzunFarAc() {
        if (acık) {
            farUzun = true;
            System.out.println("Uzun far açık");
        } else {
            System.out.println("Önce aracı çalıştırınız");
        }
    }

    public void uzunFarKapa() {
        if (acık && farUzun) {
            farUzun = false;
            System.out.println("Uzun verilen sinyal kapatıldı");
        } else {
            System.out.println("Far uzun sinyal vermiyor zaten");
        }
    }

    public void kısaFarAc() {
        if (acık) {
            farKısa = true;
            System.out.println("kısa far açıldı");
        } else {
            System.out.println("Önce aracı çalıştırınız");
        }
    }

    public void kısaFarKapa() {
        if (acık && farKısa) {
            farKısa = false;
            System.out.println("Kısa far kapatıldı");
        } else {
            System.out.println("Far kısa sinyal zaten vermiyor");
        }
    }

    public void camKilidiaç() {
        if (acık) {
            camAcıkMı = true;
            System.out.println("Pencere kilidi açıldı");
        } else {
            System.out.println("Önce aracı çalıştırınız");
        }
    }

    public void camKilitle() {
        camAcıkMı = false;
        System.out.println("Pencereler kilitli");
    }

    public void sağCamAç() {
        if (acık) {
            if (camAcıkMı) {
                if (sağCam > 0) {
                    sağCam--;
                    System.out.println("Sağ cam açılıyor \n Yeni seviyesi = " + sağCam);
                }
                System.out.println("Son seviyeye geldi");
            } else {
                System.out.println("Pencere kilitli");
            }

        } else {
            System.out.println("Önce aracı çalıştırıp pencerenin kilidini açınız");
        }
    }

    public void sağCamKapa() {
        if (acık) {
            if (sağCam < 10) {
                sağCam++;
                System.out.println("Sağ cam kapanıyor \n yeni seviyesi = " + sağCam);
            }
        } else {
            System.out.println("Önce aracı çalıştırınız");
        }
    }

    public void solCamAç() {
        if (acık && camAcıkMı) {
            if (solCam > 0) {
                solCam--;
                System.out.println("Sol cam açılıyor \n Yeni seviyesi = " + solCam);
            }
        }
        System.out.println("Önce aracı çalıştırıp pencerenin kilidini açınız");
    }

    public void solCamKapa() {
        if (acık) {
            if (solCam < 10) {
                solCam++;
                System.out.println("Sol cam kapanıyor \n Yeni seviyesi = " + solCam);
            }
        }
    }
}
