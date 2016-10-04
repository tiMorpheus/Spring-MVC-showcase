package github.tiMorpheus.setterDI.output.Impl;

import github.tiMorpheus.setterDI.output.IOutputGenerator;

public class CsvOutputGenerator implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("this is cvs generator");
    }
}
