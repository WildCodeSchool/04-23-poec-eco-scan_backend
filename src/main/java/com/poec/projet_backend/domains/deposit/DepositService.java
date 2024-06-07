package com.poec.projet_backend.domains.deposit;

import com.poec.projet_backend.domains.AbstractService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DepositService extends AbstractService<Deposit, Long> {

    public DepositService(JpaRepository<Deposit, Long> repository) {
        super(repository);
    }

    @Override
    public Deposit update(Deposit entity, Long id) {
        Deposit foundDeposit = getById(id);
        foundDeposit.setBin(entity.getBin());
        foundDeposit.setUser(entity.getUser());
        foundDeposit.setScanData(entity.getScanData());
        foundDeposit.setRubbish(entity.getRubbish());

        return repository.save(foundDeposit);
    }
}
