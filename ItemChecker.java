//Q1A
public class ItemChecker{
	//vars
	private String eircode;
	private String validity;
	private boolean isValid;
	//constructor
	public ItemChecker(){
		eircode="";
		validity="invalid";
		isValid=true;
	}

	//set
	public void setEircode(String eircode){
		this.eircode=eircode;
		System.out.println(eircode+" printing from instantiable");
	}
	//compute
	public void compute(){
		//convert to upper case
		eircode=eircode.toUpperCase();
		//check first character is a letter
		if(eircode.charAt(0)>='A' && eircode.charAt(0)<='Z'){
			validity="First char is a letter.";
		}
		else{
			validity="First char is not a letter.";
			isValid=false;
		}
		//check second and third character for validity
		if((eircode.charAt(1)>='0' && eircode.charAt(1)<='9') && (eircode.charAt(2)>='0' && eircode.charAt(2)<='9')){
			validity=validity+" Second and third character are valid.";
		}
		else{
			validity=validity+" Second and third character are invalid.";
			isValid=false;
		}
		//check for space
		if(eircode.charAt(3)==' '){
			validity=validity+" Space in corerct place.";
		}
		else{
			validity=validity+" Space not in correct place.";
			isValid=false;
		}

		//check length of string
		if(eircode.length()==8){
			//check last characters
			for(int i=4;i<8;i++){
				validity=validity+" Last characters are valid";
				if((eircode.charAt(i)>='0' && eircode.charAt(i)<='9') || (eircode.charAt(i)>='A' && eircode.charAt(i)<='Z')){

				}
				else{
					validity=validity+" Invalid character at position "+i;
					isValid=false;
					break;
				}
			}
		}
		else{
			validity=validity+" Eircode wrong length";
			isValid=false;
		}
	}

	//get
	public String getValidity(){
		return validity;
	}
	public String getIsValid(){
		if(isValid){
			return "Valid";
		}
		else{
			return "Invalid";
		}
	}
}