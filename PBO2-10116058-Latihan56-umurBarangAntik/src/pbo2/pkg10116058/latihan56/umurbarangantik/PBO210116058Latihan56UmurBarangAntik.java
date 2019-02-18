/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan56.umurbarangantik;

class PBO210116058Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio rd = new Radio(0);
        BarangAntik br = new BarangAntik(0);
        rd.setName("Radio AM");
        
        System.out.println("Nama Barang Antik :" +rd.getName() );
        br.tampilUmur();
    }
    
}