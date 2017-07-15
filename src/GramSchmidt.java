/**
 * Created by CN_Ed on 7/15/2017.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.*;


public class GramSchmidt {

    //vectorMap will dynamically store our vectors.
    HashMap<String,Vector> vectorMap = new HashMap<String,Vector>();

    public static void main(String[] args)
    {
        Reader inputReader = new Reader();
        Vector theVector = inputReader.getVector();
        System.out.print(theVector.toString());
    }


}
