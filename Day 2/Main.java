import java.io.File;
import java.util.Scanner;

class Main{
    public static void main(String[] args) throws Exception{
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);

        int scored = 0;
        while (sc.hasNextLine())
            scored += (score(sc.nextLine()));
        System.out.println(scored);
    }

    static int score(String in){
        int out = 0;
        switch(in.charAt(2)){
            case 'Z':
                out ++;
            case 'Y':
                out ++;
            case 'X':
                out ++;
        }
        switch(in.charAt(0)){
            case 'A':
                if(out == 1)
                    out += 3;
                else if(out == 2)
                    out += 6;
                break;
            case 'B':
                if(out == 2)
                    out += 3;
                else if(out == 3)
                    out += 6;
                break;
            case 'C':
                if(out == 3)
                    out += 3;
                else if(out == 1)
                    out += 6;
        }
        return out;
    }
}
