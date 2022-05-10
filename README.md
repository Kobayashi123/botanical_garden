# botanical_garden

## 実行方法

git clone https://github.com/Kobayashi123/botanical_garden.git
cd botanical_garden
java -jar target/Garden-1.0.0.jar

もしくは、

git clone https://github.com/Kobayashi123/botanical_garden.git
cd botanical_garden/target/classes
java Garden

## コンパイル方法

target ディレクトリに jar ファイルを用意しているため、コンパイルは不要である。
しかし、java プログラムからビルドすることも可能である。
ビルドツールには Maven を使用している。

### パッケージ化

git clone https://github.com/Kobayashi123/botanical_garden.git
cd botanical_garden
mvn package

### コンパイル

git clone https://github.com/Kobayashi123/botanical_garden.git
cd botanical_garden
mvn compile
