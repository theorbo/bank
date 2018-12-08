package springBoot.bank.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springBoot.bank.client.Bank_branches;
import springBoot.bank.repository.BankBranchRepository;

@RestController
public class BankOperations {

	@Autowired
	BankBranchRepository bankBranchRepository;

	@RequestMapping(value = "/getBranchDetail", produces = "application/json")
	public ResponseEntity<?> getBranchDetail(@RequestParam(value = "ifsc") String ifsc) {

		if (StringUtils.isEmpty(ifsc)) {
			return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
		} else {
			Bank_branches response = bankBranchRepository.findByIfsc(ifsc);
			if (response == null) {
				return new ResponseEntity("IFSC does not exist", HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity(response, HttpStatus.OK);
			}
			// System.out.println("********************" + response.toString());

		}
	}

	@RequestMapping(value = "/getBranches", produces = "application/json")
	public ResponseEntity<?> getBranches(@RequestParam(value = "name") String name,
			@RequestParam(value = "city") String city) {
		if (StringUtils.isEmpty(city) || StringUtils.isEmpty(name)) {
			return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
		} else {
			List<Bank_branches> bankBranchList = bankBranchRepository.findByNameAndCity(name.toUpperCase(), city.toUpperCase());
			if(bankBranchList == null || bankBranchList.isEmpty()) {
				return new ResponseEntity("No branches exist for" + city + " and " + name, HttpStatus.NO_CONTENT);
			}else {
				return new ResponseEntity(bankBranchList, HttpStatus.OK);
			}
		}

		/*
		 * BankBranch bb= new
		 * BankBranch("1234",1000l,"patamda","rangatard","jamshedpur",
		 * " east singhbhum", " jharkhand"); BankBranch bb1= new
		 * BankBranch("1234",1000l,"patamda","rangatard","jamshedpur",
		 * " east singhbhum", " jharkhand");
		 * 
		 * List<BankBranch> bb2 = new ArrayList<BankBranch>(); bb2.add(bb);
		 * bb2.add(bb1);
		 */

		// Optional<BankBranch> b = bankService.findById(ifsc);

		// return new ResponseEntity(b,HttpStatus.OK);
	}

}
