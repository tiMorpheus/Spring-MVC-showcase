package github.tiMorpheus.dataexam.service;

import github.tiMorpheus.dataexam.entity.Bank;

import java.util.List;


public interface BankService {


    Bank add(Bank entity);
    void delete(long id);
    Bank getByName(String name);
    Bank edit(Bank entity);
    List<Bank> getAll();

}
