
package exemplos;

public class AviaoSenac {
    
    private String cor;
    String marca = "A101";
    int velocidade;
    double altitude;
    boolean ligado = false;
    
    public AviaoSenac(){
        this.cor = "Branca";
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    //Ações = metodos
    
    public boolean ligar(){
        this.ligado = true;
        return ligado;
    }
    
    public int acelerar(int novaVelocidade){
        this.velocidade += novaVelocidade;
        return velocidade;
    }
    
    public void setCor(String novaCor){
        this.cor = novaCor.toUpperCase();
    }
    
    public String getCor(){
        return this.cor.toUpperCase();
    }
}
