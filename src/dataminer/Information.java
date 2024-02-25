package dataminer;

/**
 * enumeration class, holds the information for 
 * regex for a program to use for their search purposes
 *
 * @author		Luc Gremillion, S02597411
 * @version		2022-4-17, CSC-240 Assignment 10
 */
public enum Information {

/**
 * Website search information including regex string
 */
WEBSITES("websites", "(((https?|http?):\\/\\/)(\\w{1,3}.)?"
        + "[a-z0-9]+\\.\\w[a-z]+(\\/[a-zA-z0-9]?)*+\\w[a-z])", 1),

/**
 * Phone Number search information including regex string
 */
PHONE_NUMBER("phone numbers", "(\\d{3})?[\\s.-]\\d{3}[\\s.-]\\d{4}", 4),

/**
 * Date search information including regex string
 */
DATE("dates", "((\\d{1,2}[ -/]\\d{1,2}[ -/]\\d{4}))|"
        + "((\\d{4}[ -/]\\d{1,2}[ -/]\\d{1,2}))|(\\p{Alpha}[ -/]\\d{1,2},(\\s\\d{4}))", 2),

/**
 * Line search information including regex string
 */
LINES("lines", "\\R\\s", 3),

/**
 * Course search information including regex string
 */
COURSE("courses","^\\p{Alpha}{3}-?$^|\\p{Alpha}{3}-\\d{3}",5);

/**
 * String to access the first elements information
 */
private final String search;

/**
 * String to access the second elements information
 */
private final String regexPattern;

/**
 * Integer to access the third elements information
 */
private final int itemNumber;

/**
 * Constructor
 * 
 * @param search        inserts the current String
 * @param regexPattern   inserts the current regex String
 * @param itemNumber    inserts the current item number
 */
Information(String search, String regexPattern, int itemNumber) {
    this.search = search;
    this.regexPattern = regexPattern;
    this.itemNumber = itemNumber;
}

/**
 * Getter method to get the variable search
 * 
 * @return          search
 */
public String getSearch() {
    return search;
}

/**
 * Getter method to get the variable regexPattern
 * 
 * @return          regexPattern
 */
public String getRegexPattern() {
    return regexPattern;
}

/**
 * Getter method to get the variable itemNumber
 * 
 * @return          itemNumber
 */
public int getItemNumber() {
    return itemNumber;
}
}
