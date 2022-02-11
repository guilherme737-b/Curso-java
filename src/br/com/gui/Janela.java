package br.com.gui;

import javax.swing.*;

public class Janela {

    public Janela() {
        JFrame frame = new JFrame();  // para criar a jenela, lembrando sempre de importar a biblioteca da qual a classe pertence


        JButton botao = new JButton("Clique"); // estamos adcionando o botao no painel de controle
        frame.getContentPane().add(botao); // para paniel de controle, como setas e botoes

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para fechar a aplicação apos clicar no X
        frame.setSize(300, 300); // para definir o tamanho da janela
        frame.setVisible(true);
    }


    public static void main(String[] args) {

        new Janela();









    }


}
