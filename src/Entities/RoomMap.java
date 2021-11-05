/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author you have to better
 */
public class RoomMap {
    int soPhong;
    int soTang;

    public RoomMap() {
    }

    public RoomMap(int soPhong, int soTang) {
        this.soPhong = soPhong;
        this.soTang = soTang;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }
    
    
}
