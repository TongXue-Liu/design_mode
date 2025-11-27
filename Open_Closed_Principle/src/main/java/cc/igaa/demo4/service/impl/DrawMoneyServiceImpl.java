package cc.igaa.demo4.service.impl;

import cc.igaa.demo4.service.IBankProcessService;

public class DrawMoneyServiceImpl implements IBankProcessService {
    @Override
    public void BankProcess() {
        System.out.println("取款");
    }
}
