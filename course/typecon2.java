package course;

class typecon {

    public static void main(String args[]){
    // if we assign the value of a=b such that byte b=127; int a=12; then a=b; this is known as implicit type conversion as Java automatically converts smaller types to larger types.
    /// b=(byte)a this means ke a ke value ko cast karke b me store kar rhe hai this is know as type casting is also known as explicit conversion
    byte value=127;
    int a=value; //implicit type
int find=1290;
    
    System.out.println(a);
System.out.println(value);
byte v1=(byte)find;
//Type promotion in Java means automatically converting a smaller data type into a bigger data type during expressions (like arithmetic operations), so that Java can safely perform the calculation without data loss.
    }
}
