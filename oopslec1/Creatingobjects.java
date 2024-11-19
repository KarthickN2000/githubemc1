package oopslec1;

public class Creatingobjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        //System.out.println(student1.rno);


        // assigning the values for the kunal object kunal is the reference variable
        /*kunal.rno = 100;
        kunal.name = "kart";
        kunal.marks = 89.9f;*/
        Student kunal =  new Student();
        //for the below line we aldready inser the name to kunal reference variable
        //kunal.greeting();
        /*System.out.println(kunal.name);
        System.out.println(kunal.rno);
        System.out.println(kunal.marks);*/


        // change in one object might reflect to the other object also that is actually a object oriented
        //programming
        Student random = new Student(kunal);
        Student one = new Student();
        Student two = one;
        one.name = "UshaN";

        System.out.println(two.name);
        /*System.out.println(random.name);
        System.out.println(random.rno);
        System.out.println(random.marks);*/

        //wrapper class example int is not a wrapper class
        Integer num = 45;
        System.out.println(num);

        final int  a = 35;

        System.out.println(a);
    }


}
class Student{
        // creating the class and its properties
        int rno = 105;
        String  name = "Karthick";
        float marks = 90.0005f;

        // constructor for the student
        //we need a way to add the values for the above
        //properties object by object

        // we need one word to represent every object that is a this keyword
        //the below is the constructor with no arguments inside in it. And it is not a default constructor

        //creating the function inside the class
        void greeting(){
            System.out.println("Hello my name is "+ this.name);
        }
        //when you call the constructor with no argument value the below one will work actually
        /*Student(){
                this.rno = 13;
                this.name = "kunal kushwaha";
                this.marks = 85.8f;
        }*/
        //constructor with aruguments
        //when you call the constructor with three arugument value the below one will work
        Student(int rno,String name,float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
        //the below constructor will takes value from the another object then
        Student(Student kart){
            this.rno =  kart.rno;
            this.name = kart.name;
            this.marks = kart.marks;
        }

        //when we construct a constructor with zero arguemnet values but we want to call another constructor at that time
    //the the below one will works
    Student(){
            //here we calling the constructor with three arguements and the this refers to the Student in this case
            //not reference variable
            this(13,"karthick",100);
    }
}
class a{
    final int a = 10;
    String name;
    String lovername;
    String loveraddress;

    public a(String name) {
        this.name = name;
    }

}
