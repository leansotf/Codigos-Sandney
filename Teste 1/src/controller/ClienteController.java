package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Cliente;

public class ClienteController {
	
	
	public static Cliente recebeDados(){
		String email = JOptionPane.showInputDialog("Digite o email");
		String nome= JOptionPane.showInputDialog("Digite o nome");
		String telefone= JOptionPane.showInputDialog("Digite o telefone");
		return new Cliente(email, nome, telefone);
	}
	
	
	public static void mostraDados(ArrayList<Cliente> clientes){
		
		String dadosCliente="==Dados dos Clientes==";
		
		for (Cliente cliente : clientes) {
			
			dadosCliente+=cliente;
			
		}
		JOptionPane.showMessageDialog(null, dadosCliente);
		
	}
	
}
