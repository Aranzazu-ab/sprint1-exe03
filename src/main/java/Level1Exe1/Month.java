package Level1Exe1;

import java.util.Objects;

public class Month {
    private final String name;

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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return Objects.equals(name, month.name);
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

}
