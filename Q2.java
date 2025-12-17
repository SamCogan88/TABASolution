//Q1A
public class Q2{
	//set/compute/get
	public boolean[] checkValidUsername(String[] usernames){
		//test set
		for(int i=0;i<usernames.length;i++){
			System.out.println(usernames[i]);
		}
		boolean[] validUsernames=new boolean[usernames.length];

		//checks!
		/*
		It must start with the symbol ‘@’
		It cannot be shorter than 5 characters. It cannot be longer than 16 characters.
		It can only contain letters (i.e. a – z inclusive, A – Z inclusive), digits (i.e. 0 – 9 inclusive), and underscores (i.e. ‘_’) For example,

		*/
		for(int i=0;i<usernames.length;i++){
			boolean isValid=true;
			if(usernames[i].charAt(0)!='@'){
				isValid=false;
				//System.out.println("Test: first symbol not an @ :"+usernames[i]);
			}
			if(usernames[i].length()<5 || usernames[i].length()>16){
				isValid=false;
				//System.out.println("Test: Not correct length :"+usernames[i]);
			}
			for(int j=1;j<usernames[i].length();j++){
				//ch represents the current character
				char ch=usernames[i].charAt(j);
				//@The1SWDeveloper
				if((!(ch>='a' && ch<='z')) && (!(ch>='A' && ch<='Z')) && (!(ch>='0' && ch<='9')) && (ch!='_')){
					isValid=false;
					//System.out.println("check failed on "+j);
				}
			}
			validUsernames[i]=isValid;
		}
		return validUsernames;
	}
}