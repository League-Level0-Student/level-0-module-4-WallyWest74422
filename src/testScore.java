import javax.swing.JOptionPane;

public class testScore {
public static void main(String[] args) {
	String testScore=JOptionPane.showInputDialog("What was your test score?");
	double number = Double.parseDouble(testScore);
if	(number>=(100)) {
	JOptionPane.showMessageDialog(null, "Wow! Good Job :)");
}else if(number>=(90)){
	JOptionPane.showMessageDialog(null, "Pretty Good! :)");
}else if(number>=(80)){
	JOptionPane.showMessageDialog(null, "Everyone has their bad days! :)");
}else if(number>=(75)){
	JOptionPane.showMessageDialog(null, "Better luck next time :(");
}else if(number>=(50)){
	JOptionPane.showMessageDialog(null, "Are you okay?");
}else if(number>=(40)){
	JOptionPane.showMessageDialog(null, "I can't even...>:(");
}else {
	JOptionPane.showMessageDialog(null, "You are not my friend anymore");
}
}
}
