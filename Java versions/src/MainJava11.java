public class MainJava11 {
    /**
     * java 11
     *
     * Important Changes and Information
     * The deployment stack required for running applets and web applications has been removed from JDK which was deprecated in JDK 9.
     * An entire section of supported browsers has been removed from the list of supported configurations due to the unavailability of the deployment stack.
     * Auto-update has been removed from JRE installations in Windows and macOS.
     * JavaFX and Java Mission Control is now available as a separate download.
     * Java language translation for French, German, Italian, Korean, Portuguese (Brazilian), Spanish, and Swedish is no longer provided.
     * In this version, JRE or Server JRE is no longer offered. Only JDK is offered.
     * Updated packaging format for Windows has changed from tar.gz to .zip
     * Updated package format for macOS has changed from .app to .dmg
     *
     * 1. new String methods like isBlank(), lines(), strip(), stripLeading(), stripTrailing(), and repeat(n)
     *
     * 2. new File Methods like writeString(), readString(), isSameFile()
     *
     * 3. Patten recognizing methods
     *asMatchPredicate(): This method is similar to Java 8 method asPredicate(). Introduced in JDK 11, this method will create a predicate if the pattern matches with the input string.
     *
     * 4.  Epsilon Garbage Collector
     * This handles memory allocation but does not have an actual memory reclamation mechanism. Once the available Java heap is exhausted, JVM will shut down.
     *
     * Its goals are:-
     *
     * Performance testing
     * Memory pressure testing
     * last drop latency improvements
     *
     *
     *5. Removed the Java EE and CORBA modules
     * These modules were deprecated in Java 9 with a declaration to remove those in further JDK versions.
     *
     *
     * 
     *
     *
     * @param args
     */



    public static void main(String[] args) {

    }
}
