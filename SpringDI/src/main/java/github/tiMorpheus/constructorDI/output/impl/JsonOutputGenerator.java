package github.tiMorpheus.constructorDI.output.impl;

import github.tiMorpheus.constructorDI.output.IOutputGenerator;

public class JsonOutputGenerator implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("this is json generator");
    }
}
