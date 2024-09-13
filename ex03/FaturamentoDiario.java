package ex03;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class FaturamentoDiario {
    ArrayList<Double> valorDiario = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    public FaturamentoDiario() {
        valorDiario.add( 31490.7866);
        valorDiario.add( 37277.9400);
        valorDiario.add( 37708.4303);
        valorDiario.add( 0.0000);
        valorDiario.add( 0.0000);
        valorDiario.add( 17934.2269);
        valorDiario.add( 0.0000);
        valorDiario.add( 6965.1262);
        valorDiario.add( 24390.9374);
        valorDiario.add( 14279.6481);
        valorDiario.add( 0.0000);
        valorDiario.add( 0.0000);
        valorDiario.add( 39807.6622);
        valorDiario.add( 27261.6304);
        valorDiario.add( 39775.6434);
        valorDiario.add( 29797.6232);
        valorDiario.add( 17216.5017);
        valorDiario.add( 0.0000);
        valorDiario.add( 0.0000);
        valorDiario.add( 12974.2000);
        valorDiario.add( 28490.9861);
        valorDiario.add( 8748.0937);
        valorDiario.add( 8889.0023);
        valorDiario.add( 17767.5583);
        valorDiario.add( 0.0000);
        valorDiario.add( 0.0000);
        valorDiario.add( 3071.3283);
        valorDiario.add( 48275.2994);
        valorDiario.add( 10299.6761);
        valorDiario.add( 39874.1073);
    }

    public ArrayList<Double> getValorDiario() {
        return valorDiario;
    }

    public void setValorDiario(ArrayList<Double> valorDiario) {
        this.valorDiario = valorDiario;
    }
    public void maiorValorDiario(){
        sb.append("\nMaior valor: ").append(Collections.max(valorDiario));
    }
    public void menorValorDiario(){
        sb.append("\nMenor valor: ").append(Collections.min(valorDiario));
    }

    public void superiorMedia(){
        double totalValor = 0;
        double media = 0;
        int diasValidos = 0;
        for (Double total : valorDiario) {
            
            if (total != 0) {
                //evitar dias sem rendimento
                totalValor += total;
                diasValidos++;
            }
        }
        
        media = totalValor / diasValidos;
        int contador = 0;
        for (Double maiorQueMedia : valorDiario) {
            if (maiorQueMedia > media) {
                contador++;
            }
        }
       sb.append("\nMédia: ").append(media).append("\nQuantidade de dias com valor maior que média: ").append(contador).append(" dias");
       JOptionPane.showMessageDialog(null, sb);

    }


}
