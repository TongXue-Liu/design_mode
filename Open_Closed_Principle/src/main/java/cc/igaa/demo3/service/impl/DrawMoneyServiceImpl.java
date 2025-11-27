package cc.igaa.demo3.service.impl;

import cc.igaa.demo3.service.IBankProcessService;

public class DrawMoneyServiceImpl implements IBankProcessService {
    @Override
    public void BankProcess() {
        System.out.println("取款");
    }
}
