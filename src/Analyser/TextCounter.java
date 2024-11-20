package Analyser;
public class TextCounter {
    public int charCount;
    public int lineCount;
    public int wordCount;
    public String longWord ="";

    public boolean inputText(String text){
        if(text.toLowerCase().contains("stop")){ //wanted the stop to be noticed whichever way that the stop was written
            return false;
        }
        String[] wordArray = text.trim().split("\\s+"); //this makes it so the blankspaces aren't counted as characters, as well as helping the program figure out the longest word
        for(int i=0; i < wordArray.length; i++)
        {
            charCount += wordArray[i].length();
            if(wordArray[i].length() > longWord.length())
            {
                longWord = wordArray[i];
            }
        }
        wordCount += wordArray.length;

        lineCount += 1;
        return true;
    }
}
