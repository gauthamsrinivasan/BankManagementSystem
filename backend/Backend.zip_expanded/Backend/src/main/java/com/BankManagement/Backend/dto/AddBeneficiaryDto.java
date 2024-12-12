package com.BankManagement.Backend.dto;

import lombok.Data;

@Data
public class AddBeneficiaryDto {
    private Long userId;             // ID of the user adding the beneficiary
    private Long beneficiaryAccountId; // Account ID of the beneficiary
    private String nickname;         // Nickname for the beneficiary
}
