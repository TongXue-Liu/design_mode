package cc.igaa.demo4.service.impl;

import cc.igaa.demo4.service.IBankProcessService;
import cc.igaa.demo4.service.IBankUserService;

public class UserDepositServiceImpl implements IBankUserService {
    
    @Override
    public IBankProcessService bankProcess() {
        return new DepositServiceImpl();
    }
}
