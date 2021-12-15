@echo off
java -cp ../javacc.jar javacc -OUTPUT_DIRECTORY:./compiled/ Doggo.jj && echo -  && echo --------------- COMPILATION JCC OK --------------- && echo - &&  cd ./compiled && javac ./Doggo.java && echo - && echo --------------- COMPILATION JAVA OK --------------- && echo - && java Doggo ../fichier_test.dog
pause