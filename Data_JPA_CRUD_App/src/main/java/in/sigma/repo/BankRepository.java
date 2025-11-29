package in.sigma.repo;

import in.sigma.entity.Bank;
import in.sigma.entity.BankPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank, BankPk> {

}
