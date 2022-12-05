import java.io.File;
import java.util.Scanner;

class Main2{
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
                out = 3;
            case 'Y':
                out +=3;
        }
        switch(in.charAt(0)){
            case 'A':
                if(out == 3)
                    out += 1;
                else if(out == 6)
                    out += 2;
                else
                    out += 3;
                break;
            case 'B':
                if(out == 3)
                    out += 2;
                else if(out == 6)
                    out += 3;
                else
                    out += 1;
                break;
            case 'C':
                if(out == 3)
                    out += 3;
                else if(out == 6)
                    out += 1;
                else
                    out += 2;
            }
        return out;
    }
}

