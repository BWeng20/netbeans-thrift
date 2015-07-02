REM Generates Parser and Lexer from ANTLR syntay file
java -jar antlr-3.5.2-complete-no-st3.jar Thrift.g
copy /B *.java ..\src\bweng\thrift\parser\

pause