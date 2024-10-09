package com.jdc.balance.api;

import com.jdc.balance.api.input.LedgerEntryForm;
import com.jdc.balance.api.input.LedgerEntrySearch;
import com.jdc.balance.api.output.DataModificationResult;
import com.jdc.balance.api.output.LedgerEntryDetails;
import com.jdc.balance.api.output.PageInfo;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("entry/{type}")
public class LedgerEntryManagementApi {

    @GetMapping
    PageInfo<?> search(LedgerEntrySearch search,
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "10") int size) {
        return null;
    }

    @GetMapping("{trxId}")
    LedgerEntryDetails findById(@PathVariable("trxId") String trxId) {
        return null;
    }

    @PostMapping
    DataModificationResult<String> create(
            @Validated @RequestBody LedgerEntryForm form,
            BindingResult bindingResult) {
        return null;
    }
}
