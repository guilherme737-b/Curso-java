package br.com.cursoOO;

public class Galinha {

    public static int ovosDaGranja;  //variavel global ou seja ela criada apenas uma vez, diferente dos ovos que são criados todas as vezes que cria uma galinha

    public int ovos;

    public Galinha botar(){
        this.ovos++;
        Galinha.ovosDaGranja++;  // o ++ para contabilizar os ovos para granja de galinha e não apenas para o objeto galinha
        return this;
    }

    public static double mediaDeOvos(int galinhas){
        return Galinha.ovosDaGranja / galinhas;
    }





}
