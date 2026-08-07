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

        // .equals() compares string content
        System.out.println(m1.equals(m2));
    }
}



// declaring a String variable without initializing

public class Main {
    public static void main(String[] args) {
        
        String message;
        System.out.println(message);
    }
}



// initializing the string with a value

public class Main {
    public static void main(String[] args) {
        
        message = "Gupta";
        System.out.println(message);
    }
}



// declaring and initializing in one step 

public class Main {
    public static void main(String[] args) {
        
        String message1 = "Kumar";
        System.out.println(message1);
    }
}



// concatenation

public class Main {
    public static void main(String[] args) {
        
        String str1 = "Manoj";
        String str2 = "Kumar";
        String result = str1 + " " + str2;
        System.out.println(result);
    }
}
