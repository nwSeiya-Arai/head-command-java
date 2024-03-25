import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class HeadCommand{
	public static void main(String[] args){
		//�R�}���h���s�̈���������A����������������Ă��邩�m�F����B
		//����������������Ȃ��ꍇ�A�������R�}���h�̐�����\�����v���O�������I������B
		if (args.length != 2) {
			System.err.println("Usage: java HeadCommand <file> <lines>");
			//�ُ�I��
			System.exit(1);
		}
		
		//�t�@�C���p�X��ϐ��Ɋi�[����B
		String filePath = args[0];
		
		//�ǂݍ��ރt�@�C���̃p�X�������Ă��邩�m�F����B
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			//�\������s�̐���ϐ��Ɋi�[����B
		    int linesToShow = Integer.parseInt(args[1]);
			//�ǂݍ��񂾍s�̓��e���i�[���邽�߂̕ϐ�
			String line;
			//�\�������s�����J�E���g���邽�߂̕ϐ�
			int linesRead = 0;
			//�t�@�C���̒��g��1�s���ǂݍ��݁A�w�肳�ꂽ�s���܂ł̓��e��\������B
			while ((line =reader.readLine()) != null && linesRead < linesToShow) {
				System.out.println(line);
				linesRead++;
			}
		} catch (IOException | NumberFormatException e) {
			//�ǂݍ��ރt�@�C���ɖ�肪����ꍇ�G���[���b�Z�[�W��\������
			System.err.println(e.getMessage());
		}
	}
}









