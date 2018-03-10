import java.io.*;
import org.rosuda.JRI.Rengine;
import org.rosuda.JRI.REXP;
import org.rosuda.JRI.RVector;
import org.rosuda.JRI.RMainLoopCallbacks;

public class utama{
	
	REXP x;
	String[] arg = new String[]{"--vanilla"};
	Rengine re= new Rengine(arg, false, null);
	
	public utama() {
		re.eval("x = 13.5");
		System.out.println(re.eval("x").asDouble());
	}
	
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(()->{
			utama utm = new utama();
		});
	}
}