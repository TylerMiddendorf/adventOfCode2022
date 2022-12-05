import java.io.File;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int max = 0; 
        int curr = 0;
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.equals("")){ 
                if(curr>max)
                    max = curr; 
                curr = 0;
            }
            else      
                curr += Integer.parseInt(line);
        }
    System.out.println(max);
    sc.close();
    }
}