package ex02;

import javax.swing.JOptionPane;

public class test {
    StringBuilder sb = new StringBuilder();
    public void testDeFibonacci(int num){
        if (num<0) {
            sb.append("valor negativo não pode ser Fibonacci!!");
            JOptionPane.showMessageDialog(null, sb);
            return;
        }
        
        int n1=0, n2=1;
        while (n1<num) {
            int aux = n1;
            n1 = n2;
            n2 = aux + n2;
        }
        if (n1==num) {
            sb.append("É Fibonacci!!");
            JOptionPane.showMessageDialog(null, sb);
            return;
        }
        else
            sb.append("Não é Fibonacci!!");
            JOptionPane.showMessageDialog(null, sb);
            return;
    }
}
