  import org.w3c.dom.ls.LSOutput;

  import java.util.Scanner;

  public class Not_ortalaması_hesaplama {
      public static void main(String[] args) {

          int mat, fizik, kimya ,turkce, tarih, muzik;
          Scanner inp = new Scanner(System.in);

          System.out.println("Matematik notunuz:");
          mat = inp.nextInt();

          System.out.println("Fizik notunuz:");
          fizik = inp.nextInt();

          System.out.println("Kimya notunuz");
          kimya = inp.nextInt();

          System.out.println("Turkce notunuz:");
          turkce = inp.nextInt();

          System.out.println("Tarih notunuz:");
          tarih = inp.nextInt();

          System.out.println("Muzik notunuz:");
          muzik = inp.nextInt();

          int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
          double sonuc = (toplam / 6.0);
          System.out.println(sonuc);

          System.out.println(sonuc > 60.0 ? "Sınıfı geçti" : "Sınıfta kaldı1" );

      }
}


