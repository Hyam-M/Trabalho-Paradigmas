public abstract class Jogador implements Entidade {
    protected int atk, def, linha, coluna;
    protected boolean vivo;

    public Jogador(){};
    public Jogador(int atk, int def, boolean vivo, int linha, int coluna){
        this.setAtk(atk);
        this.setDef(def);
        this.setVivo(vivo);
        this.setLinha(linha);
        this.setColuna(coluna);
    }
    public void setAtk(int atk){
        if(atk > 0) //talvez precise ter um limitante superior, mas ax q quando a funcao random funciona, ela ja ta limitada superiormente
            this.atk = atk;
    }

    public int getAtk() {
        return atk;
    }

    public void setDef(int def) {
        if(def > 0)
            this.def = def;
    }

    public int getDef() {
        return def;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public boolean getVivo() {
        return vivo;
    }

    public int getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setColuna(int coluna) {
        if(coluna >= 0 & coluna <= 4) //tecnicamente, isso eh inutil, ja q ele vai spawnar em 2x2
            this.coluna = coluna;
    }
    
    public void setLinha(int linha) {
        if(linha >= 0 & linha <= 4)
            this.linha = linha;
    }

    public void atacar(Inimigo oponente){ //isso depende de como a gente vai implementar, talvez tenha q passar uma lista, depende
        oponente.recebeuDano(atk);
        //talvez aq tenha q tirar ele da lista, dnv, depende de como vai implementar
    }


    public void movimentar(Tabuleiro tab, int direcao){
        if(tab.temPorta(linha, coluna, direcao)){
            switch (direcao) {
                case Tabuleiro.NORTE:
                    linha--;
                    break;
                
                case Tabuleiro.SUL:
                    linha++;
                    break;

                case Tabuleiro.LESTE:
                    coluna++;
                    break;

                case Tabuleiro.OESTE:
                    coluna--;
                    break;
            }
        }
    }

    public void atacar(JogadorSimples p1){};
    public void atacar(JogadorSuporte p2){};

    public void procurar(int chance){
        switch (chance) {
            case 4:
                this.def++;
                break;
            case 5:
                this.def += 2;
                break;
            case 6: // aq dnv depende de como implementar os inimigos para poder tirar um de def de tds os do setor
                break;
            default:
                //talvez imprimir no topo da tela "Nada encontrado"
                break;
        }
    }

    public void recebeuDano(int dano){
        this.def -= dano;
        if(this.def <= 0)
            this.vivo = false;
    }

}
