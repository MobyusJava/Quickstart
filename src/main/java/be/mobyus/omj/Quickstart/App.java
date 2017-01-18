package be.mobyus.omj.Quickstart;

import com.google.gson.Gson;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Gson gson = new Gson();
        System.out.println(gson.toJson("Hello Mobyus!"));
    }
}
