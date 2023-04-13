package Constructor;

public class Example {
    public static class Person{
        private String name;
        private int age;

        public Person(){
            name = null;
            age = -1;
        }

        public Person(String name, int age){
            this.name = name;

            if(age < 0 || age > 110){
                System.out.println("Invalid age provided");
            }else{
                this.age = age;
            }
        }

        public void introduction(){
            if(name == null)
                System.out.println("Name is not set.");
            else
                System.out.println("My name is " + name + ".");
        }
    }

    public static class Main{
        public static void main(String[] args){
            Person person1 = new Person();
            Person person2 = new Person("Jon Doe", 20);

            person1.introduction();
            person2.introduction();
        }
    }
}
