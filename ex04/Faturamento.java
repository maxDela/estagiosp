package ex04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Faturamento {
    ArrayList<Double> valor = new ArrayList<>();
    ArrayList<String> estados = new ArrayList<>();
    
    public Faturamento() {
        estados.add("SP");
        estados.add("RJ");
        estados.add("MG");
        estados.add("ES");
        estados.add("outros");
        valor.add(67836.43);
        valor.add(36678.66);
        valor.add(29229.88);
        valor.add(27165.48);
        valor.add(19849.53);
    }
    public ArrayList<Double> getValor() {
        return valor;
    }
    public void setValor(ArrayList<Double> valor) {
        this.valor = valor;
    }
    public ArrayList<String> getEstados() {
        return estados;
    }
    public void setEstados(ArrayList<String> estados) {
        this.estados = estados;
    }

    public void percentualDeCadaEstado(){
       
        double totalValor = 0;
        for (Double total : valor) {
            totalValor += total;
        }
        int i = 0;
        for (Double percentual : valor) {
            
            
            StringBuilder sb = new StringBuilder();
            sb.append("percentual de representação ").append(estados.get(i)).append(": ").append((percentual*totalValor)/100);
            JOptionPane.showMessageDialog(null, sb);
            i= i + 1;
        }
    }

}