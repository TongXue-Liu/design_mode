package cc.igaa.demo3.service.impl;

import cc.igaa.demo3.service.IBankProcessService;

public class DepositServiceImpl implements IBankProcessService {
    @Override
    public void BankProcess() {
        System.out.println("存款");
    }
}
