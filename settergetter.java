/*    */ package Setter & Getter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class settergetter
/*    */ {
/*    */   protected String alamat;
/*    */   private int luas;
/*    */   private double harga;
/*    */   
/*    */   public void setalamat(String Alamat) {
/* 18 */     this.alamat = Alamat;
/*    */   }
/*    */   public String getalamat() {
/* 21 */     return this.alamat;
/*    */   }
/*    */   public void setluas(int panjang, int lebar) {
/* 24 */     this.luas = panjang * lebar;
/*    */   }
/*    */   public int getluas() {
/* 27 */     return this.luas;
/*    */   }
/*    */   public void setharga(double Harga) {
/* 30 */     this.harga = Harga;
/*    */   }
/*    */   public double getharga() {
/* 33 */     return this.harga;
/*    */   }
/*    */ }


/* Location:              D:\NetBeansProjects\Pemanggilan\build\classes\!\Setter & Getter\settergetter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */