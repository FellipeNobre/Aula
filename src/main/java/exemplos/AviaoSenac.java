
package exemplos;

public class AviaoSenac {
    
    String cor;
    String marca = "A101";
    int velocidade;
    double altitude;
    boolean ligado = false;
    
    //Ações = metodos
    
    public boolean ligar(){
        this.ligado = true;
        return ligado;
    }
    
    public int acelerar(int novaVelocidade){
        this.velocidade += novaVelocidade;
        return velocidade;
    }
    
}
