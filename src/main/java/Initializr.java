import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Initializr {
    public static void main(String[] args) throws IOException, InterruptedException {

        List<Relationship> families = new ArrayList<Relationship>();

        List<String> parenthood = new ArrayList<>();
        parenthood.add("Homer");
        parenthood.add("Marge");

        List<String> children = new ArrayList<>();
        children.add("Bart");
        children.add("Lisa");
        children.add("Maggie");

        families.add(new Relationship(parenthood, children));


        Families family = new Families(families);
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        objectMapper.writeValue( new File("src/main/resources/families.yaml"), family);

        Cmd cmd = new Cmd();
        cmd.execute();




    }

}
