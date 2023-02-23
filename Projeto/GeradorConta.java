package Projeto;

public class GeradorConta {
	static String getRandomString(int i) 
    {
        String theNumericS;
        StringBuilder builder;
        
        theNumericS = "0123456789";
                                    

        //create the StringBuffer
        builder = new StringBuilder(i); 

        for (int m = 0; m < i; m++) {

            // generate numeric
            int myindex 
                = (int)(theNumericS.length() 
                        * Math.random()); 

            // add the characters
            builder.append(theNumericS 
                        .charAt(myindex)); 
        } 

        return builder.toString(); 
    } 

}
