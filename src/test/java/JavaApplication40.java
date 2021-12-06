
public class JavaApplication40 {

	public static void main(String[] args)  {
			     
		
				 A a=new C();
			     a.f("mee");  //A
			    
			     C c=new C(); 
			     c.f(a);   //C
			     
			     B b=new D(); 
			     b.f("mee");   //B
			     
			     D d=new D(); 
			     d.f(a);   //B  //D
			  }
			  
	}


