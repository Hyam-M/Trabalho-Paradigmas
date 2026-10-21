public class JogadorSuporte extends Jogador{
    public JogadorSuporte(){};
    public JogadorSuporte(int atk, int def, boolean vivo, int linha, int coluna){ //atk e def serao aleatorios, quando for inicializar o jogSuporte deve 
    //passar um valor random em atk e def
        super(atk, def, vivo, linha, coluna);
    }

    public void restaurar(JogadorSimples p1, int aumentoDef){
        p1.def += aumentoDef;
    }
    public void restaurar(int aumentoDef){
        this.def += aumentoDef;
    }
    //jogadorsup deve possuir atk menor q o jogsimples, criar funcao para verificar isso

}
