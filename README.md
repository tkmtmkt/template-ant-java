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
    wget -O - http://search.maven.org/remotecontent?filepath=org/jacoco/jacoco/0.6.4.201312101107/jacoco-0.6.4.201312101107.zip > jacoco-0.6.4.201312101107.zip

    cd ..
    7z x arch/jacoco-0.6.4.201312101107.zip -ox
    mv x jacoco-0.6.4.201312101107


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
    │  ├─jacoco-0.6.4.201312101107
    │  ├─javancss-32.53
    │  └─pmd-bin-5.1.0
    └─README.md


参考
----
* [Apache Ant Manual](https://ant.apache.org/manual/)

<!-- vim: set ts=4 sw=4 et:-->
