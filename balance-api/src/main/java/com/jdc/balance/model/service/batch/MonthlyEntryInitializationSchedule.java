package com.jdc.balance.model.service.batch;

import com.jdc.balance.model.repo.AccountActivityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class MonthlyEntryInitializationSchedule {

    private final AccountActivityRepo activityRepo;

    @Transactional
    @Scheduled(cron = "0 0 0 1 * *")
    public void doJob() {
        activityRepo.updateLastMonthEntries();
    }

}
