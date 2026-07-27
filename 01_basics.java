
//# -- 1
// hello world

public class Learning {
   public static void main(String[] args) {
       System.out.println("Hello World");
   }
}



//# -- 2
// statement in java
// statement ends with semicolon
// statement is a line of code with complete meaning
// a statement ends with semicolon

public class Learning {
   public static void main(String[] args) {
       // this is the statement
       System.out.println("Hello, Manoj");
   }
}


//# -- 3
// single code block
// code enclosed in curly braces is a code in block

public class Learning {
   public static void main(String[] args)
   {
       // this is a code block
       System.out.println("Hello, Manoj");
   }
}


//# -- 4
// single statement

public class Learning {
   public static void main(String[] args)
   {
       // this is a code block
       System.out.println("Hello, Manoj");
   }
}


// # -- 5
// multiple statements

public class Learning {
   public static void main(String[] args)
   {
       // this is a code block
       System.out.println("Hello, Manoj");
       System.out.println("How are you?");
   }
}



// # -- 6
// multiple code blocks

public class Learning {
   public static void main(String[] args) {
  
       {   // First block
           int x = 10;
           System.out.println("First block: " + x);
       }

       {   // Second block
           int y = 20;
           System.out.println("Second block: " + y);
       }

       System.out.println("Outside both blocks");
   }
}


// # -- 7
// class definitions always has to be capital
// Learning is class Name with capital "L"

public class Learning {
   public static void main(String[] args) {
       System.out.println("Outside both blocks");
   }
}


// # -- 8
// class methods can start with capital or small letter
// usual convention is lowercase or camelCase

public class Learning {
   public static void main(String[] args)
   {
       System.out.println("Outside both blocks");
       greet();
       greetYou();
   }

   // method with lowercase naming
   public static void greet(){
       System.out.println("Hello");
   }

   // method with lowercase naming
   public static void greetYou(){
       System.out.println("Hello, my friend");
   }
}

// # -- 9
// main method always start with lowercase letter
// complete method name "main" has to be in lowercase

public class Learning {
   public static void main(String[] args){
       System.out.println("Hello");
   }
}


// # -- 10
// nesting structure

public class Learning {
   public static void main(String[] args){
       // nesting example
       {
           System.out.println("Hello");
       }
   }
}


// # -- 11
// nested blocks execution
// always executed in sequence


public class Learning {
   public static void main(String[] args){
       // block 1
       {
           System.out.println("Hello 1");
       }


       // block 2
       {
           System.out.println("Hello 2");
       }


       // block 3
       {
           System.out.println("Hello 3");
       }
   }
}


// # --12 
// java is case sensitive

public class Learning {
   public static void main(String[] args){
       // System is written as "system"
       // this will throw an error
       {
           system.out.println("Hello 1");
       }
   }
}


// # - 13
// single line comment in java

public class Learning {
   public static void main(String[] args){
       // This is a single-line comment
       {
           System.out.println("Hello 1");
       }
   }
}


// # - 14
// multi-line comment in java

public class Learning {
   public static void main(String[] args){
       /*
       This is a multi-line comment
       Comments are not executed
       Comments improve code readability
       */
       {
           System.out.println("Hello 1");
       }
   }
}


// # - 15
// Javadoc comments
// a special comment used to generate documentation

public class Learning {
   public static void main(String[] args){
      
       // describe class, method or interface
       /**
       * This is a multi-line comment
       * Comments are not executed
       * Comments improve code readability
       */
       {
           System.out.println("Hello 1");
       }
   }
}


// # - 16
// logging user authentication example

public class Learning {
   public static void main(String[] args) {
       // Start of user authentication process
       System.out.println("Starting user authentication...");


       // Check if user credentials are valid (placeholder code)
       System.out.println("Validating user credentials...");


       // If valid, grant access
       System.out.println("Access granted.");


       // End of user authentication process
       System.out.println("User authentication completed.");
   }
}


// # - 17
// print a text in java
// use double quotes

public class Learning {
   public static void main(String[] args) {
       // text printed in double quotes only
       System.out.println("Hello Text");
   }
}


// # - 18
// adding a new line

public class Learning {
   public static void main(String[] args) {
       // use println for adding a new line
       System.out.println("Hello Text");
   }
}


// # - 19
// stay on the same line

public class Learning {
   public static void main(String[] args) {
       // use "System.out.print" for adding anew line
       System.out.print("Hello Text");
   }
}

