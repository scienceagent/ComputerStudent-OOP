public class Registry {
    public static void main(String[] args) {

        Person steve = new Person();
        steve.displayinfo();

        Person tom = new Person("Tom");
        tom.displayinfo();

        Person john = new Person("John",18);
        john.displayinfo();

    }
}

/*class Person {
        String name;
        int age;

        Person(){
        name = "Steve";
        age = 16;
        }
        

        Person(String n){
        name = n;
        age = 17;
        }


        Person(String n, int a){
        name = n;
        age = a;
        }
    void displayinfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }*/



    class Person {
        String name;
        int age;

        Person(){
        this("Steve",16);
        }
        

        Person(String n){
        this(n,17);
        }


        Person(String n, int a){
        this.name = n;
        this.age = a;
        }
    void displayinfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }

}
