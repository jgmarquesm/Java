# Compiling Java Program

You must have JDK already installed to compiling Java Program using Command Line Interface (CLI).
Well, after you install JDK, navegate to the directory where the .java files are and execute these
commands on shell (using the Multiplier and ClientProgram):

`javac Multiplier.java`

`javac ClientProgram.java`

`java ClientProgram`

And it will run!

So, let's understando how it works...

First you need to execute the "dependences", for example: ClientProgram uses Multiplier, thus you must 
compile Multiplier first. After you compile all dependences, compile the Class that have the main method.
And to finish, to execute the tasks on Java Program run java ClientProgram (because the main method is here).

# Creating Java executable Apps using CLI

Here we need to follow some steps to create an executable from a Java class. We need to start by add a file called 'manifest.mf' to
folder and its content is: 

`Main-Class: <ClassName>`

and mut have a blank line at line 2.

After compiling the Java Program and create manifest file, we need to execute:

`jar -cvfm programname.jar manifest.mf *.class`

And that is it.
To execute it on CLI do:

`java -jar programname.jar`