public class Person{
    private String first_name;
    private String last_name;
    private String id; //ID is unique for each person


    //constructor
    public Person(String first_name, String last_name, String id){
        this.first_name = first_name;
        this.last_name = last_name; 
        this.id = id;
    }

    //Accessor
    public String getFirstName(){
        return first_name;
    }
    public String getLastName(){
        return last_name;
    }
    public String getId(){
        return id; 
    }

    //toString() method
    @Override
    public String toString() {
        return "Person [first_name=" + first_name + ", last_name=" + last_name + ", id=" + id + "]";
    }
}