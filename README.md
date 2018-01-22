# Geilo Winter School 2018: Probabilistic Machine Learning with the AMIDST Toolbox

## Install AMIDST Toolbox

First, check whether you have installed Java 8 or Java 9:
```bash
$ java -version
```
If Java 8 (or Java 9) is not installed download it from [here](http://www.oracle.com/technetwork/java/javase/downloads/index.html).

For compiling and runing the toolbox you have two options:

1. **Intellij IDEA** (recommended): You can download it from [here](https://www.jetbrains.com/idea/). 

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

If you have installed maven, you can compile and build the package from command line:

```bash
$ mvn clean package
```

For runing any Java file you should type:

```bash
   $ java -cp target/GeiloWinterSchool2018-full.jar winter.Session2.A_GaussianMixture

```

## Probabilistic Machine Learning with the AMIDST Toolbox

The lessons will be divided in six sessions (45 minutes). 

* **Session 1**: Introduction to Probabilistic Machine Learning
   - Slides can be downloaded [here](https://github.com/andresmasegosa/GeiloWinterSchool2018/raw/master/slides/Slides1-IntroPML.pdf).

* **Session 2**: Introduction to the AMIDST Toolbox.
   - Slides can be downloaded [here](https://github.com/andresmasegosa/GeiloWinterSchool2018/raw/master/slides/Slides2-IntroAmidst.pdf).
   - Code exercises can be found [here](https://github.com/andresmasegosa/GeiloWinterSchool2018/tree/master/src/main/java/winter/Session2). 

* **Session 3**: Coding an Intelligent Fire Detector System with the AMIDST Toolbox.
   - Slides can be downloaded [here](https://github.com/andresmasegosa/GeiloWinterSchool2018/raw/master/slides/Slides3-FireDetector.pdf.pdf).
   - Code exercises can be found [here](https://github.com/andresmasegosa/GeiloWinterSchool2018/tree/master/src/main/java/winter/Session3). 

* **Session 4**: Latent Variable Models.
   - Slides can be downloaded [here](https://github.com/andresmasegosa/GeiloWinterSchool2018/raw/master/slides/Slides4-LVMs.pdf).

* **Session 5**: Streaming data, Scalable Learning and Temporal Models with the AMIDST Toolbox.
   - Slides can be downloaded [here](https://github.com/andresmasegosa/GeiloWinterSchool2018/raw/master/slides/Slides5-StreamsScalability.pdf).
   - Code exercises can be found [here](https://github.com/andresmasegosa/GeiloWinterSchool2018/tree/master/src/main/java/winter/Session5). 

* **Session 6**: Future Trends in Probabilistic Machine Learning.
   - Slides can be downloaded [here]().


    

