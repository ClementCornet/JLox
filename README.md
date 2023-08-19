# JLox
Lox tree-walk interpreter written in Java, using <a href="http://www.craftinginterpreters.com/">Crafting Interpreters</a> as a basis.

To run the interpreter :  
From root dir
```bash
javac lox/Lox.java # Generate .class files  
java lox/Lox [optional filename] # run  
```
Opens a repl if no filename is given.  
To remove the `.class` files

```bash
del *.class
``` 

All in one : 
```bash
javac lox/Lox.java ; java lox/Lox test.lox; del lox/*.class
```