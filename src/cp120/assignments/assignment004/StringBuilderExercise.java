package cp120.assignments.assignment004;

public class StringBuilderExercise
{

    public static void main(String[] args)
    {
        String  name    = "Smith";
        int     ident   = 19546;
        String  phone   = "206-666-5555";
        boolean active  = false;
        
        StringBuilder   bldr    = new StringBuilder();
        String          newl    = System.lineSeparator();
        bldr.append( "Name: " ).append( name ).append( newl );
        bldr.append( "ID: " ).append( ident).append( newl );
        bldr.append( "Phone: " ).append( phone).append( newl );
        bldr.append( "Active: " ).append( active ? "Yes" : "No" );
        
        System.out.println( bldr );
        name = "Chuck";
        bldr.delete(0, bldr.length());
        bldr.append( "Name: " ).append( name ).append( newl );
        bldr.append( "ID: " ).append( ident).append( newl );
        bldr.append( "Phone: " ).append( phone).append( newl );
        bldr.append( "Active: " ).append( active ? "Yes" : "No" );
        System.out.println( bldr );
    }

    
}
