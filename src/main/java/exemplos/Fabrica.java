
package exemplos;

public class Fabrica {
    
    public static void main(String[] args){
        
        AviaoSenac meuAviao1 = new AviaoSenac();
        System.out.println("cor: " + meuAviao1.getCor() );
        
        AviaoSenac novoAviao = new AviaoSenac();
        novoAviao.setCor("vermelho");
        
        System.out.println(novoAviao.getCor() );
        
       novoAviao.acelerar();
       novoAviao.acelerar();
       System.out.println("Aviao - novoAviao - velocidade:" + novoAviao.getVelocidade());
    }
}
