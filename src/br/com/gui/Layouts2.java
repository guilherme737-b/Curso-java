package br.com.gui;

import javax.swing.*;
import java.awt.*;

public class Layouts2 extends JFrame {


    public Layouts2 (){
        super("Teste");
        Container c = getContentPane();

        /*
        c.setLayout(new BorderLayout(5,5)); // o 5 e 5 são espaçamento entre os elementos, ou seja, as letras
        c.add(BorderLayout.NORTH, new JButton("N"));
        c.add(BorderLayout.SOUTH, new JButton("S"));
        c.add(BorderLayout.CENTER, new JButton("L"));
        c.add(BorderLayout.WEST, new Button("O"));
        c.add(BorderLayout.EAST, new JButton("T")); */

        c.setLayout(new GridLayout(2,3)); // recebe a quantidade de linhas e colunas ou seja 2 linhas e 3 colunas
        c.add(new JButton("1"));
        c.add(new JButton("2"));
        c.add(new JButton("3"));
        c.add(new JButton("4"));
        c.add(new JButton("5"));
        c.add(new JButton("6"));





        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);

    }




    public static void main(String[] args) {
    new Layouts2();

    }
}
