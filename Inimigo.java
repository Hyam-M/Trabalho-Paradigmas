public class Inimigo implements Entidade{
    /*
    td q inimigo tem entidade tem ent so precisa definir o atacar aq
    eu ax q precisa de get e set tbm, nn tenho certeza
     */
    public int atk, def, linha, coluna;
    public boolean vivo;


    public Inimigo(){};
    public Inimigo(int atk, int def, boolean vivo, int linha, int coluna){
        this.setAtk(atk);
        this.setDef(def);
        this.setVivo(vivo);
        //this.setLinha(linha);
        //this.setColuna(coluna);
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
    /* 
    public int getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }

    Coloquei como comentario isso daq pq talvez nn precise, dependendo de como a gente escolher representar os inimigos nos setores
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
    
    public void setLinha(int linha) {
        this.linha = linha;
    }*/

    public void atacar(Inimigo oponente){};
    public void atacar(JogadorSimples p1){
        recebeuDano(atk);
    }

    public void atacar(JogadorSuporte p2){
        recebeuDano(atk);
    }

    public void recebeuDano(int dano){
        this.def -= dano;
        if(this.def <= 0)
            this.vivo = false;
    }
}
