public class Tabuleiro {
    /*
    int tipoSetor(0 = normal, 1 = oculto, 2 = privado);
    int qntdPortas; problema: como colocar uma porta pra cima? talvez com variaveis tipo cima = 0, esq = 1, dir = 2, baixo = 3?
    int qntdInimigos; ajudaria a saber se tds os inimigos estao mortos sem precisar percorrer tds os inimigos(provavelmente sera uma lista de inimigos)
    lista de inimigos? como inicializaria eles aq se inimigo eh uma classe q nn ta aq? eu ax q da pra fazer isso aq se importar a classe se nn me engano


    //metodos get e set
    //metodo de imprimir(oq eu tbm nn sei como fazer certinho, tipo, pra ficar daquele jeito bunitinho)
    */
    public static final int NORMAL = 1, OCULTO = 2, PRIVADO = 3;
    public static final int NORTE = 1, LESTE = 2, OESTE = 4, SUL = 8; //bitmask, pesquisei como fazer isso pq da outra forma ia ser mt mais trabalho
    //e feio

    private final int[][] tipoSetor;
    private final int[][] portas;

    //public final int qntdInimigos; isso depende de como a gente vai implementar os inimigos

    public Tabuleiro(){
        tipoSetor = new int[][]{
            {OCULTO, PRIVADO, OCULTO, NORMAL, PRIVADO},
            {NORMAL, NORMAL, PRIVADO, OCULTO, NORMAL},
            {PRIVADO, OCULTO, NORMAL, NORMAL, OCULTO},
            {NORMAL, PRIVADO, NORMAL, OCULTO, PRIVADO},
            {OCULTO, OCULTO, NORMAL, PRIVADO, NORMAL},
        };//o objetivo final esta no canto inferior direito, o [4][4]

        portas = new int[][]{
            {SUL|LESTE, OESTE|LESTE, OESTE|SUL|LESTE, OESTE, SUL},
            {NORTE|LESTE, OESTE|SUL, NORTE|SUL, SUL|LESTE, OESTE|NORTE},
            {LESTE, OESTE|NORTE|LESTE, OESTE|NORTE|LESTE|SUL, OESTE|NORTE|LESTE, OESTE|SUL},
            {NORTE|LESTE|SUL, OESTE|LESTE, OESTE|NORTE|LESTE|SUL, OESTE|SUL, NORTE|SUL},
            {NORTE|LESTE, OESTE, NORTE|LESTE, OESTE|NORTE, NORTE},
        };

        //nn sei como imprimir do jeito q ta la no exemplo, q eh imprimindo as bordas da matriz

    }

    public int getTipo(int linha, int coluna){
            return tipoSetor[linha][coluna];
    }

    public boolean temPorta(int linha, int coluna, int direcao){
        return (portas[linha][coluna] & direcao) != 0; //SUL|NORTE & LESTE == 0, ENT NN TEM PORTA, MAS & SUL == 1, ENT TEM PORTA PARA SUL
    }


}
