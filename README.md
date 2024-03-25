# head-command-java
UNIXコマンド(head)を使用してJavaの標準ライブラリのみを用いて再現する。

実行コマンド↓↓
javac HeadCommand.java

java HeadCommand <file> <lines>

※<file>の部分には、sample.txtが存在するディレクトリを指定。<lines>の部分は1～15までの整数を入力。
例：java HeadCommand sample.txt 5

工夫した点
・エラーメッセージを出力できるようにしたこと。
