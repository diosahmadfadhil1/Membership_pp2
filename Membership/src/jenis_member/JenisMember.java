/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jenis_member;

/**
 *
 * @author LENOVO
 */

// JenisMember adalah class yang digunakan untuk menyimpan data jenis member
public class JenisMember {

    // id adalah variabel yang digunakan untuk menyimpan id dari jenis member
    private String id;

    // nama adalah variabel yang digunakan untuk menyimpan nama dari jenis member
    private String nama;

    // Setter id digunakan untuk mengubah nilai dari variabel id
    public void setId(String id) {
        // this.id diberikan nilai dari parameter id
        this.id = id;
    }

    // Getter id digunakan untuk mengambil nilai dari variabel id
    public String getId() {
        // mengembalikan nilai dari variabel id
        return this.id;
    }

    // Setter nama digunakan untuk mengubah nilai dari variabel nama
    public void setNama(String nama) {
        // this.nama diberikan nilai dari parameter nama
        this.nama = nama;
    }

    // Getter nama digunakan untuk mengambil nilai dari variabel nama
    public String getNama() {
        // mengembalikan nilai dari variabel nama
        return this.nama;
    }
}
