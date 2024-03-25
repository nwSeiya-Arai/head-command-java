# head-command-java
UNIXコマンド(head)を使用してJavaの標準ライブラリのみを用いて再現する。

**gitclone & コンパイル**
```
git clone https://github.com/nwSeiya-Arai/head-command-java
javac HeadCommand.java
```

**実行コマンド↓↓**
```
java HeadCommand <file> <lines>
```

※<file>の部分には、sample.txtが存在するディレクトリを指定。<lines>の部分は1～15までの整数を入力。
例：java HeadCommand sample.txt 5
（先頭から5行目までを表示）

**工夫した点**
・headの-nオプションを再現いたしました。
・コマンドの入力エラーは検知し、エラーメッセージを出力するようにいたしました。

