package Level1Exe1;

public class Month {
    private String name;

    public Month (String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return name.equals((month.name));
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

}
