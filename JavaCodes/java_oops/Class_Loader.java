public class Class_Loader {

  int age;
  String name ;
  public static void main(String[] args) {
    Class_Loader c = new Class_Loader();
    c.age=24;
    c.name = "Mrinal";
    System.out.println(c.age);
    System.out.println(c.name);
  }
  
}
// class loading is process to load .class file from hard disk to JVM Memory.
