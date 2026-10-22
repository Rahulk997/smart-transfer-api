package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class AiExplanationService {

    public String explain(TransferResponse response) {

        return switch (response.getDecision()) {
            case APPROVED ->
                    "The transfer can proceed because all validation checks passed.";

            case INVALID_AMOUNT ->
                    "The transfer cannot proceed because the amount must be greater than zero.";

            case SAME_ACCOUNT ->
                    "The transfer cannot proceed because the source and destination accounts are the same.";

            case INSUFFICIENT_FUNDS ->
                    "The transfer cannot proceed because the available balance is not enough.";
        };
    }
}