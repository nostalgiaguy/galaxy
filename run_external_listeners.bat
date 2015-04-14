cd listener
mkdir com\javacodegeeks\serviceloader
copy ..\bin\com\javacodegeeks\serviceloader\ServiceLoaderExampleSuiteListener.class com\javacodegeeks\serviceloader
jar cvf ../serviceLoader.jar .
cd..
echo run %1%
java -classpath serviceLoader.jar;testng.jar;bin  org.testng.TestNG %1%