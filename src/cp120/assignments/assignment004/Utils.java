package cp120.assignments.assignment004;

import javax.swing.JOptionPane;

public class Utils {

	public static void main(String[] args)  {
		
		try {
			JOptionPane.showMessageDialog( null,  askInt(10, 20) + " is a great answer" );
		} catch (OpCanceledException e) {
			System.out.println( "You cancelled the dialog without entering a number?" );
			JOptionPane.showMessageDialog( null,  "You cancelled the dialog without entering a number?" );
		}
	}
	
	public static int askInt(int min, int max) throws OpCanceledException {
		
		StringBuilder   prompt    = new StringBuilder();
		prompt.append("Enter an integer between ").append(min).append(" and ").append(max);
        int  valueInt = min;
        boolean valid = false;
        String number = null;
        
        do {
        	number = JOptionPane.showInputDialog( null, prompt.toString());
        	if (number != null) {
        		try {
					valueInt = Integer.parseInt(number);
					if(valueInt >= min && valueInt <= max) {
	        			valid = true;
	        		}
	        		else {
	        			JOptionPane.showMessageDialog( null, "\"" + number + "\" is not valid" );
	        		}
					
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog( null, "\"" + number + "\" is not valid" );
				}
        	}
        	else {
        		throw new OpCanceledException();        		
        	}
        	
        } while(!valid);

        return valueInt;
	}

}
