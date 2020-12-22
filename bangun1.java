import java.util.Scanner;

class bang{
    int luas , panjang , lebar ,tinggi ;

    void setPanjang(int panjang){
        this.panjang = panjang;

    }

    void setLebar(int lebar){
        this.lebar = lebar ;

    }

    void setTotal(int luas ){
        this.luas = luas;

    }

    void setTinggi(int tinggi ){
        this.tinggi = tinggi ;

    }

}

class hitper extends bang{
    int kelper(){
        return 2 * (panjang * lebar );

    }

    int luasper(){
        return panjang * lebar;

    }

    int luas1(){
        return (luas ) + (panjang * lebar);

    }

    int luasblok(){
        return (2 * panjang * tinggi ) + (2* panjang * lebar ) + (2 * lebar * tinggi);

    }

    int volumebalok(){
        return panjang * lebar * tinggi ;

    }
}

public class bangun1{
    public static void main (String[] args){
        Scanner scr = new Scanner(System.in);

        var x = new hitper();

        System.out.print(" Panjang Persegi Panjang = " );
        int pjg = scr.nextInt();

        System.out.print(" Lebar persegi panjang = ");
        int lbr = scr.nextInt();

        System.out.print(" Tinggi balok = ");
        int b = scr.nextInt();

        x.setPanjang(pjg);
        x.setLebar(lbr);
        x.setTinggi(b);

        System.out.println(" \n------------------------------");
        System.out.println(" Hitung Persegi panjang ");
        System.out.println("---------------------------------");
        System.out.println(" 2(" + pjg + " x "+ lbr + ") =" + x.kelper() + " cm");
        System.out.println(" Keliling persegi panjang ");
        System.out.println(pjg + "x" + lbr + "="+ x.luasper()+ " cm");
        System.out.println("---------------------------------");
        System.out.println("Hitung balok ");
        System.out.println("\n-------------------------------");
        System.out.println(" luas balok ");
        System.out.println(x.luasblok() + " cm");
        System.out.println(" Volume Balok ");
        System.out.println(x.volumebalok() +" cm");

    }
}