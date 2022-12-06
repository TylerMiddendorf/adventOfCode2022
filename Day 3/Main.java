import java.io.File;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception{
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int curr = 0;
        while (sc.hasNextLine())
          curr += getScore(getChar(sc.nextLine()));
        System.out.println(curr);
        sc.close();
    }

    static char getChar(String in){
        int len = in.length()/2;
        String one = in.substring(0, len);
        String two = in.substring(len,in.length());
        for(char i:one.toCharArray())
            for(char j:two.toCharArray())
                if(i==j)
                    return i;
        System.out.println("error");
        return '.';
    }

    static int getScore(char in){
        char[] data = {'.','a','b','c','d','e','f','g','h','i','j',
                        'k','l','m','n','o','p','q','r','s','t','u',
                        'v','w','x','y','z','A','B','C','D','E','F',
                        'G','H','I','J','K','L','M','N','O','P','Q',
                        'R','S','T','U','V','W','X','Y','Z'};
        return new String(data).indexOf(in);
    }

}