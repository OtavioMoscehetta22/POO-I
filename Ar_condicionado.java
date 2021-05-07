/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_carro;

/**
 *
 * @author Cliente
 */
public class Ar_condicionado {
    private int Temperatura;
    private boolean ligado;
    
    public int getTemperatura() {
        return this.Temperatura;
    }
    
    public void setTemperatura(int Temperatura) {
        if(Temperatura >= 0 && Temperatura <= 10){
            this.Temperatura = Temperatura; 
            
            if (this.Temperatura == 0) {
                this.ligado = false;
            } else{
                this.ligado = true;
            }
        }else{
            System.out.println (" Apenas Temperatura entre 0 e 10 ");
        }      
    }
    
    public void LigarAr() {
        if (this.Temperatura >= 10){
            System.out.println(" O Ar ja está em sua temperatura máxima ");
        }else {
            this.Temperatura += 2;
            
            if (this.Temperatura == 10) {
                this.ligado = false;
            }
        }        
    }
    
    public void DesligarAr() {
        if (this.Temperatura <= 0){
            System.out.println(" O Ar ja está Desligado ");
        }else {
            this.Temperatura -= 2;   
            this.ligado = true ;
        }    
    }
    
     public void status() {
        System.out.println(" ligado " + this.ligado);
        System.out.println(" temperatura " + this.Temperatura);
    }
}
