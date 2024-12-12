package com.BankManagement.Backend.service;


import com.bms.entity.Beneficiary;
import com.bms.repository.BeneficiaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BeneficiaryService {

    private final BeneficiaryRepository beneficiaryRepository;

    public Beneficiary addBeneficiary(Beneficiary beneficiary) {
        return beneficiaryRepository.save(beneficiary);
    }

    public List<Beneficiary> getBeneficiariesByUserId(Long userId) {
        return beneficiaryRepository.findByUser_UserId(userId);
    }
}
