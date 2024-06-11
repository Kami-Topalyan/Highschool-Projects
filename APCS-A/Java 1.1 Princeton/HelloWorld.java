public class HelloWorld{
    public static void main(String[] args) {
       // Prints "Hello, World" in the terminal window.
       System.out.println("Hello, World");
    }
}

/* 
3.

 * a
    HelloWorld.java:2: error: <identifier> expected
        public static void (String[] args) {
                        ^
    1 error
    error: compilation failed

 *  b

    HelloWorld.java:2: error: <identifier> expected
        public static void main( args) {
                                    ^
    1 error
    error: compilation failed

 *  c

    HelloWorld.java:1: error: <identifier> expected
    public class {
                ^
    1 error
    error: compilation failed

 *  d

    HelloWorld.java:4: error: cannot find symbol
        println("Hello, World");
        ^
    symbol:   method println(String)
    location: class HelloWorld
    1 error
    error: compilation failed

 *  e

    HelloWorld.java:4: error: cannot find symbol
        System.out("Hello, World");
                ^
    symbol:   method out(String)
    location: class System
    1 error
    error: compilation failed


4.

 *  a
    HelloWorld.java:4: error: ';' expected
        System.out.println("Hello, World")
                                         ^
    1 error
    error: compilation failed

 *  b

    HelloWorld.java:4: error: unclosed string literal
        System.out.println(Hello, World");
                                       ^
    1 error

 *  c

    HelloWorld.java:4: error: unclosed string literal
        System.out.println("Hello, World);
                            ^
    1 error

 *  d

    HelloWorld.java:1: error: '{' expected
    public class HelloWorld
                        ^
    HelloWorld.java:2: error: class, interface, enum, or record expected
                    ^
    HelloWorld.java:5: error: class, interface, enum, or record expected
        }
        ^
    3 errors

 *  e
    
    HelloWorld.java:6: error: class, interface, enum, or record expected
    }
    ^
    2 errors


 *  f

    HelloWorld.java:6: error: reached end of file while parsing
    }
    ^
    1 error

 *  g
 
    HelloWorld.java:5: error: reached end of file while parsing
    }
     ^
    1 error
5.
 *  a

    error: can't find main(String[]) method in class: HelloWorld

 *  b

    HelloWorld.java:2: error: cannot find symbol
        public static void main(Sring[] args) {
                                ^
    symbol:   class Sring
    location: class HelloWorld
    1 error
    error: compilation failed

 *  c

    Can be run via commandline but fails to run when using other sources

 *  d

    HelloWorld.java:4: error: package Sstem does not exist
        Sstem.out.println("Hello, World");
                ^
    1 error
    error: compilation failed


 *  e
    
    HelloWorld.java:4: error: cannot find symbol
        System.out.pintln("Hello, World");
                    ^
    symbol:   method pintln(String)
    location: variable out of type PrintStream
    1 error
    error: compilation failed

 */