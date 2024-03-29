package File_67_76.File_72;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class DocDuLieuVanBanText {
    public static void main(String[] args) {

        /* Cách 1

        File f = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File_67_76\\File_72\\file.txt");
        try {
            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while(true){
                line = br.readLine();
                if(line == null){
                    break;
                }else{
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        /* Cách 2 */
        File f2 = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File_67_76\\File_72\\file.txt");
        try {
            List<String> allText = Files.readAllLines(f2.toPath(),StandardCharsets.UTF_8);
            for(String line : allText){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
