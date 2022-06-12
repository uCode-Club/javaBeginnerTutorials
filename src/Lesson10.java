import org.example.lesson10.JavaIDE;
import org.example.lesson10.Website;

public final class Lesson10 {
    public static void main(String[] args) {
        // What are enums (and some facts)?
        // • Special classes that represent predefined constants.
        // • Can contain instance fields and methods like a regular class.
        // • Contain utility methods, such as ordinal().
        //
        // • Enums implicitly extend java.lang.Enum (abstract class).
        // • Enums are final.
        // • Enums can't extend another class, but can implement interfaces.
        // • [Important] Access modifiers can't be defined for constructors.

        //                                                                                            3 - 0
        System.out.println(JavaIDE.BLUEJ.compareTo(JavaIDE.INTELLIJ_IDEA)); // 3 (JavaIDE.BLUEJ.ordinal - JavaIDE.INTELLIJ_IDEA.ordinal)
        System.out.println(JavaIDE.ECLIPSE.ordinal()); // Ordinal = "enum index" // (private fields are used in above example)
        System.out.println(JavaIDE.NETBEANS /* JavaIDE.NETBEANS.toString() */); // toString() literally returns name
        System.out.println(JavaIDE.INTELLIJ_IDEA.name()); //                       (private field in java.lang.Enum).

        System.out.println();

        Website website = Website.MACINTOSH_FAN;
        website.printURL();
        System.out.println(website.URL);
        System.out.println(website.getURL());
        System.out.println(website); // System.out.println(website.toString());

        // Congratulations!
        // Now that you have made it through Java Beginner,
        // it is now your decision if you want to continue in Java Advanced,
        // or in uCode Club with another advanced section!
    }
}
