@echo off
:: Maven Wrapper script for Windows
:: Downloads Maven if not present, then runs it

set MAVEN_HOME=%USERPROFILE%\.m2\wrapper\dists\apache-maven-3.9.6
set MAVEN_CMD=%MAVEN_HOME%\bin\mvn.cmd

if exist "%MAVEN_CMD%" goto runMaven

echo Downloading Maven 3.9.6...
mkdir "%MAVEN_HOME%" 2>nul
powershell -Command "Invoke-WebRequest -Uri 'https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.6/apache-maven-3.9.6-bin.zip' -OutFile '%TEMP%\maven.zip'"
powershell -Command "Expand-Archive -Path '%TEMP%\maven.zip' -DestinationPath '%MAVEN_HOME%\..'"
if exist "%MAVEN_HOME%\..\apache-maven-3.9.6" (
    xcopy /E /Y /Q "%MAVEN_HOME%\..\apache-maven-3.9.6\*" "%MAVEN_HOME%\" >nul
    rmdir /S /Q "%MAVEN_HOME%\..\apache-maven-3.9.6" 2>nul
)
del "%TEMP%\maven.zip" 2>nul
echo Maven 3.9.6 installed.

:runMaven
"%MAVEN_CMD%" %*
