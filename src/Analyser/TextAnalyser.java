package Analyser;
import java.util.Scanner;

public class TextAnalyser {
    public static void main(String[] args) {
        TextCounter tc = new TextCounter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the text you want analysed!");
        String row;
        row = scanner.nextLine();

        while(tc.inputText(row)) {
            row = scanner.nextLine();

        } //made a menu since teh user might just want to know certain information about the text rather than everything
        System.out.println("What do you want to know about this text?");
        System.out.println("1: How many characters is there?");
        System.out.println("2: How many lines of text is it?");
        System.out.println("3: How many words is there in this text?");
        System.out.println("4: What is the longest word in the text?");
        System.out.println("5: Nothing else, Quit");
        int choice;

        do{
            choice = scanner.nextInt(); //went with a switch instead of an if case because it is supposed to be more effective
            switch (choice){
                case 1:
                    System.out.println("This text has "+tc.charCount+" characters in it!");
                    break;

                case 2:
                    System.out.println("This text consists of "+tc.lineCount+" lines of text!");
                    break;

                case 3:
                    System.out.println("There is a total of "+tc.wordCount+" words in this text!");
                    break;

                case 4:
                    System.out.println("The longest word in this text is "+tc.longWord);
                    break;
            }

        } while(choice != 5);



    }

}
