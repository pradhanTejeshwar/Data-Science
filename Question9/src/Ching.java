public class Ching {
//	public String Ching(String msg) {
//		
//	}
	public String setChing(int Ching){
			if(Ching<100 || Ching>120)
				throw new Chingexception("ChingException");
			else
				return "ching... chong";
	}
}