package com.BriteErp.Utilities;

import com.BriteErp.pages.*;

public class Pages {
    private LoginPage loginPage;
    private CRMmodule crmModule;
    private CustomersPage customersPage;
    private MobilePreviewPage mobilePreviewPage;
    private SalesChannelPage salesChannelPage;
    private CustomerPipePage customerPipe;
    private ManagersPage managersPage;
    // private PipelineH pipelineH;

    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public SalesChannelPage salesPage() {
        if (salesChannelPage == null) {
            salesChannelPage = new SalesChannelPage();
        }
        return salesChannelPage;
    }

    public CRMmodule crm() {
        if (crmModule == null) {
            crmModule = new CRMmodule();
        }
        return crmModule;
    }

    public CustomersPage customer() {
        if (customersPage == null) {
            customersPage = new CustomersPage();
        }
        return customersPage;
    }

    public MobilePreviewPage mobilePreviewPage() {
        if (mobilePreviewPage == null) {
            mobilePreviewPage = new MobilePreviewPage();
        }
        return mobilePreviewPage;
    }

    public CustomerPipePage customerPipe() {
        if (customerPipe == null) {
            customerPipe = new CustomerPipePage();
        }
        return customerPipe;
    }

    public ManagersPage manager() {
        if (managersPage == null) {
            managersPage = new ManagersPage();
        }
        return managersPage;
    }
}
