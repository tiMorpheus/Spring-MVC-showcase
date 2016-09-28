package github.tiMorpheus.dataexam.service.impl;

import github.tiMorpheus.dataexam.entity.Bank;
import github.tiMorpheus.dataexam.repository.BankRepository;
import github.tiMorpheus.dataexam.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankRepository bankRepository;

    @Override
    public Bank add(Bank bank) {
        Bank savedBank = bankRepository.saveAndFlush(bank);

        return savedBank;
    }

    @Override
    public void delete(long id) {
        bankRepository.delete(id);

    }

    @Override
    public Bank getByName(String name) {
        return bankRepository.findByName(name);
    }

    @Override
    public Bank edit(Bank bank) {
        return bankRepository.saveAndFlush(bank);
    }

    @Override
    public List<Bank> getAll() {
        return bankRepository.findAll();
    }
}
