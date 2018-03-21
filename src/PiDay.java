import javax.swing.JOptionPane;

public class PiDay {
	public static void main(String[] args) {
		String Pi  = ("3.141592653589793238462");
		for(int i = 0; i < Pi.length(); i++) {
			String ans=JOptionPane.showInputDialog(null, "What's the next number in Pi");
			System.out.println(Pi.charAt(i));
		 if(ans.equals(Pi.charAt(i)+"")) {
		 System.out.println(Pi.charAt(i));
		 
		 JOptionPane.showMessageDialog(null, "CONGRATULATIONS1!!!You got it right");
		 
		 System.exit(0);
		 
        }
		 
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 }
}       }
      




