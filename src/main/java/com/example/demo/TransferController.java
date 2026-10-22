package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transfers")
public class TransferController {

    private final TransferService transferService;
    private final AiExplanationService aiExplanationService;

    public TransferController(
            TransferService transferService,
            AiExplanationService aiExplanationService) {

        this.transferService = transferService;
        this.aiExplanationService = aiExplanationService;
    }

    @PostMapping("/validate")
    public TransferResponse validateTransfer(@RequestBody TransferRequest request) {
        return transferService.validateTransfer(request);
    }

    @PostMapping("/explain")
    public String explainTransfer(@RequestBody TransferRequest request) {

        TransferResponse response =
                transferService.validateTransfer(request);

        return aiExplanationService.explain(response);
    }
}