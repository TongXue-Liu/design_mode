package cc.igaa.demo4;


import cc.igaa.demo4.service.IBankProcessService;
import cc.igaa.demo4.service.IBankUserService;
import cc.igaa.demo4.service.impl.DepositServiceImpl;
import cc.igaa.demo4.service.impl.DrawMoneyServiceImpl;
import cc.igaa.demo4.service.impl.TransferServiceImpl;

//银行柜员
public class BankStuff {

    private IBankProcessService iBankProcessService;

    //银行系统
    //public void handleProcess(BankUser bankUser) {
    //    switch (bankUser.getType()) {
    //        case "存款":
    //           this.iBankProcessService = new DepositServiceImpl();
    //           this.iBankProcessService.BankProcess();
    //            break;
    //        case "取款":
    //            this.iBankProcessService = new DrawMoneyServiceImpl();
    //            this.iBankProcessService.BankProcess();
    //            break;
    //        case "转账":
    //            this.iBankProcessService = new TransferServiceImpl();
    //            this.iBankProcessService.BankProcess();
    //            break;
    //        default:
    //            System.out.println("不支持该操作");
    //            break;
    //    }
    //}

    //不同需求的用户办理不同的业务。
    public void handleProcess(IBankUserService iBankUserService){
        this.iBankProcessService = iBankUserService.bankProcess();
        this.iBankProcessService.BankProcess();
    }
    
    
}
