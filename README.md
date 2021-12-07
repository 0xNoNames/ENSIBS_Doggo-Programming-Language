# Doggo-Programming-Language
JavaCC interpreter

# Compilation et exécution par CLI
## Compiler le fichier ".jj":
```bash
javacc -OUTPUT_DIRECTORY:Calculator-example/compiled/ ./Calculator-example/Calculator.jj
```
## Compiler le fichier main et exécuter le code
```bash
cd ./Calculator-example/compiled/
javac Calculator.java
java Calculator
```