import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class HeadCommand{
	public static void main(String[] args){
		if (args.length != 2 || (!args[1].startsWith("-c") && !args[1].startsWith("-n"))) {
			System.err.println("Usage: java HeadCommand <file> <-c<bytes>> or <-n<lines>>");
			System.exit(1);
		}
		
		
		String filePath = args[0];
		boolean optionC = args[1].startsWith("-c");
		int num = Integer.parseInt(args[1].substring(2));
		
		
		try {
            if (optionC) {
                readByBytes(filePath, num);
            } else {
                readByLines(filePath, num);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
	}
		
		private static void readByBytes(String filePath, int numBytes)throws IOException{
			FileInputStream inputStream = new FileInputStream(filePath);
			 byte[] buffer = new byte[numBytes];
            int bytesRead = inputStream.read(buffer);
            if (bytesRead != -1) {
                String content = new String(buffer, 0, bytesRead);
                System.out.println(content);
            }
		}
		
		private static void readByLines(String filePath, int numLines)throws IOException{
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line;
			int linesRead = 0;
			while ((line =reader.readLine()) != null && linesRead < numLines) {
				System.out.println(line);
				linesRead++;
			}
		}
			
	
}









