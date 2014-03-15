template-ant-java
=================

環境設定
--------

    mkdir -p tool/arch

### [JavaNCSSの設定](http://www.kclee.de/clemens/java/javancss/)

    cd tool/arch
    wget http://www.kclee.de/clemens/java/javancss/javancss-32.53.zip

    cd ..
    7z x arch/javancss-32.53.zip

### [CPDの設定](http://pmd.sourceforge.net/)

    cd tool/arch
    wget http://downloads.sourceforge.net/project/pmd/pmd/5.1.0/pmd-bin-5.1.0.zip

    cd ..
    7z x arch/pmd-bin-5.1.0.zip

### [Checkstyleの設定](http://checkstyle.sourceforge.net/)

    cd tool/arch
    wget http://downloads.sourceforge.net/project/checkstyle/checkstyle/5.7/checkstyle-5.7-bin.zip

    cd ..
    7z x arch/checkstyle-5.7-bin.zip

### [Findbugsの設定](http://findbugs.sourceforge.net/)

    cd tool/arch
    wget http://downloads.sourceforge.net/project/findbugs/findbugs/2.0.3/findbugs-noUpdateChecks-2.0.3.zip

    cd ..
    7z x arch/findbugs-noUpdateChecks-2.0.3.zip

### [JaCoCoの設定](http://www.eclemma.org/jacoco/index.html)

    cd tool/arch
    curl -Lfo jacoco-0.6.5.201403032054.zip http://search.maven.org/remotecontent?filepath=org/jacoco/jacoco/0.6.5.201403032054/jacoco-0.6.5.201403032054.zip

    cd ..
    7z x arch/jacoco-0.6.5.201403032054.zip -ox
    mv x jacoco-0.6.5


ディレクトリ構成
----------------

    tempate-ant-java/
    ├─product/
    │  ├─app-data/
    │  │  ├─src/
    │  │  ├─test/
    │  │  │  └─src/
    │  │  ├─build.xml
    │  │  └─version.xml
    │  ├─app-main/
    │  │  ├─src/
    │  │  ├─test/
    │  │  ├─build.xml
    │  │  └─version.xml
    │  ├─integration/
    │  │  ├─build-custom.xml
    │  │  ├─build.xml
    │  │  └─version.xml
    │  └─common/
    │      ├─lib/
    │      ├─libext/
    │      ├─common.properties
    │      └─common.xml
    ├─repository/
    │  ├─cache/
    │  ├─local/
    │  └─shared/
    ├─tool/
    │  ├─checkstyle-5.7
    │  ├─findbugs-2.0.3
    │  ├─jacoco-0.6.5
    │  ├─javancss-32.53
    │  └─pmd-bin-5.1.0
    └─README.md


eclipseを使用する手順
---------------------

### プラグインのインストール

「ヘルプ」→「マーケットプレース」メニューから以下のプラグインをインストールする。

*   Apache IvyIDE
*   Groovy/Grails Tool Suite (GGTS) for Eclipse Kepler (4.3)
    * Eclipse Quicksearch
    * Groovy Compiler 2.0 Feature
    * Groovy-Eclipse Feature
    * JDT Core patch for Groovy-Eclipse plugin
*   Gradle Integratio for Eclipse
    * Gradle IDE
    * org.gradle.toolingapi.feature
*   Spock Plugin

### ワークスペースの作成と環境設定

*   template-ant-javaのルートをワークスペースとしてeclipseを起動する。
*   プロジェクトをインポートする。
*   「ウィンドウ」→「設定」メニューから以下の通り設定を行う。
    * 一般＞ワークスペース
      * テキスト・ファイルのエンコード ⇒ その他：UTF-8
      * 新規テキスト・ファイルの行区切り文字 ⇒ その他：Unix
    * 一般＞外観＞色とフォント
      * 基本＞テキスト・フォント ⇒ 見やすいものに変更
    * Java＞インストール済みのJRE ⇒ Java7
    * Java＞コンパイラー ⇒ コンパイラー準拠レベル1.7
    * Java＞ビルド・パス＞ユーザー・ライブラリー
      * 「新規」ボタンを押して lib_unmanaged を追加
      * 「jar追加」ボタンを押して common/lib 内のjarファイルを追加
    * チーム＞Git
      * デフォルト・リポジトリー・フォルダー ⇒ 任意
    * プロパティーエディター
      * 「全てユニコード変換しない」をチェック


参考
----
* [Apache Ant Manual](https://ant.apache.org/manual/)
* [Apache Ivy Documentation](http://ant.apache.org/ivy/history/latest-milestone/index.html)

<!-- vim: set ts=4 sw=4 et:-->
