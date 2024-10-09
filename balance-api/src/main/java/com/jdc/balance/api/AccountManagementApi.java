package com.jdc.balance.api;

import com.jdc.balance.api.input.AccountSearch;
import com.jdc.balance.api.output.AccountInfo;
import com.jdc.balance.api.output.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountManagementApi {

    PageInfo<AccountInfo> search(AccountSearch search,
                @RequestParam(required = false, defaultValue = "0") int page,
                @RequestParam(required = false, defaultValue = "10") int size) {
        return null;
    }

}
