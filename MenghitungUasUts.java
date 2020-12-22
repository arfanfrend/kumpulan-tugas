import java.util.Scanner;

public class MenghitungUasUts{
    public static void main(String[] args){
        GetSet g = new GetSet();

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nama Mahasiswa : ");
        g.setNama(sc.next());

        System.out.print("Masukan Nilai Uas : ");
        g.setUas(sc.nextInt());

        System.out.print("Masukan Nilai Uts : ");
        g.setUts(sc.nextInt());

        double total = (0.40 * g.getUas()) + (0.60 * g.getUts());

        System.out.println("Nilai Anda adalah : "+total);
        if (total <= 40){
            
            System.out.print("Nilai Grade : D");
        }
        else if (total <= 50){
            System.out.print("Nilai Grade : C");
        }
        else if (total <= 70){
            System.out.print("Nilai Grade : B");
        }else if (total >=70){
            System.out.println("Nilai Grade : A");
        }
        System.out.println("\n================================");
        

    }
}