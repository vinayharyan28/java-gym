package filehandling;
import java.io.*;


public class FileHandling {
    public static void fileReader(){
        try(FileReader fileReader = new FileReader("F:\\java-gym\\src\\filehandling\\note.txt")){
            int letters = fileReader.read();
            while (fileReader.ready()){
                System.out.println((char) letters);
                letters = fileReader.read();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void bufferReader(){
        // Byte to char stream and then reading char stream
        // Refer this line for fast input and output
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("you typed: " + bufferedReader.readLine());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void bufferFileReader(){
        // byte to char stream and then reading char stream
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\java-gym\\src\\filehandling\\note.txt"))){
            while (bufferedReader.ready()){
                System.out.println(bufferedReader.readLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void inputStreamReader(){
        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in)){
            System.out.println("Enter some letters: ");
            int letters = inputStreamReader.read();
            while (inputStreamReader.ready()){
                System.out.println((char) letters);
                letters = inputStreamReader.read();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void outputStream(){
        try(OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out)){
            outputStreamWriter.write("Hello Word\n");
            outputStreamWriter.write(97);
            outputStreamWriter.write(10);
            outputStreamWriter.write('A');
            outputStreamWriter.write('\n');
            char[] arr = "Hello world\n".toCharArray();
            outputStreamWriter.write(arr);
            outputStreamWriter.write("\\uD83D\\uDE01");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void outputStreamFileWriter(){
        // true for append
        try(FileWriter fileWriter = new FileWriter("F:\\java-gym\\src\\filehandling\\note.txt", true)){
            fileWriter.write("Hello Word\n");
            fileWriter.write(97);
            fileWriter.write(10);
            fileWriter.write('A');
            fileWriter.write('\n');
            char[] arr = "Hello world\n".toCharArray();
            fileWriter.write(arr);
            fileWriter.write("\\uD83D\\uDE01");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void bufferedWriter(){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\java-gym\\src\\filehandling\\note.txt"))){
            bufferedWriter.write("Hare Krishna");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void createFile(){
        try {
            File file = new File("F:\\java-gym\\src\\filehandling\\note-new.txt");
            file.createNewFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }



    public static void main(String[] args){
        inputStreamReader();
        fileReader();
        bufferReader();
        bufferFileReader();
        outputStream();
        outputStreamFileWriter();
        bufferedWriter();
        createFile();

    }
}
