# Geilo Winter School 2018: Pratical Artificial Intelligence

## Install AMIST Toolbox

First, check whether you have installed Java 8:
```bash
$ java -version
```
If Java 8 is not installed download it from [here](http://www.oracle.com/technetwork/java/javase/downloads/index.html).

For compiling and runing the toolbox you have two options:

1. **Intellij IDEA**: You can download it from [here](https://www.jetbrains.com/idea/). 

2. **Maven**: Follow the [official web page](https://maven.apache.org/install.html) for instructions about how to install it. 


## AMIDST Toolbox Documentation

1. AMIDST Toolbox web page is [www.amidsttoolbox.com](www.amidsttoolbox.com).
2. Documentation with code examples can be found [here](http://www.amidsttoolbox.com/documentation/).
3. Java Docs with all references to the API can be found [here](http://javadoc.amidsttoolbox.com/0.6.3/).


## Download GeiloWinterSchool2018 code repository

First, download the project code:

```bash
$ git clone https://github.com/andresmasegosa/GeiloWinterSchool2018.git
```

Enter in the downloaded folder:

```bash
$ cd GeiloWinterSchool2018/
```

If you have installed maven, you can compile and build the package:

```bash
$ mvn clean package
```

For runing any Java file you should type:

```bash
$ java -cp target/example-project-full.jar NameOfTheJavaFile

```

