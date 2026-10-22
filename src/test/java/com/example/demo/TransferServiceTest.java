package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransferServiceTest {

    private final TransferService transferService = new TransferService();

    @Test
    void shouldApproveValidTransfer() {
        TransferRequest request = new TransferRequest();

        request.setSourceAccountId("10001");
        request.setDestinationAccountId("20002");
        request.setAmount(500);
        request.setCurrency("USD");
        request.setAvailableBalance(1000);

        TransferResponse response = transferService.validateTransfer(request);

        assertTrue(response.isApproved());
        assertEquals(TransferDecision.APPROVED, response.getDecision());
    }

    @Test
    void shouldRejectInvalidAmount() {
        TransferRequest request = new TransferRequest();

        request.setSourceAccountId("10001");
        request.setDestinationAccountId("20002");
        request.setAmount(-100);
        request.setCurrency("USD");
        request.setAvailableBalance(1000);

        TransferResponse response = transferService.validateTransfer(request);

        assertFalse(response.isApproved());
        assertEquals(TransferDecision.INVALID_AMOUNT, response.getDecision());
    }

    @Test
    void shouldRejectSameAccountTransfer() {
        TransferRequest request = new TransferRequest();

        request.setSourceAccountId("10001");
        request.setDestinationAccountId("10001");
        request.setAmount(500);
        request.setCurrency("USD");
        request.setAvailableBalance(1000);

        TransferResponse response = transferService.validateTransfer(request);

        assertFalse(response.isApproved());
        assertEquals(TransferDecision.SAME_ACCOUNT, response.getDecision());
    }

    @Test
    void shouldRejectInsufficientFunds() {
        TransferRequest request = new TransferRequest();

        request.setSourceAccountId("10001");
        request.setDestinationAccountId("20002");
        request.setAmount(1500);
        request.setCurrency("USD");
        request.setAvailableBalance(1000);

        TransferResponse response = transferService.validateTransfer(request);

        assertFalse(response.isApproved());
        assertEquals(TransferDecision.INSUFFICIENT_FUNDS, response.getDecision());
    }
}