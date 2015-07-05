Because PLug-In projects can not depend on other Java projects directly, 
you have to update "ThriftParser.jar" manually if you modified the parser sources.

Go to "Properties" - "Libraries" - "Wrapped Jars" and delete the Jar file.
Then re-add it from ../ThriftParser/dist/ThriftParser.jar.

