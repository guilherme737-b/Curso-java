package br.com.gui;

import javax.swing.*;
import java.awt.*;

public class Layouts extends JFrame {

    public  Layouts(){     // Contrutor da classe
        super("Layouts");

        getContentPane().add(new JButton("1"));
        getContentPane().add(new JButton("2"));

        Container c = getContentPane();

      BorderLayout border = new BorderLayout();
      c.setLayout(border);  // estou atribundo o meu layout para setLayout

        /* c.setLayout(new FlowLayout());  // desta forma não precisamos colocar os valores atribuindo para um canto da tela, pois vão ser definidos por ordem da linha de comando
        c.add(new JButton(1));
        c.add(new JButton(2));
        c.add(new JButton(3)); */

        c.add(BorderLayout.NORTH, new JButton("1"));
        c.add(BorderLayout.SOUTH, new JButton("2"));
        c.add(BorderLayout.CENTER, new JButton("3"));
        c.add(BorderLayout.EAST, new JButton("4"));
        c.add(BorderLayout.WEST, new JButton("5"));


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);

    }




    public static void main(String[] args) {
        new Layouts();


    }
}
