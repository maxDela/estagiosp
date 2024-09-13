package ex05;

import javax.swing.JOptionPane;

public class mod {
    public String nome;
    public String nomeRevert = "";

    public mod(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   

    public String getNomeRevert() {
        return nomeRevert;
    }

    public void setNomeRevert(String nomeRevert) {
        this.nomeRevert = nomeRevert;
    } 
    public void reverterString(){
        for (int i = nome.length() - 1; i >= 0; i--) {
            nomeRevert += Character.toString(getNome().charAt(i));
        }
        
       StringBuilder sb = new StringBuilder();
       sb.append("Nome original: ").append(getNome()).append("\nNome revertido: ").append(getNomeRevert());
       JOptionPane.showMessageDialog(null, sb);
    }
}
