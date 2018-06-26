# hello-world

This GitHub repository contains the source code for a "Hello World" example program written in the Java programming language and project files to automate the building of the program.

For this first exercise there is no need to write any Java program text, the focus is on downloading and building the provided source code.

## Preparation

Install the necessary software.

1. JDK (Java Development Kit)
1. Maven
1. Git
1. A programmer's editor or IDE (Integrated Development Environment)

See the wiki at https://github.com/ExeterBScDTS/hello-world/wiki for information on downloading and installing these software packages.

## The exercise

This first exercise does not require any programming, so no knowledge of Java is required.  The purpose of the exercise is to ensure all the software required to develop Java applications is correctly installed and then guide you through the typical workflow for compiling and testing a Java program.

1. Download this repository
    
    As you are not going to be writing a program for this exercise it will be necessary to download an existing program and compile it from source code.

   You should make a local copy of this repository using the git program.

   Note that git can download using either the https or ssh protocol. You should use the https protocol unless you are already familiar with ssh and have the ssh software installed on your computer. 
   You should enter these commands at the Windows command prompt (or in a shell terminal if you are using Mac or Linux)

   The ```REPOSITORY_URL``` is the text from the ```Clone or download``` button in the GitHub repository web page.  If you are viewing this document on GitHub you should see this green button near the top right.  Be sure to select the https version of the URL.
    ```shell
    mkdir java_exercises
    cd java_exercises
    git clone REPOSITORY_URL
    ```
1. Check that the Java compiler and Maven are installed

    If the commands ```javac``` and ```mvn``` are available then you have most likely got a useable build environment.
    ```shell
    javac -version
    ```
    Should return a message like this
    ```shell
    javac 1.8.0_172
    ```    
    and
    ```shell
    mvn -version
    ```
    Should return a message like
    ```shell
    Apache Maven 3.5.0
    Maven home: /usr/share/maven
    Java version: 1.8.0_172, vendor: Oracle Corporation
    Java home: /usr/lib/jvm/jdk1.8.0_172-amd64/jre
    Default locale: en_GB, platform encoding: UTF-8
    OS name: "linux", version: "4.13.0-45-generic", arch: "amd64", family: "unix"
    ```

1. Compile the hello-world application
    Do this using the ```mvn``` command, rather than through your IDE. First you must change directory so you are in the downloaded repository. Once in the repository there are two projects to build, we will start with the ```initial``` project, so change to that directory.
    ```shell
    cd hello-world
    cd initial
    mvn compile
    ```
    If all is well this should give many lines of output most beginning ```[INFO]``` and perhaps a few beginning ```[WARNING]```.

1. Run the compiled program
    ```shell
    java -cp ./target/classes hello.HelloWorld
    ```

1. Create the jar package
    ```shell
    mvn package
    ```
    
    Now you can run the program from the jarfile package, like this
    ```shell
    java -jar target/hello-world-0.1.0.jar
    ```




## Questions and answers
### What is a GitHub repository?
A 'local' copy is on your own computer disk. Once you have done this you will be able to work offline, make changes and save them. This is a necessary step when building any project whether you are writing your own code or using code written by others.



