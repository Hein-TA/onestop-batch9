import { Routes } from '@angular/router';
import { MembersComponent } from './pages/members/members.component';
import { AnonymousComponent } from './pages/anonymous/anonymous.component';
import { SigninComponent } from './pages/anonymous/signin/signin.component';
import { SignupComponent } from './pages/anonymous/signup/signup.component';
import { AdminComponent } from './pages/admin/admin.component';

export const routes: Routes = [
    {
        path: 'anonymous',
        component: AnonymousComponent,
        children: [
            {
                path: 'signin',
                title: 'Sign In',
                component: SigninComponent
            },
            {
                path: 'signup',
                title: 'Sign Up',
                component: SignupComponent
            },
            {
                path: '',
                redirectTo: '/anonymous/signin',
                pathMatch: 'full'
            }
        ]
    },
    {
        path: 'members',
        component: MembersComponent,
        loadChildren: () => import('./pages/members/members.routes').then(m => m.routes)
    },
    {
        path: '',
        redirectTo: '/anonymous',
        pathMatch: 'full'
    },
    {
        path: 'admin',
        component: AdminComponent
    }
];
