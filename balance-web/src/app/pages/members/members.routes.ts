import { Routes } from "@angular/router";
import { HomeComponent } from "./home/home.component";
import { BalanceReportComponent } from "./balance-report/balance-report.component";
import { BalanceManagementComponent } from "./balance-management/balance-management.component";
import { LedgerManagementComponent } from "./ledger-management/ledger-management.component";
import { ChangePasswordComponent } from "./change-password/change-password.component";

export const routes: Routes = [
    {
        path: 'home',
        title: 'Home',
        component: HomeComponent
    },
    {
        path: 'report',
        title: 'Report',
        component: BalanceReportComponent
    },
    {
        path: 'management/:type',
        title: 'Management',
        component: BalanceManagementComponent
    },
    {
        path: 'ledger',
        title: 'Ledger',
        component: LedgerManagementComponent
    },
    {
        path: 'password',
        title: 'Password',
        component: ChangePasswordComponent
    },
    {
        path: '',
        redirectTo: '/members/home',
        pathMatch: 'full'
    }
]