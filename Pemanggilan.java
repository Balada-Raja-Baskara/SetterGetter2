/*    */ package Setter & Getter;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ import pemanggilan.settergetter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Pemanggilan
/*    */ {
/*    */   public static void main(String[] args) {
/* 20 */     Scanner io = new Scanner(System.in);
/* 21 */     settergetter waw = new settergetter();
/*    */     
/* 23 */     System.out.print("Masukan alamat (desa-kecamatan-kota) : ");
/* 24 */     String Alamat = io.nextLine();
/*    */     
/* 26 */     waw.setalamat(Alamat);
/*    */     
/* 28 */     System.out.print("Masukan panjang tanah : ");
/* 29 */     int panjang = io.nextInt();
/* 30 */     System.out.print("masukan lebar tanah : ");
/* 31 */     int lebar = io.nextInt();
/*    */     
/* 33 */     waw.setluas(panjang, lebar);
/*    */     
/* 35 */     System.out.print("Masukan harga tanah : ");
/* 36 */     double Harga = io.nextDouble();
/*    */     
/* 38 */     waw.setharga(Harga);
/*    */     
/* 40 */     String alamat = waw.getalamat();
/* 41 */     int luas = waw.getluas();
/* 42 */     double harga = waw.getharga();
/*    */     
/* 44 */     System.out.println("dijual rumah seharga :  " + harga + ", dengan luas : " + luas + ", alamat : " + alamat);
/*    */     
/* 46 */     System.out.println(panjang + "*" + lebar);
/*    */   }
/*    */ }


/* Location:              D:\NetBeansProjects\Pemanggilan\build\classes\!\Setter & Getter\Pemanggilan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */