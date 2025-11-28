package cc.igaa.demo4.service;

public interface IBankUserService {
    //不同需求的用户办理不同的业务。
    IBankProcessService bankProcess();
}
