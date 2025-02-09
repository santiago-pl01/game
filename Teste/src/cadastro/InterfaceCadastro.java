//package teste;
//
//import javax.swing.JFrame;
//import javax.swing.JTextField;
//
//public class InterfaceCadastro extends JFrame {
//	 private JTextField textNome,textId ;
//	
//	 
//	public InterfaceCadastro(JTextField textid) {
//		 // torna a interface visível
//        setSize(400, 400); // define o tamanho da interface
//        setTitle("Urna Eletrônica"); // título da interface
//        setResizable(false); // não permite que o tamanho da tela seja alterado
//        setLayout(null);
//        
//        
//		  textNome = new JTextField();
//	      textNome.setBounds(20, 100, 200, 30);
//	      add(textNome);
//	       
//	      textId = new JTextField();
//	      textId.setBounds(20, 50, 200, 30);
//	      add(textId);
//	       
//	}
//
//}


package cadastro;

import javax.swing.JOptionPane;

public class InterfaceCadastro extends javax.swing.JFrame {
	
	Dados dados = new Dados();
	

  
    public InterfaceCadastro() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        tfnome = new javax.swing.JTextField();
        tfId = new javax.swing.JTextField();
        addEleitor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnomeActionPerformed(evt);
            }
        });

        tfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdActionPerformed(evt);
            }
        });

        addEleitor.setText("addEleitor");
        addEleitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEleitorActionPerformed(evt);
            }
        });

        jLabel1.setText("0 eleitores");

        jLabel2.setText("nome");

        jLabel3.setText("id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addEleitor)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(addEleitor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>                        

    private void tfnomeActionPerformed(java.awt.event.ActionEvent evt) {                                       

    }                                      

    private void tfIdActionPerformed(java.awt.event.ActionEvent evt) {                                     
       
    }                                    

    private void addEleitorActionPerformed(java.awt.event.ActionEvent evt) {                                           
       String nome = tfnome.getText();
       String id = tfId.getText();
       
       Eleitor c = new Eleitor (nome, id );
       dados.cadastraEleitor(c);
       
       jLabel1.setText(dados.numerosEdeleitor());
       System.out.println(c.getNome());
       
       JOptionPane.showMessageDialog(this, "eleitor cadastrado");
       
       tfnome.setText("");
       tfId.setText("");
       
    }                                          


    // Variables declaration - do not modify                     
    private javax.swing.JButton addEleitor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfnome;
    // End of variables declaration                   
}

