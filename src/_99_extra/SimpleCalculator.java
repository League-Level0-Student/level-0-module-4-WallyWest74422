package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		for(int i=0;i<5;i++) {
String number1= JOptionPane.showInputDialog("Please give me a number");
int t1=Integer.parseInt(number1);
String number2= JOptionPane.showInputDialog("Please give me a number");
int t2=Integer.parseInt(number2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);

		//    5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if ((operation)==0){
			addition(t1 ,t2);
			}
			if ((operation)==1){
			subtraction(t1,t2);
			}
			if ((operation)==2){
			multiplication(t1,t2);
			}
			if ((operation)==3){
			division(t1,t2);
			}}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void addition(int a, int b) {
	JOptionPane.showMessageDialog(null, +a+ " + " +b+ "= " +(a+b));
}
	// 4. Create similar methods for subtraction, multiplication and division.
static void subtraction(int a, int b) {
	JOptionPane.showMessageDialog(null, +a+ " - "  +b+ "= " +(a-b));
}
static void multiplication(int a, int b) {
	JOptionPane.showMessageDialog(null, +a+ " * " +b+ "= " +(a*b));
}
static void division(int a, int b) {
	JOptionPane.showMessageDialog(null, +a+ " / " +b+ "= " +(a/b));
}
}