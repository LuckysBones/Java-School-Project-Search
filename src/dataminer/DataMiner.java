package dataminer;

/**
 * This is the main file which starts the program DataMiner.
 * DataMiner i designed to find information from a text input, 
 * using regex to find that information
 *
 * @author		Luc Gremillion, S02597411
 * @version		2022-4-17, CSC-240 Assignment 10
 */
public class DataMiner {

/**
* Main entry point.
* <p>
* Execute:</p>
* <pre>dataminer.DataMiner</pre>
*
* @param args                       not used
*/
public static void main(String[] args) {
    new Find().findItems();
}

}
