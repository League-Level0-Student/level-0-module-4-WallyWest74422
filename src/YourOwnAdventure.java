import javax.swing.JOptionPane;

public class YourOwnAdventure {
public static void main(String[] args) {
	String op1= JOptionPane.showInputDialog("Thanos is coming! Press 1 to send Hulk. Press 2 to send nobody.");
	int Thanos1 = Integer.parseInt(op1);
	if ((Thanos1)==1){
		String op2 =JOptionPane.showInputDialog("Hulk got beaten up by Thanos! Press 1 if you want him to keep fighting. Press 2 if you want him to warn Doctor Strange.");
		int Thanos2= Integer.parseInt(op2);
		if ((Thanos2)==1){
			JOptionPane.showMessageDialog(null, "Hulk died. Who will snap now? Oops! Forget you heard that!");
					System.exit(0);
		}
		if ((Thanos1)==2){
			JOptionPane.showMessageDialog(null, "Thor died along with all of the Asgardians. Now Thanos is even more powerful!");
					System.exit(0);
	}
		if ((Thanos2)==2){
		String op3=	 JOptionPane.showInputDialog( "Aliens are attacking New York! Should Doctor Strange give them the time stone? 1 = Yes;2 = No");
	int Thanos3=Integer.parseInt(op3);
	if ((Thanos3)==1){
		JOptionPane.showMessageDialog(null, "Good Choice. Everyone is saved because of you. You would make a great avenger!" );
		System.exit(0);
		}
	if ((Thanos3)==2){
		JOptionPane.showMessageDialog(null, "Uh Oh, now Thanos has another infinity stone. This does not look good!!!" );
		System.exit(0);
	}}
	}
}
}
