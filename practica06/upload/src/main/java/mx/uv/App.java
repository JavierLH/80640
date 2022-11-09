<<<<<<< HEAD
package mx.uv;
import static spark.Spark.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        get("/hello", (req, res) -> "Hello World");
        get("/paginax", (req, res) -> "<h1>Bienvendo</h1><img src='https://www.uv.mx/v2/images/logouv.jpg'></img>");

    }
}
=======
package mx.uv;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
>>>>>>> 4fa849a10172558140852cba74bc391cb70dead1
