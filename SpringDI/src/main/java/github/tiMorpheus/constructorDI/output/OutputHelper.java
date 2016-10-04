package github.tiMorpheus.constructorDI.output;

public class OutputHelper {
    IOutputGenerator outputGenerator;

    public OutputHelper(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }

    public void generateOutput(){
        outputGenerator.generateOutput();
    }

}
