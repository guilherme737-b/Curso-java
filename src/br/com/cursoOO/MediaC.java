package br.com.cursoOO;

public class MediaC {

    double media (int x, int y) {
        System.out.print("Media (int x, int y)");
        return (x + y) / 2;

    }

    double media (String x, String y) {
        System.out.print("Media (String x, String y)");
        int ix = Integer.parseInt(x); //converter String para inteiro
        int iy = Integer.parseInt(y);
        return (ix + iy) / 2;
    }




}
