package eu.corstjens.java7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by koencorstjens on 24/04/16.
 */
public class DiamondOperator {
    /*The Diamond Operator reduces some of Java's verbosity surrounding generics by having the compiler infer parameter
    types for constructors of generic classes. The original proposal for adding the Diamond Operator to the Java
    language was made in February 2009 and includes this simple example:*/


    //The Diamond Operator
    public void test() {
        //For example, consider the following assignment statement:

        Map<String, List<String>> oldway = new HashMap<String, List<String>>();

        //This is rather lengthy, so it can be replaced with this:

        Map<String, List<String>> newway = new HashMap<>();
    }

}
