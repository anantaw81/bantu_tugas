package inputdata;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class InputData {
    public static void main(String[] args) {
        String[] arr = new String[4];
        arr[0] = JOptionPane.showInputDialog(null,"Data 1 : ");
        arr[1] = JOptionPane.showInputDialog(null,"Data 2 : ");
        arr[2] = JOptionPane.showInputDialog(null,"Data 3 : ");
        arr[3] = JOptionPane.showInputDialog(null,"Data 4 : ");
        JOptionPane.showMessageDialog(null, "Data 1 : " + arr[0] + "\nData 2 : " + arr[1] + "\nData 3 : " + arr[2] + "\nData 4 : " + arr[3], "DATA BUAH", JOptionPane.INFORMATION_MESSAGE);
    }
}
