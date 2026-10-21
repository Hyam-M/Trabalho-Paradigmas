public interface Entidade {
    //interfaces nn podem ter atributos e nem construtores
    public abstract void atacar(Inimigo oponente);
    public abstract void atacar(JogadorSimples p1);
    public abstract void atacar(JogadorSuporte p2);
    //nn eh pra definir msm, como eh uma interface nn pode ser definido

}
