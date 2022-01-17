import javax.swing.JOptionPane;

/**
 * Converts decimal numbers to binary
 *
 * @author Jason Zhou
 * @version 1/11/2022
 */
public class BinaryConversion
{
    public static void main (String [] args) {
        // write your code here.
        String in = javax.swing.JOptionPane.showInputDialog(null, "Give me a decimal number");

        String out = "";
        int num = Integer.parseInt(in);
        while(num > 1) {
            // if odd
            if(num % 2 == 1) {
                out = "1" + out;
            } 
            // if even
            else {
                out = "0" + out;
            }
            num /= 2;
        }
        out = "1" + out;
        JOptionPane.showMessageDialog(null, "Here is your number in binary :: " + out);
    }
}