package MonolinkNewsFetcher.WIP;

public class MyOwnStringTokenizer {

    /***
     * The string to be tokenized
     */
    private String string;

    /***
     * The string to be tokenized after specified delimiters
     */
    private String delimiters;

    /***
     * If set, the delimiters themselves are being used as a token
     */
    private boolean returnDelimiters;


    /***
     * Creates a new String Tokenizer object that reads whitespace-separated tokens from a string
     * @param string
     */
    public MyOwnStringTokenizer(String string){
        this.string = string;
    }

    /***
     * Creates a String Tokenizer object that uses the characters in delimiters as separate tokens
     * @param string
     * @param delimiters
     */
    public MyOwnStringTokenizer(String string, String delimiters){
        this.string = string;
        this.delimiters = delimiters;
    }

    /***
     * Creates a String Tokenizer that return delimiters as tokens if the third argument is true;
     * @param string
     * @param delimiters
     * @param returnDelimiters
     */
    public MyOwnStringTokenizer(String string, String delimiters, boolean returnDelimiters){
        this.string = string;
        this.delimiters = delimiters;
        this.returnDelimiters = returnDelimiters;
    }

    /***
     * Predicate method that returns true if there are more tokens to read from the instance of the StringTokenizer
     * @return boolean
     */
    public boolean hasMoreTokens(){
        boolean hasMoreTokens = false;
        return hasMoreTokens;
    }

    /***
     * The next token in the string
     * @return string
     */
    public String nextToken(){
        String nextToken = "";
        return nextToken;
    }
}
