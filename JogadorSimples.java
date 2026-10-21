public class JogadorSimples extends Jogador {
    public JogadorSimples(){};
    public JogadorSimples(int atk, int def, boolean vivo, int linha, int coluna){ //atk e def serao aleatorios, quando for inicializar o jogSimples deve passar um valor
        //random em atk e def
        super(atk, def, vivo, linha, coluna);
    }


}
