// string literals are characters stored in double quotes

public class Main {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(str);
    }
}



// empty string literal

public class Main {
    public static void main(String[] args) {
        
        String emptyString = "";
        System.out.println(emptyString);
    }
}



// s1 and s2 refer to the same "Manoj" object in String pool

public class Main {
    public static void main(String[] args) {
        
        String s1 = "Manoj";
        String s2 = "Manoj";
        System.out.println(s1 == s2);

    }
}



// string pool

public class Main {
    public static void main(String[] args) {
        
        // string pool -- string literal uses String Pool
        String m1 = "Manoj";

        // new String() -- creates a new object in heap memory
        String m2 = new String("Manoj");

        // == compare object reference
        System.out.println(m1 == m2);
    }
}
