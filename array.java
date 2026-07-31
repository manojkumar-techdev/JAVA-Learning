// declare an array

{
   // array in java
   // stores multiple values of same data type
   // in a single variable

   // declare an array of numbers
   // method 1 - recommended one
   int[] numbers;
}


// create an array

{
   // create an array
   // clears that array will contain 5 elements
   int[] numbers = new int[5];
}


// adding elements to array

{
   // adding elements to array
   int[] numbers = new int[5];

   numbers[0] = 10;
   numbers[1] = 20;
   numbers[2] = 30;
   numbers[3] = 40;
   numbers[4] = 50;


   System.out.println(numbers[0]);
   System.out.println(numbers[1]);
}



// cannot print array directly

{
   // cannot print array elements using println directly
   // [ → Array
   // I → int type
   // @5acf9800 → Hash code in hexadecimal


   int[] numbers = new int[5];

   numbers[0] = 10;
   numbers[1] = 20;
   numbers[2] = 30;
   numbers[3] = 40;
   numbers[4] = 50;

   System.out.println(numbers);
}



// print array using for-loop

{
   // print array elements
   // use for loop
   // not recommended

   int[] numbers = new int[5];

   numbers[0] = 10;
   numbers[1] = 20;
   numbers[2] = 30;
   numbers[3] = 40;
   numbers[4] = 50;

   for(int i = 0; i <=numbers.length; i++) {
       System.out.println(numbers[i]);
   }
}


// create and initialize array at same time

{
   // create and initialize array at same time
   int[] numbers = {10, 20, 30, 40, 50};
}

