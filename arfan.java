// rupiah class generic 

class rupiah <Number>{
     Number rp;

   public rupiah(Number rp) {
        this.rp = rp;
    }

    Number cetakRp() {
        return rp;
    }

}

// dollar nongeneric;
class dollar extends rupiah<Number> {
    int $, kurs;

    // public dollar(Number rp) {
    //    super(rp);
      
    // }

    public dollar (int $ , Number rp){
        super(rp);
        this.$ =$;
        kurs = 14000;      

    }

    int cetak$(){
        return $;

    }

    int cetakKurs(){
        return $*kurs;
    }
}



public class arfan{
    public static void main(String[] args){
        // var a = new rupiah(20000);
        var b = new dollar(2, 30000);

        rupiah<Integer> a = new rupiah<>(20000);
        System.out.println("uang rupiah a : "+ a.cetakRp() );
        System.out.println("Uang Rupiah B : "+ b.cetakRp());
        System.out.println("Uang dollah B : "+b.cetak$());

        System.out.println(
            "Uang dolar b jika Ingin di Konversikan ke rupiah :  "+b.cetakKurs());
        System.out.println("Jumlah rupiah Bilal  : "+b.cetakKurs()+"  Dan  "+ b.cetakRp());
    }
}