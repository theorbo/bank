package springBoot.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import springBoot.bank.client.Bank_branches;

public interface BankBranchRepository extends JpaRepository<Bank_branches, Long> {

	Bank_branches findByIfsc(String ifsc);
	List<Bank_branches> findByNameAndCity(String name, String city);

}
