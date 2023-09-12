# PhoneBook
***ALL CLASSES HAVE JAVADOCS COMMENT FOR MORE INFO***
> **NOTE**: com.aptech.phonebook.App is the entry point for our project

Our project contains various directory.

* **Source**: Contains all our source code and project packages

* **Resources**: Contains the data we used for our project. I.E: The Contact.txt file for our contact database

* **Build**: Contains our project in an executable jar file.

## Breakdown of source folder

- **Designs Directory:** the designs folder contains all our gui classes and their respective JFORM files.
- **Main Java Classes:** the classes in the root directory have our main class that are interconnected.


### Requirement For The App

- Java JDK 8 or Higher
- A Terminal: To Execute Commands
- A Text Editor

### Installation Of PhoneBook App

Before running do ensure to change the file location path in the PhoneBook class to where your contacts are stored.

> NOTE: There's an available jar file in the root directory which you could run directly with the command below.

```
java -jar PhoneBook.jar
```

***OR***

> Run Previous Built Java Class
```
cd build
java com.aptech.phonebook.App
```


***OR***

> Build & Run From Scratch

Windows: Run Command
```
mkdir build
javac -d ./build ./source/com/aptech/phonebook/designs/*.java ./source/com/aptech/phonebook/*.java
```

UNIX(MAC & LINUX):
```
bash ./compile.bash
```

#### Java Concepts Used In Our Project

* Stream API
* Class & Objects
* Collection API
* File Reading 
* Clean Code Practices
