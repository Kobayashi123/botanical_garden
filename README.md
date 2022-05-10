# botanical_garden

## 実行方法

git clone https://github.com/Kobayashi123/botanical_garden.git<br>
cd botanical_garden<br>
java -jar target/Garden-1.0.0.jar<br>

もしくは、

git clone https://github.com/Kobayashi123/botanical_garden.git<br>
cd botanical_garden/target/classes<br>
java Garden<br>

## コンパイル方法

target ディレクトリに jar ファイルを用意しているため、コンパイルは不要である。<br>
しかし、java プログラムからビルドすることも可能である。<br>
ビルドツールには Maven を使用している。<br>

### パッケージ化

git clone https://github.com/Kobayashi123/botanical_garden.git<br>
cd botanical_garden<br>
mvn package<br>

### コンパイル

git clone https://github.com/Kobayashi123/botanical_garden.git<br>
cd botanical_garden<br>
mvn compile<br>
