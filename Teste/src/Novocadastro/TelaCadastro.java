package Novocadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaCadastro extends TelaGenerica{
	
	private JLabel textNome;
	private JLabel textID;
	private JLabel contador;
	private JTextField campoNome;
	private JTextField campoId;
	private JButton buttonAdd;
	
	private List<Eleitor> eleitores;
	
	Mesario mesario = new Mesario();
	
	

	public TelaCadastro(List<Eleitor> eleitores) {
		super("Cadastro", 400, 400, false);
		this.eleitores = eleitores;
		iniciarComponetes();
	}
	
	public void iniciarComponetes() {
		//-------------------------------DECLARAR------------------------------------\\
		textNome = new JLabel("nome");
		textID= new JLabel("id");
		contador = new JLabel("Eleitores");
		campoNome= new JTextField();
		campoId= new JTextField();
		buttonAdd = new JButton("adicionar eleitor");
		
		//-------------------------------CONFIGURAR------------------------------------\\
		textNome.setBounds(10, 20,200, 50 );
		textID.setBounds(10, 50, 200, 50);
		contador.setBounds(10, 100, 200, 60);
		campoNome.setBounds(50, 30, 200, 30);
		campoId.setBounds(50, 60, 200, 30);
		buttonAdd.setBounds(100, 250, 140, 50);
		buttonAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comandoBotao();
			}
		});
		//-------------------------------ADICIONAR------------------------------------\\
		add(textNome);
		add(textID);
		add(contador);
		add(campoNome);
		add(campoId);
		add(buttonAdd);
	}
	private void comandoBotao() {    
        String nome = campoNome.getText().trim();
        String idTexto = campoId.getText().trim();
        
        // VERIFICA CAMPOS VAZIOS
        if (nome.isEmpty() || idTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int id = Integer.parseInt(idTexto);

            // VERIFICA SE O ID JÁ EXISTE NA LISTA
            for (Eleitor eleitor : eleitores) {
                if (eleitor.getId() == id) {
                    JOptionPane.showMessageDialog(this, "ID já cadastrado! Escolha outro.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // ADICIONA NOVO ELEITOR
            eleitores.add(new Eleitor(nome, id));
            JOptionPane.showMessageDialog(this, "Eleitor cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
            // ATUALIZA O CONTADOR DE ELEITORES
            contador.setText("Eleitores: " + eleitores.size());

            // LIMPA OS CAMPOS
            campoNome.setText("");
            campoId.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "O ID deve ser um número inteiro válido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}