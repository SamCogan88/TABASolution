import javax.swing.JOptionPane;
//Q1B
public class ItemCheckerApp{
	public static void main(String[] args){
		//objects
		ItemChecker check;
		check=new ItemChecker();
		String eircode;
		//vars
		String validityDebug;
		String validity;
		//ask user how many items
		int numItems=Integer.parseInt(JOptionPane.showInputDialog(null,"Q1: How many items?"));
		for(int i=0;i<numItems;i++){
			//ask user for each eircode
			eircode=JOptionPane.showInputDialog(null,"Enter an Eircode in format LDD CCCC");
			//test instantiable class
			check.setEircode(eircode);
			check.compute();
			validityDebug=check.getValidity();
			validity=check.getIsValid();
			System.out.println(validity);
			System.out.println(validityDebug);
		}

		//Q2
		//objects
		Q2 q2;
		q2=new Q2();
		//vars
		boolean[] validUsernames;
		int numUsernames=Integer.parseInt(JOptionPane.showInputDialog(null,"Q2: How many usernames?"));
		String[] usernames=new String[numUsernames];
		//hardcoding usernames for testing
		for(int i=0;i<numUsernames;i++){
			usernames[i]=JOptionPane.showInputDialog(null,"Enter a username");
		}
		//set/compute/get the Q2 method
		validUsernames=q2.checkValidUsername(usernames);
		//test print
		for(int i=0;i<validUsernames.length;i++){
			System.out.println(validUsernames[i]);
		}
	}
}