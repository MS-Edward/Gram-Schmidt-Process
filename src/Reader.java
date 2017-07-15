import java.util.Scanner;
import java.util.Vector;

/**
 * Created by CN_Ed on 7/15/2017.
 */
public class Reader {

    public Vector getVector()
    {
        System.out.print("Specify vector: ");
        Scanner sc = new Scanner(System.in);
        String vector = sc.nextLine();

        return parseVector(vector);
    }

    private Vector parseVector(String vector)
    {
        Scanner sc = new Scanner(vector);
        Vector theVector = new Vector();

        while(sc.hasNext())
        {
            theVector.addElement(sc.next());
        }
        return theVector;
    }
}
