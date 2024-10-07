package gud.fun.junkdrawer.util.generator;

import org.springframework.beans.factory.annotation.Autowired;

public class StreetGenerator implements JunkDataGenerator<String>{

    @Autowired
    private NameGenerator nameGenerator;

    @Override
    public String generate() {
        return nameGenerator.generate() + " str.";
    }

    public void setNameGenerator(NameGenerator nameGenerator) {
        this.nameGenerator = nameGenerator;
    }
}
