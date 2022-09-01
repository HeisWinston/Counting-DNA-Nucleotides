import java.io.*;

public class assignment_1{
    public static void main(String args[])throws Exception{
        FileReader fr = new FileReader("C:\\Users\\Winston Riley\\Downloads\\fall22\\bioinformatics class\\rosalind_dna.txt");
        // Declaring loop variable
        int i =0;
        // Holds true till there is nothing to read
        int a_counter =0;
        int c_counter =0;
        int g_counter =0;
        int t_counter =0;
            do{
                if((char)i=='A')
                {
                    a_counter++;

                }else if((char)i=='C'){
                    c_counter++;

                }else if((char)i=='G'){
                    g_counter++;

                }else if((char)i=='T'){
                    t_counter++;
                } 
            } while ((i = fr.read()) != -1);
       // System.out.print((char)i);
        System.out.format("A value: %d \n C value: %d \n G value: %d \n T value: %d", a_counter, c_counter, g_counter, t_counter  );
    }
}