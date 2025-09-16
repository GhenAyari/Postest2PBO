package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.Hewan;

public class HewanService {
    private ArrayList<Hewan> daftarHewan = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    // CREATE
    public void tambahHewan() {
        System.out.print("Nama Hewan   : ");
        String nama = input.nextLine();
        System.out.print("Jenis Hewan  : ");
        String jenis = input.nextLine();
        System.out.print("Habitat Hewan: ");
        String habitat = input.nextLine();
        System.out.print("Umur Hewan   : ");
        float umur = input.nextFloat();
        input.nextLine();

        Hewan hewan = new Hewan(nama, jenis, habitat, umur);
        daftarHewan.add(hewan);
        System.out.println("Hewan berhasil ditambahkan!");
    }

    // READ
    public void lihatHewan() {
        if (daftarHewan.isEmpty()) {
            System.out.println("Belum ada data hewan.");
        } else {
            for (int i = 0; i < daftarHewan.size(); i++) {
                System.out.println((i + 1) + ". " + daftarHewan.get(i));
            }
        }
    }

    public void ubahHewan() {
        lihatHewan();
        if (!daftarHewan.isEmpty()) {
            System.out.print("Pilih nomor hewan yang ingin diubah: ");
            int index = input.nextInt();
            input.nextLine();

            if (index > 0 && index <= daftarHewan.size()) {
                System.out.print("Nama Hewan Baru   : ");
                String nama = input.nextLine();
                System.out.print("Jenis Hewan Baru  : ");
                String jenis = input.nextLine();
                System.out.print("Habitat Hewan Baru: ");
                String habitat = input.nextLine();
                System.out.print("Umur Hewan Baru   : ");
                float umur = input.nextFloat();
                input.nextLine();

                Hewan hewanBaru = new Hewan(nama, jenis, habitat, umur);
                daftarHewan.set(index - 1, hewanBaru);
                System.out.println("Data hewan berhasil diubah!");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }

    public void hapusHewan() {
        lihatHewan();
        if (!daftarHewan.isEmpty()) {
            System.out.print("Pilih nomor hewan yang ingin dihapus: ");
            int index = input.nextInt();
            input.nextLine();

            if (index > 0 && index <= daftarHewan.size()) {
                daftarHewan.remove(index - 1);
                System.out.println("Data hewan berhasil dihapus!");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }
}
