import java.util.List;

public class Relationship {

    private List<String> parents;
    private List<String> children;

    public Relationship(List<String> parents, List<String> children) {
        this.parents = parents;
        this.children = children;
    }

    public Relationship() {
    }

    public List<String> getParents() {
        return parents;
    }

    public void setParents(List<String> parents) {
        this.parents = parents;
    }

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }


}
