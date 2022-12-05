import java.io.File;
import java.util.Scanner;

public class Main2 {
    static int[] top = {0,0,0};
    public static void main(String[] args) throws Exception{
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int curr = 0;
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.equals("")){ 
                addNew(curr); 
                curr = 0;
            }
            else      
                curr += Integer.parseInt(line);
        }
    System.out.println((top[0] + top[1] + top[2]));
    sc.close();
    }

    static void addNew(int in){
        if(in>top[2]){
            top[0] = top[1];
            top[1] = top[2];
            top[2] = in;
        }else if(in>top[1]){
            top[0] = top[1];
            top[1] = in;
        }else if(in > top[0])
            top[0] = in;
    }
}
