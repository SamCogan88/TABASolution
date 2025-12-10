import javax.swing.JOptionPane;
//Q1B
public class ItemCheckerApp{
	public static void main(String[] args){
		//objects
		ItemChecker check;
		check=new ItemChecker();
		//vars
		String validityDebug;
		String validity;
		//ask user how many items
		int numItems=3;
		//ask user for each eircode
		String eircode1="D01 K6W2";
		String eircode2="T12 DW6P";
		String eircode3="T32 DW6P14";
		/*for(int i=0;i<numItems;i++){
			eircode=JOptionPane.showInputDialog(null,"Enter an Eircode in format LDD CCCC");
		}*/
		//test instantiable class
		check.setEircode(eircode1);
		check.compute();
		validityDebug=check.getValidity();
		validity=check.getIsValid();
		System.out.println(validity);
		System.out.println(validityDebug);
	}
}