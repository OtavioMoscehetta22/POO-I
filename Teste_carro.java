package teste_carro;

public class Teste_carro {

    public static void main(String[] args) {
        Ar_condicionado m1 = new Ar_condicionado();
        
        m1.LigarAr();
        m1.LigarAr();
        //m1.status();
        System.out.println("temperatura " + m1.getTemperatura());

        m1.DesligarAr();
        //m1.status();
        System.out.println("temperatura " + m1.getTemperatura()); 
        
        m1.setTemperatura(0);
        System.out.println("temperatura " + m1.getTemperatura());
    }
    
}
