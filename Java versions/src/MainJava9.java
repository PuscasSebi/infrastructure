public class MainJava9 {
//https://www.baeldung.com/new-java-9

    // Java 9
    // 1. Jigsaw project structure - bringing modularity into the java platform
    // a modular system bringing calabilities similar to OSGi framworks ( set of pluging specifcaitions and implementations )
    // modular JVm can run on devices with a lot less available memory.


    /*
    2. a new http client - long waited replacement for HttpURLConnection
    it supports both http 2 and websocket handshakes. , with perforamnce comparable to Apache httpClient, Netty and jetty
    While creating a module, you need to create a module-info.java class at the topmost level of your packages which shall thereafter include

module yourModule {
    requires jdk.incubator.httpclient;
}
     */


    /*
    4. Process API
The process API has been improved for controlling and managing operating-system processes.


     */

    /*
    5. Small Language Modifications
5.1. Try-With-Resources
In Java 7, the try-with-resources syntax requires a fresh variable to be declared for each resource being managed by the statement.

In Java 9 there is an additional refinement: if the resource is referenced by a final or effectively final variable, a try-with-resources statement can manage a resource without a new variable being declared:

   5.2. Diamond Operator Extension
Now we can use diamond operator in conjunction with anonymous inner classes:
Interface Private Method
Interfaces in the upcoming JVM version can have private methods, which can be used to split lengthy default methods:



6. JShell is read–eval–print loop – REPL for short.

Simply put, it’s an interactive tool to evaluate declarations, statements, and expressions of Java, together with an API. It is very convenient for testing small code snippets, which otherwise require creating a new class with the main method.

The jshell executable itself can be found in <JAVA_HOME>/bin folder:

7. JCMD Sub-Commands
Let’s explore some of the new subcommands in jcmd command line utility. We will get a list of all classes loaded in the JVM and their inheritance structure.


9. Variable Handles
The API resides under java.lang.invoke and consists of VarHandle and MethodHandles. It provides equivalents of java.util.concurrent.atomic and sun.misc.Unsafe operations upon object fields and array elements with similar performance.

With Java 9 Modular system access to sun.misc.Unsafe will not be possible from application code.


10. Publish-Subscribe Framework
The class java.util.concurrent.Flow provides interfaces that support the Reactive Streams publish-subscribe framework.
These interfaces support interoperability across a number of asynchronous systems running on JVMs.

We can use utility class SubmissionPublisher to create custom components.

11. Unified JVM Logging
This feature introduces a common logging system for all components of the JVM. It provides the infrastructure to do the logging, but it does not add the actual logging calls from all JVM components. It also does not add logging to Java code in the JDK.
 The logging framework defines a set of tags – for example, gc, compiler, threads, etc. We can use the command line parameter -Xlog to turn on logging during startup.

Let’s log messages tagged with ‘gc’ tag using ‘debug’ level to a file called ‘gc.txt’ with no decorations:

java -Xlog:gc=debug:file=gc.txt:none ...
Copy
-Xlog:help will output possible options and examples. Logging configuration can be modified runtime using jcmd command. We are going to set GC logs to info and redirect them to a file – gc_logs:

jcmd 9615 VM.log output=gc_logs what=gc


12. New APIs


12.1. Immutable Set
java.util.Set.of() – creates an immutable set of a given elements. In Java 8 creating a Set of several elements would require several lines of code. Now we can do it as simple as:

12.2. Optional to Stream
java.util.Optional.stream() gives us an easy way to you use the power of Streams on Optional elements:

List<String> filteredList = listOfOptionals.stream()
  .flatMap(Optional::stream)
  .collect(Collectors.toList());


     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        /*
        1. Factory methods for collections Lists.of
        Map.of, Set.Of
        2. Stream Api improvements . There are four new methods added to the Stream interface: dropWhile, takeWhile, ofNullable. The iterate method gets a new overload, allowing you to provide a Predicate on when to stop iterating.
        3. Jshell interctive java interpreter
        4. private methods in interfaces
        6. Multi resolution API
        7. Modular system jigsaw
        8, Process API
        9. Http/2 Client
        10. Process API
        11. Completable future API - new factory methods, support for delays, improved subclassing, new methods for handling result transformation
        improved exception handling
        12. Reactive Streams -

        Publisher: interface represents a provider of a potentially unbounded number of sequenced elements.
Subscriber: interface represents a consumer of a potentially unbounded number of sequenced elements
Subscription: interface represents link between “Publisher” and “Subscriber”.
Processor: interface represents a processing stage which is both “Subscriber” and “Publisher”.

13.

         */
    }
}