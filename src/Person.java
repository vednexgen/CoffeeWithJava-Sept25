public class Person {
    
    String name;
    int age;
    long mobile;

    /**
     * This is deafult constructor
     */
    public Person() {
    }

    /**
     * Parameterized Constructor
     * @param name
     * @param age
     * @param mobile
     */
    public Person(String nameTemp, int ageTemp, long mobileTemp) {
       this.name = nameTemp;
       this.age = ageTemp;
       this.mobile = mobileTemp;
    }

    /**
     * Parameterized Constructor
     * @param name
     */
//    public Person(String name) {
//        this.name = name;
//    }

    public void isWalk() {
        String temp = this.name;
        System.out.println(name + " is walking!!");
    }

}
