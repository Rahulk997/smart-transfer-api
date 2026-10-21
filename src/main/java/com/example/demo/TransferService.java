package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class TransferService {

    public TransferResponse validateTransfer(TransferRequest request) {

        if (request.getAmount() <= 0) {
            return new TransferResponse(
                    false,
                    TransferDecision.INVALID_AMOUNT,
                    "Transfer amount must be greater than zero"
            );
        }

        if (request.getSourceAccountId()
                .equals(request.getDestinationAccountId())) {

            return new TransferResponse(
                    false,
                    TransferDecision.SAME_ACCOUNT,
                    "Source and destination accounts must be different"
            );
        }

        if (request.getAmount() > request.getAvailableBalance()) {
            return new TransferResponse(
                    false,
                    TransferDecision.INSUFFICIENT_FUNDS,
                    "Available balance is insufficient"
            );
        }

        return new TransferResponse(
                true,
                TransferDecision.APPROVED,
                "Transfer is valid"
        );
    }
}