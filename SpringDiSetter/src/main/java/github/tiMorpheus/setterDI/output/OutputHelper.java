package github.tiMorpheus.setterDI.output;

public class OutputHelper {

    IOutputGenerator outputGenerator;

    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }

    public void generateOutput(){
        outputGenerator.generateOutput();
    }
}
