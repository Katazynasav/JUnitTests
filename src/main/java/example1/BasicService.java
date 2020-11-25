package example1;

public class BasicService {
    public String basicMethod(){
        return "BasicString";
    }

    public String notBasicMethod(String name,String surname){
        if(name ==null){
            name = "";
        }
        if (surname == null){
            surname = "";
        }

        return name.concat(surname);
    }

}
