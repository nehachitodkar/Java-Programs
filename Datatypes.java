public class Datatypes {
	public static void main(String[] args) {

		byte myByte = -128;         	// [1 byte]stores -128 to +127bytes
	    short myShort = 25000;      	// [2 bytes]stores -32768 to -32767 
	    int num = 100000;          		// [4 bytes]stores -2,147,483,648 to ....647
	    long myLong = 15000000000l;   	// [8 bytes] stores -9,223,372,036,854,775,808 to ...807
	    float myFloat = 5.75f;        	// [4 byte] by default all floating point num are double in java
	    double myDouble = 19.99d;     	// [8 byte]
        boolean b = true;            	// [1 bit]true or false
        boolean bl = false;
        char c = 'J';                	// [2 bytes store single char or ASCII value]
        char myvar = 65; 


        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(num);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(b);
        System.out.println(bl);
        System.out.println(c);
        System.out.println(myvar);

     }
}