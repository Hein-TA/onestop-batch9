package com.jdc.balance.api;

import com.jdc.balance.api.input.LedgerEditForm;
import com.jdc.balance.api.input.LedgerSearch;
import com.jdc.balance.api.input.LedgerUpdateForm;
import com.jdc.balance.api.output.DataModificationResult;
import com.jdc.balance.api.output.LedgerInfo;
import com.jdc.balance.api.output.LedgerListItem;
import com.jdc.balance.api.output.PageInfo;
import com.jdc.balance.model.service.LedgerService;
import com.jdc.balance.model.service.listener.LedgerChangesEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ledger")
@RequiredArgsConstructor
public class LedgerManagementApi {

    private final LedgerService service;
    private final ApplicationEventPublisher eventPublisher;

    @GetMapping
    PageInfo<LedgerListItem> search(LedgerSearch search,
                                    @RequestParam(required = false, defaultValue = "0") int page,
                                    @RequestParam(required = false, defaultValue = "10") int size) {
        return service.search(search, page, size);
    }

    @GetMapping("{code}")
    LedgerInfo findById(@PathVariable("code") String code) {
        return service.findById(code);
    }

    @PostMapping
    DataModificationResult<String> create(
            @Validated @RequestBody LedgerEditForm form,
            BindingResult bindingResult) {
        var modificationResult = service.create(form);
        eventPublisher.publishEvent(new LedgerChangesEvent(modificationResult.id()));
        return modificationResult;
    }

    @PutMapping("{code}")
    DataModificationResult<String> update(
            @PathVariable("code") String code,
            @Validated @RequestBody LedgerUpdateForm form,
            BindingResult bindingResult) {
        var modificationResult = service.update(code, form);
        eventPublisher.publishEvent(new LedgerChangesEvent(modificationResult.id()));
        return modificationResult;
    }

}
