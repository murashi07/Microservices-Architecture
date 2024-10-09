package com.microservices.companymicroservice.company.services;

import com.microservices.companymicroservice.company.model.Company;
import com.microservices.companymicroservice.company.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService{
    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public void createCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public boolean updateCompany(Company company, Long id) {
        Optional<Company> companyOptional= companyRepository.findById(id);
        if (companyOptional.isPresent()){
            Company companyUpdate = companyOptional.get();
            companyUpdate.setName(company.getName());
            companyUpdate.setDescription(company.getDescription());
//            companyUpdate.setJobs(company.getJobs());

            companyRepository.save(companyUpdate);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deleteCompanyById(Long id) {
        if(companyRepository.existsById(id)) {
            companyRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }


}
