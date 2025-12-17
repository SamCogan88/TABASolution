import javax.swing.JOptionPane;
//Q2
public class Q2App{
	public static void main(String[] args){
		//objects
		Q2 q2;
		q2=new Q2();
		//vars
		boolean[] validUsernames;
		int numUsernames=Integer.parseInt(JOptionPane.showInputDialog(null,"How many usernames?"));
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