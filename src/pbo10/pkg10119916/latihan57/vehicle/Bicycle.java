/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119916.latihan57.vehicle;

/**
 *
 * @author DIAN
 */
public class Bicycle extends Vehicle {
     private int myGearCount;

    public Bicycle(String myBrand, String myMOdel) {
        super(myBrand, myMOdel);
        System.out.println("Bicycle");
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
    
}