import javax.swing.JOptionPane;

public class atv01 {

    public static void main(String[] args) {
        int index = 13;
        int soma = 0;
        int k = 0;

        while (k < index) {
            // Contando 0 vai até 12, sendo assim 13 repetições.
            k += 1;
            soma+=k;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Valor da soma: ").append(soma);
        JOptionPane.showMessageDialog(null, sb);
    }
}