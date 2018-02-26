import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {

        if(args.length != 2) {
            System.out.println("Use: java -jar writeCJ.jar \"/sub1/sub2/File.txt\" \"My String to write into File\"");
        }

        String path = args[0];
        String text = args[1];

        try {
            File f = new File(path);
            if (f.getParentFile() != null) {
                Boolean b = f.getParentFile().mkdirs();
                if(b)
                    System.out.println("Some parent directories created: " + f.getParentFile());
            }
            f.createNewFile();
            System.out.println("File created: " + f.getName());

            FileWriter fw = new FileWriter(f);
            fw.write(text);
            System.out.println("String written to file.");
            fw.close();
            System.out.println("File closed.");
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        }
    }
}