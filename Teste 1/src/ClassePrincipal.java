import java.util.ArrayList;

import javax.swing.JOptionPane;

import controller.ClienteController;
import model.Cliente;


public class ClassePrincipal {

	public static void main(String[] args) {
		
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		String msg = "Digite a opção desejada \n\n"
				+ "1-Para cadastro\n"
				+ "2-Para listar\n"
				+ "3-Para sair\n";
		
		String opc = JOptionPane.showInputDialog(msg);
		
		
		while(!opc.equals("3")){
			
			if(opc.equals("1")){
				clientes.add(ClienteController.recebeDados());
			}else 
				if(opc.equals("2")){
					
					if(clientes.size()<1)
						JOptionPane.showMessageDialog(null, "Lista vazia");
					else
					ClienteController.mostraDados(clientes);
					
				}else if(opc.equals("3")){
					System.exit(0);
				}else{
					JOptionPane.showMessageDialog(null, "opc inválida");
				}
			
			opc = JOptionPane.showInputDialog(msg);
			
		}

	}

}
