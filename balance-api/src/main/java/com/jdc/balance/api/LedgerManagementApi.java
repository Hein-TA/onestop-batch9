package com.jdc.balance.api;

import com.jdc.balance.api.input.LedgerEditForm;
import com.jdc.balance.api.input.LedgerSearch;
import com.jdc.balance.api.output.DataModificationResult;
import com.jdc.balance.api.output.LedgerInfo;
import com.jdc.balance.api.output.LedgerListItem;
import com.jdc.balance.api.output.PageInfo;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ledger")
public class LedgerManagementApi {

    @GetMapping
    PageInfo<LedgerListItem> search(LedgerSearch search,
                                    @RequestParam(required = false, defaultValue = "0") int page,
                                    @RequestParam(required = false, defaultValue = "10") int size) {
        return null;
    }

    @GetMapping("{code}")
    LedgerInfo findById(@PathVariable("code") String code) {
        return null;
    }

    @PostMapping
    DataModificationResult<String> create(
            @Validated @RequestBody LedgerEditForm form,
            BindingResult bindingResult) {
        return null;
    }

    @PutMapping("{code}")
    DataModificationResult<String> update(
            @PathVariable("code") String code,
            @Validated @RequestBody LedgerEditForm form,
            BindingResult bindingResult) {
        return null;
    }

}
