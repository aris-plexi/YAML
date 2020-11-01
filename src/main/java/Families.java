import java.util.List;

public class Families {
    private List<Relationship> families;

    public Families(List<Relationship> families) {
        this.families = families;
    }

    public Families() {
    }

    public List<Relationship> getFamilies() {
        return families;
    }

    public void setFamilies(List<Relationship> families) {
        this.families = families;
    }
}
