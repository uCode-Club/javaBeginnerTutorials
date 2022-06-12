import org.example.lesson6.A;
import org.example.lesson6.B;

public final class Lesson6 {
    public static void main(String[] args) {
        // Inheritance
        A a = new A();
        System.out.println(a.info);
        a.welcome();
        a.helloWorld();
        System.out.println(a /* a.toString() */);
        // Compile error
        //System.out.println(a.getName());

        System.out.println();

        B b = new B();
        System.out.println(b.PI);
        b.doStuff();
        b.welcome();
        b.helloWorld(); // Overridden method
        System.out.println(b /* b.toString() */);
        System.out.println(b.successCode); // successCode from class A
        System.out.println(b.getName());

        System.out.println();

        A bAsA = new B();
        bAsA.helloWorld();
        bAsA.welcome();
        System.out.println("Test " + bAsA /* toString() of B */);
        System.out.println("Test " + bAsA.errorCode /* errorCode of A */);
        // Compile error
        //System.out.println(bAsA.getName());

        // For 'bAsA':
        // Methods: if overridden, B method implementations are used, or else A implementations are used, or Object implementations are used
        // Fields: A fields are used; B values of such fields are not used

        System.out.println();
        System.out.println();

        // Casting (classes: regular classes)

        // Beware when casting as a ClassCastException may be thrown if it's not an instance of the class you're casting to
        // For example (ideas and examples):
        // • Error: Casting a 'cat' object to a 'table' object
        // • Error: Casting an Object object (Object obj = new Object()) to org.example.Lesson6
        // • Valid: Casting a 'cat' object to an 'animal' object
        // • Valid: Casting anything to an Object object since all classes extend Object
        //
        // To be on the safe side, use instanceof, or use parameters that take in the more super-specific type.

        // instanceof keyword
        //  Variable    Class
//      if (bAsA instanceof B) {
//          B bAsANowAsB = (B) bAsA;
//          bAsANowAsB.doStuff();
//
//          // Super compact
//          //((B) bAsA).doStuff();
//      }

        // Recommended way, but up to you
        //  Variable    Class Pattern variable
        if (bAsA instanceof B bAsANowAsB) {
            bAsANowAsB.doStuff();
            //bAsANowAsB.infoText
        }

        System.out.println();

        classAMethod(a);
        System.out.println();
        classAMethod(b /* Again, works since b is an instance of A */);
        System.out.println();
        classAMethod(bAsA);
    }

    private static void classAMethod(A a) {
        a.welcome();
        a.helloWorld();
        System.out.println(a instanceof B);
    }
}
