public class Q12 {
	public String Givedate(String str) {
		//char[] a=str.toCharArray();
		for(int i=0;i<4;i++) {
			if(!((str.charAt(i)>= 'A' && str.charAt(i) <= 'Z')||(str.charAt(i) >= '0' && str.charAt(i) <= '9')))
				return "string not valid";		
		}
		String r=str.substring(4, str.length());
		return r;
	}
	
	public boolean Verifylen(String str) {
		if(str.length()==12) {
			return true;
		}
		else
			return false;
	}
	
	public boolean Verifystr4(String str) {
		//char[] a=str.toCharArray();
		for(int i=0;i<4;i++) {
			if(!((str.charAt(0)>= 'A' && str.charAt(0) <= 'Z') && (str.charAt(1) >= 'A' && str.charAt(1) <= 'Z') && (str.charAt(3)>= 'A' && str.charAt(3) <= 'Z') && (str.charAt(2)>= '0' && str.charAt(2) <= '9')))
				return false;
		}
			return true;		
	}
	
	public boolean verifyYear(String str){ 
		String r[]= str.split("/");
		if(Integer.parseInt(r[2])>=2000 && Integer.parseInt(r[2])<=2020)
			return true;
		else
			return false;
	}
	
	public boolean verifyMonth(String str){
		String r[]= str.split("/");
		if(Integer.parseInt(r[1])>=1 && Integer.parseInt(r[1])<=12)
			return true;
		else
			return false;
		
	}

    public boolean verifyDay(String str){
    	String r[]= str.split("/");
		if(Integer.parseInt(r[0].substring(4))>=1 && Integer.parseInt(r[0].substring(4))<=31)
			return true;
		else
			return false;
    }
    
    public String giveWithoutDate(String str){
		for(int i=0;i<4;i++) { 
			if(!((str.charAt(i)>= 'A' && str.charAt(i) <= 'Z')||(str.charAt(i) >= '0' && str.charAt(i) <= '9')))
				return "string not valid";
		}
		String r=str.substring(0,4);
		return r;
    }  
}