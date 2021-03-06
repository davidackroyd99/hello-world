# hello-world

This GitHub repository contains the source code for a "Hello World" example program written in the Java programming language and project files to automate the building of the program.

For this first exercise there is no need to write any Java program text, the focus is on downloading and building your first Java application using the example source code.

## Preparation

Install the necessary software.  

For Windows user, Visual Studio Code and AdoptOpenJDK are recommended.  See here for more information
<https://code.visualstudio.com/docs/languages/java>  or click on this link <https://aka.ms/vscode-java-installer-win>

If you are using a different operating system or wish to use a different IDE then you must install the following.

1. JDK (Java Development Kit)
1. Maven
1. A programmer's editor or IDE (Integrated Development Environment)
1. Git (this is optional)

See the wiki at<https://github.com/ExeterBScDTS/hello-world/wiki> for information on downloading and installing these software packages.

## The exercise

This first exercise does not require any programming, so no knowledge of Java is required.  The purpose of the exercise is to ensure all the software required to develop Java applications is correctly installed and then guide you through the typical workflow for compiling and testing a Java program.

1. Download this repository

    As you are not going to be writing a program for this exercise it will be necessary to download an existing program and compile it from source code.

    Either download a Zip archive of this example here <https://github.com/ExeterBScDTS/hello-world/archive/master.zip> or make a local copy of this repository using the git program.

    Note that git can download using either the https or ssh protocol. You should use the https protocol unless you are already familiar with ssh and have the ssh software installed on your computer. If you have enabled 2-factor authentication on your GitHub account you must create a ```personal access token```. See <https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/>

    You should enter these commands at the Windows command prompt (or in a shell terminal if you are using Mac or Linux)

   The ```REPOSITORY_URL``` is the text from the ```Clone or download``` button in the GitHub repository web page.  If you are viewing this document on GitHub you should see this green button near the top right.  Be sure to select the https version of the URL.

    ```shell
    mkdir java_exercises
    cd java_exercises
    git clone REPOSITORY_URL
    ```

1. Check that the Java compiler and Maven are installed

    Open VS Code and from the ```Terminal``` menu select ```New Terminal```. You can now check if the Java compiler is correctly installed. If the commands ```javac``` and ```mvn``` are available then you have most likely got a useable build environment.

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

   In VS Code you can compile a project by right clicking on the Maven Project "hello-world" in the Explorer view.

   Or you can use the ```mvn``` command. First you must change directory so you are in the project directory.

    ```shell
    cd hello-world
    mvn compile
    ```

    If all is well this should give many lines of output most beginning ```[INFO]``` and perhaps a few beginning ```[WARNING]```.

1. Run the compiled program

    ```shell
    java -cp ./target/classes HelloWorld
    ```

1. Create the jar package

    ```shell
    mvn package
    ```

    Now you can run the program from the jarfile package, like this

    ```shell
    java -jar target/hello-world-0.1.0.jar
    ```

1. Now try modifying the program

    Instructions on creating a simple program from scratch  

    <https://code.visualstudio.com/docs/java/java-tutorial#_create-the-program>
