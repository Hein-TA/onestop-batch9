package com.jdc.balance.api;

import com.jdc.balance.api.input.LedgerEntryForm;
import com.jdc.balance.api.input.LedgerEntrySearch;
import com.jdc.balance.api.output.DataModificationResult;
import com.jdc.balance.api.output.LedgerEntryDetails;
import com.jdc.balance.api.output.LedgerEntryInfo;
import com.jdc.balance.api.output.PageInfo;
import com.jdc.balance.model.entity.LedgerEntryPk;
import com.jdc.balance.model.service.LedgerEntryService;
import com.jdc.balance.model.service.listener.EntryChangeEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("entry/{type}")
@RequiredArgsConstructor
public class LedgerEntryManagementApi {

    private final LedgerEntryService service;
    private final ApplicationEventPublisher eventPublisher;

    @GetMapping
    PageInfo<LedgerEntryInfo> search(LedgerEntrySearch search,
                                     @RequestParam(required = false, defaultValue = "0") int page,
                                     @RequestParam(required = false, defaultValue = "10") int size) {
        return service.search(search, page, size);
    }

    @GetMapping("{trxId}")
    LedgerEntryDetails findById(@PathVariable("trxId") String trxId) {
        return service.findById(trxId);
    }

    @PostMapping
    DataModificationResult<String> create(
            @Validated @RequestBody LedgerEntryForm form,
            BindingResult bindingResult) {
        var entry = service.create(form);
        eventPublisher.publishEvent(new EntryChangeEvent(entry.id()));
        return entry.map(LedgerEntryPk::getCode);
    }
}
