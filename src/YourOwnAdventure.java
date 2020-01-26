import javax.swing.JOptionPane;

public class YourOwnAdventure {
public static void main(String[] args) {
	String op1= JOptionPane.showInputDialog("Thanos is coming! Press 1 to send Hulk. Press 2 to send Iron Man.");
	int Thanos1 = Integer.parseInt(op1);
	if ((Thanos1)==1){
		String op2 =JOptionPane.showInputDialog("Hulk got beaten up by Thanos! Press 1 if you want him to keep fighting. Press 2 if you want him to warn Doctor Strange.");
		int Thanos2= Integer.parseInt(op2);
		if ((Thanos2)==1){
			JOptionPane.showMessageDialog(null, "Hulk died. Who will snap now? Oops! Forget you heard that!);");
					System.exit(0);
		}
		if ((Thanos2)==2){
			JOptionPane.showMessageDialog(null, "Aliens are attaking New York");
					System.exit(0);
	}
	}
}
}
