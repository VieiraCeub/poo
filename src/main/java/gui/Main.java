package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        // Criar uma janela
        JFrame frame = new JFrame("Exemplo GUI");

        // Configurar o layout da janela
        frame.setLayout(new FlowLayout());
        
        // Criar uma caixa de texto
        JTextField textField = new JTextField(15);
        
        // Criar um botão para realizar a ação
        JButton button = new JButton("Clique-me");

        // Adicionar um ouvinte de ação ao botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textField.getText();
                JOptionPane.showMessageDialog(null, "Você digitou: " + texto);
            }
        });

        // Adicionar componentes à janela
        frame.add(textField);
        frame.add(button);

        // Configurar tamanho da janela
        frame.setSize(300, 300);
        
        frame.getContentPane().setBackground(Color.RED);

        // Definir operação padrão de fechamento
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tornar a janela visível
        frame.setVisible(true);
    }
}

