package br.com.gui;

import javax.swing.*;

public class Janela extends JFrame {

    public Janela() {



        // Frame frame = new JFrame();  // Não vamos usar, pois estamos usando um metodo extends da biblioteca JFrama, ou seja esta classe já uma JFrame para criar a jenela, lembrando sempre de importar a biblioteca da qual a classe pertence

        super("Minha Janela"); // para dar o nome a minha interface (janela(
        JButton botao = new JButton("Clique"); // estamos adcionando o botao no painel de controle
        getContentPane().add(botao); // para paniel de controle, como setas e botoes

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para fechar a aplicação apos clicar no X
        setSize(300, 300); // para definir o tamanho da janela
        setVisible(true);
    }


    public static void main(String[] args) {

        new Janela();









    }


}
