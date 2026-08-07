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
