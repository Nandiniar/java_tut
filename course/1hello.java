
// to run the file , first we have to compile it
// java is platform independent because of jvm(java virtual machine)
// jvm exceute the java code but jvm will not accept the code directly
// java is platform independent means ke java program can be run in any machine but our system should have jvm
// jvm me bhejne se phale hume byte code me convert karna padhta hai because jvm only understand the byte code
// in all the file the ecxution will start from main

// compiler java ke code ko byre code me convert karwata hai and then jvm looks for main part then only it will accept
// when we compile the code then another class will be created 

// java ke code ko run krne ke liye phale javac filename.java then ek file banegee filename.class karke then java filename.java likhnaa
//jre  java runtime environment  jre =jvm+library
// in our jrk JAVA RUNTIME KIT WE HAVE JRE AND INSIDE JRE WE HAVE LIBRARY
// JAVA IS WORA (WRITE ONCE READ ANYWHERE ) BUT MACHINE SHOULD HAVE JRE AND JVM
//JAVA IS STRONGLY TYPED LANGUAGE
class Hello{
public static void main(String a[])
{
    int ar=5;
    System.out.println(ar);

    System.out.println("Hello world");
    System.out.println(2+4);
    System.out.println(1000/24);
    float marks=8.9f;
    System.out.println(marks);
    char find='c';
    System.out.println(find);
    boolean b=false;
    System.out.println(b);
    short sh=778;
    long d=123l; // long me like number ke baad l lagana chaiye
    System.out.println(d);
    float f=6.6f;
    double dd=8.9;
    char jj='9'; //literaals are actual value you assign to the variables like here '9' is a literal
    System.out.println(jj);
int num1=0b101;
System.out.println(num1);  // we can binary value as a literal in num1
// we can alos  have hexa value as a literal in variable
    
    // println ka means ke cursor dusre line me dalna
    int n1=1_00_00_00_00;// in java if we want to store some bigger number then we can also use _ between the numbers
    System.out.println(n1); 
    double num12=12;// hum aise integer me double kar sakte hai output me wo double ke form me he ayaega
System.out.println(num12);
double num3=12e10; // this means  12 *(10^10)
System.out.println(num3);


    //data type - primitve ,
    //1 primitive - integer -byte,short,int ,long (size of int is 4 byte)  byte=1bit range of byte is (-2^7 to 2^7-1 or -128 to 127)
    // float - 4byte and double - 8 byte - defaut type is double double has more precision than float float is faster and uses less memory, but less precise.

//double is slower and uses more memory, but more accurate.


    //             -float-double,float
    //             - character-has 2 bytes(java support unicode means 2 bytes)
    // char c='k' for character single quote for string double quote
    ///             -boolean ( it is only true or false it doesnot support 0 or 1 in java)
    /// // bool b=true;
}
}