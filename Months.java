import javax.swing.JOptionPane;

public class Months {
	enum Months { January, February, March, April, May, June, July, August, september, November, December}
	public static void main(String[] args){
		Months[] choices={Months.January, Months.February, Months.March,Months.April, Months.May, Months.June, Months.July, Months.August, Months.September, Months.November, Months.December};

		While (true); {

		Months select =(Months)JOptionPane.showInputDialog(null, "Selectthe month you were born ", "Months", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);

		switch(select) {
		case January:
		case December:
		case February:
			JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
			break;
		case March:
		case April:
		case May:
			JOptionPane.showMessageDialog(null, "Happy Spring days!");
			break;
		case June:
		case July:
		case August:
			JOptionPane.showMessageDialog(null, "It's a summer time"			);
			break;
		case September: 
		case December:
		case November:
			JOptionPane.showMessageDialog(null, "Welcome to the foil age season!");
			break;
		default:

}
}
}
}