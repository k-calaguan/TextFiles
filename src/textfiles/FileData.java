package textfiles;
import java.io.IOException;

public class FileData {

    public static void main(String[] args) throws IOException {
        String file_name = "C:/Users/Kristanelle Calaguan/Desktop/test.txt";

        // READ A FILE
        try {
            ReadFile file = new ReadFile(file_name);
            String[] aryLines = file.OpenFile();

            for (int i=0; i<aryLines.length; i++) {
                System.out.println(aryLines[i]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // WRITE TO A FILE
        /*try {
            WriteFile data = new WriteFile(file_name, true);
            data.WriteToFile("\nThis is line four");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/

    }
}
