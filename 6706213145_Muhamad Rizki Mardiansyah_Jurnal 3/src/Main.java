import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        LinkedList<Pegawai> pegawai = new LinkedList<>();

        pegawai.insertAtFront(new Pegawai("1234", "Abdul", "Produksi"));
        pegawai.insertAtFront(new Pegawai("1345", "Linda", "Pemasaran"));
        pegawai.insertAtFront(new Pegawai("1432", "Raihan", "Pemasaran"));
        pegawai.insertAtFront(new Pegawai("1334", "Sintya", "Produksi"));

        System.out.println("Pilihlah Menu : ");
        System.out.println("1. Input Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Cetak List Pegawai");
        System.out.println("4. Keluar");

        int nomor = s.nextInt();
        switch (nomor){
            case (1) : // Case 1 yaitu untuk mengimput data baik dari awal maupun akhir
                System.out.println("Tambah data di awal(0)/akhir(1) : ");
                int nomorSatu = s.nextInt();
                    switch (nomorSatu){
                        case (0) :// Case ini digunakan untuk menginput data dari Awal
                            System.out.println("Masukan NIP, Nama, Divisi : ");
                            int a = s.nextInt();
                            String inputSatu = pegawai.intToString(a);
                            String inputDua = s.nextLine();
                            String inputTiga = s.nextLine();
                            pegawai.insertAtFront(new Pegawai(inputSatu, inputDua, inputTiga));
                            pegawai.print();
                            break;

                        case (1) : // Case ini digunakan untuk menginput data dari Akhir
                            System.out.println("Masukan NIP, Nama, Divisi : ");
                            int b = s.nextInt();
                            String inputEmpat = pegawai.intToString(b);
                            String inputLima = s.nextLine();
                            String inputEnam = s.nextLine();
                            pegawai.insertAtBack(new Pegawai(inputEmpat, inputLima, inputEnam));
                            pegawai.print();
                            break;
                    }
            case (2) : // Case 2 yaitu untuk menghapus data
                System.out.println("Hapus data di awal(0)/akhir(1) : ");
                int nomorDua = s.nextInt();
                switch (nomorDua) {
                    case (0): // Case ini digunakan untuk menghapus data dari Awal
                        pegawai.removeFromFront(pegawai);
                        pegawai.print();
                        break;

                    case (1): // Case ini digunakan untuk menghapus data dari Akhir
                        pegawai.removeFromBack(pegawai);
                        pegawai.print();
                        break;
                }
            case (3) : // Case ini digunakan untuk mencetak list pegawai
                pegawai.print();
                break;
            case (4) :// Keluar
                break;
        }
    }
}