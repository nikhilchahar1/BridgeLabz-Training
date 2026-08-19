enum Season{
    SUMMER("Hot weather"),
    WINTER("Cold weather"),
    SPRING("Flowers start blooming"),
    AUTUMN("Leaves start falling");

    public String description;

    Season(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class Enums{
    public static void main(String[] args){
        for(Season s : Season.values()){
            System.out.println(s+" "+s.getDescription());
        }
    }
}