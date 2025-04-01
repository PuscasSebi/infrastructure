public class MainJava10 {
    // https://www.baeldung.com/java-10-overview#local-variable-type-inference
    /**
     * 1. Local Variable Type Inference
     *          var message = new String("dw");
     *
     * 3. Unmodifiable Collections
     * 3.1. copyOf()
     * java.util.List, java.util.Map and java.util.Set each got a new static method copyOf(Collection).
     *
     * It returns the unmodifiable copy of the given Collection:
     *
     * 3.2. toUnmodifiable*()
     * java.util.stream.Collectors get additional methods to collect a Stream into unmodifiable List, Map or Set:
     *
     * 4. Optional*.orElseThrow()
     *java.util.Optional, java.util.OptionalDouble, java.util.OptionalIntand java.util.OptionalLongeach got a new method orElseThrow()which doesn’t take any argument and throws NoSuchElementExceptionif no value is present:
     *
     *
     * 5. Perforamnace improvements
     *  5.1Parallel full GC for G1
     *  The G1 garbage collector is the default one since JDK 9. However, the full GC for G1 used a single threaded mark-sweep-compact algorithm.
     *
     * This has been changed to the parallel mark-sweep-compact algorithm in Java 10 effectively reducing the stop-the-world time during full GC.
     *
     *  5.2 Application Class-Data Sharing
     * Class-Data Sharing, introduced in JDK 5, allows a set of classes to be pre-processed into a shared archive file that can then be memory-mapped at runtime to reduce startup time which can also reduce dynamic memory footprint when multiple JVMs share the same archive file.
     *5.3  Experimental Java-Based JIT Compiler
     * Graal is a dynamic compiler written in Java that integrates with the HotSpot JVM; it’s focused on high performance and extensibility. It’s also the basis of the experimental Ahead-of-Time (AOT) compiler introduced in JDK 9.
     *
     *
     * JDK 10 enables the Graal compiler, to be used as an experimental JIT compiler on the Linux/x64 platform.
     *
     * To enable Graal as the JIT compiler, use the following options on the java command line:
     *
     *
     *
     * 6. Container awarness - jvms are now aware of being run in docker. and will extract docker container speciic config
     * However, this support is only available for Linux-based platforms. This new support is enabled by default and can be disabled in the command line with the JVM option:
     *
     * -XX:-UseContainerSupport
     * Copy
     * Also, this change adds a JVM option that provides the ability to specify the number of CPUs that the JVM will use:
     *
     * -XX:ActiveProcessorCount=count
     * Copy
     * Also, three new JVM options have been added to allow Docker container users to gain more fine-grained control over the amount of system memory that will be used for the Java Heap:
     *
     * -XX:InitialRAMPercentage
     * -XX:MaxRAMPercentage
     * -XX:MinRAMPercentage
     * Root Certificates
     *
     *
     * 7. The cacerts keystore, which was initially empty so far, is intended to contain a set of root certificates that can be used to establish trust in the certificate chains used by various security protocols.
     *
     * As a result, critical security components such as TLS didn’t work by default under OpenJDK builds.
     *
     * With Java 10, Oracle has open-sourced the root certificates in Oracle’s Java SE Root CA program in order to make OpenJDK builds more attractive to developers and to reduce the differences between those builds and Oracle JDK builds.
     *
     *  8. Time-Based Release Versioning
     * Starting with Java 10, Oracle has moved to the time-based release of Java. This has following implications:
     *
     * A new Java release every six months. The March 2018 release is JDK 10, the September 2018 release is JDK 11, and so forth. These are called feature releases and are expected to contain at least one or two significant features
     * Support for the feature release will last only for six months, i.e., until next feature release
     * Long-term support release will be marked as LTS. Support for such release will be for three years
     * Java 11 will be an LTS release
     *
     *https://www.digitalocean.com/community/tutorials/java-10-features
     *
     *
     *
     * @param args
     */

    public static void main(String[] args) {

    }
}
