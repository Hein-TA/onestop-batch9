package com.jdc.balance.model.service;

import com.jdc.balance.api.input.BalanceReportInfo;
import com.jdc.balance.api.input.BalanceReportSearch;
import com.jdc.balance.api.output.PageInfo;
import org.springframework.stereotype.Service;

@Service
public class BalanceReportService {
    public PageInfo<BalanceReportInfo> search(BalanceReportSearch search, int page, int size) {
        return null;
    }
}
