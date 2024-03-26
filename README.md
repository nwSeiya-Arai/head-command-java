# head-command-java
UNIXコマンド(head)を使用してJavaの標準ライブラリのみを用いて再現する。

**gitclone & コンパイル**
```
git clone https://github.com/nwSeiya-Arai/head-command-java
javac HeadCommand.java
```

**実行コマンド↓↓**
```
java HeadCommand <file> <-c<bytes>> or <-n<lines>>
```

**第一引数**
```
「file」の部分には、読み込ませる任意のファイルを指定。
※本プロジェクトにサンプルテキストとしてread.txtを用意しているのでそのファイルを読み込ませてもよい。
```

**第二引数**
```
「lines」の部分は
・-cn：文字数指定モード(例：java HeadCommand read.txt -c100)
　→先頭から100バイトまでの文字数を表示
・-nn：行数指定モード(例：java HeadCommand read.txt -n5)
　→先頭から5行目までを表示
```

**工夫した点**
```
・headの-cオプションと-nオプションを再現いたしました。
・コマンドの入力エラーは検知し、正しいコマンドの利用法をエラーメッセージにて出力するようにいたしました。
```
