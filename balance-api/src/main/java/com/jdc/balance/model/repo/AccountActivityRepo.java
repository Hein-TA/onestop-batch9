package com.jdc.balance.model.repo;

import com.jdc.balance.model.BaseRepository;
import com.jdc.balance.model.entity.AccountActivity;
import org.springframework.data.jpa.repository.Query;

public interface AccountActivityRepo extends BaseRepository<AccountActivity, String> {

    @Query("update AccountActivity a set a.lastMonthEntries = 0")
    void updateLastMonthEntries();

}