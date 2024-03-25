import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class HeadCommand{
	public static void main(String[] args){
		//コマンド実行の引数を受取り、正しい引数が受取れているか確認する。
		//正しい引数を受取れない場合、正しいコマンドの正解を表示しプログラムを終了する。
		if (args.length != 2) {
			System.err.println("Usage: java HeadCommand <file> <lines>");
			//異常終了
			System.exit(1);
		}
		
		//ファイルパスを変数に格納する。
		String filePath = args[0];
		
		//読み込むファイルのパスがあっているか確認する。
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			//表示する行の数を変数に格納する。
		    int linesToShow = Integer.parseInt(args[1]);
			//読み込んだ行の内容を格納するための変数
			String line;
			//表示した行数をカウントするための変数
			int linesRead = 0;
			//ファイルの中身を1行ずつ読み込み、指定された行数までの内容を表示する。
			while ((line =reader.readLine()) != null && linesRead < linesToShow) {
				System.out.println(line);
				linesRead++;
			}
		} catch (IOException | NumberFormatException e) {
			//読み込むファイルに問題がある場合エラーメッセージを表示する
			System.err.println(e.getMessage());
		}
	}
}









