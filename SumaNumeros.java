import javax.swing.JOptionPane;
public class SumaNumeros{
    public static void main(String[] args){
    String x1=JOptionPane.showInputDialog("Primer numero");
    String x2=JOptionPane.showInputDialog("Segundo numero");
    String x3=JOptionPane.showInputDialog("Tercer numero:");

    int numero1 = Integer.parseInt(x1);
    int numero2 = Integer.parseInt(x2);
    int numero3 = Integer.parseInt(x3);

    System.out.println("La suma es: " + ((numero1 + numero2 + numero3) / 3));
    }
}