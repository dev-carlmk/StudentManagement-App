@echo off
cd /d "%~dp0"
javac -cp ".;lib/mysql-connector-j-9.7.0.jar" *.java
java -cp ".;lib/mysql-connector-j-9.7.0.jar" Main
pause