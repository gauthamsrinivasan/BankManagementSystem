package com.BankManagement.Backend.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.BankManagement.Backend.entity.Beneficiary;
import com.BankManagement.Backend.service.BeneficiaryService;

import java.util.List;

@RestController
@RequestMapping("/api/beneficiaries")
@RequiredArgsConstructor
public class BeneficiaryController {

    private final BeneficiaryService beneficiaryService;

    @PostMapping
    public ResponseEntity<Beneficiary> addBeneficiary(@RequestBody Beneficiary beneficiary) {
        return ResponseEntity.ok(beneficiaryService.addBeneficiary(beneficiary));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Beneficiary>> getUserBeneficiaries(@PathVariable Long userId) {
        return ResponseEntity.ok(beneficiaryService.getBeneficiariesByUserId(userId));
    }
}
