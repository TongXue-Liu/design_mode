package cc.igaa.demo2;


import cc.igaa.demo2.service.impl.DepositServiceImpl;
import cc.igaa.demo2.service.impl.DrawMoneyServiceImpl;
import cc.igaa.demo2.service.impl.TransferServiceImpl;

//银行柜员
public class BankStuff {

    private BankProcess bankProcess = new BankProcess();

    //银行系统
    public void handleProcess(BankUser bankUser) {
        switch (bankUser.getType()) {
            case "存款":
                DepositServiceImpl depositService = new DepositServiceImpl();
                bankProcess.setiDepositService(depositService);
                bankProcess.depositFunc();
                break;
            case "取款":
                DrawMoneyServiceImpl drawMoneyService = new DrawMoneyServiceImpl();
                bankProcess.setiDrawMoneyService(drawMoneyService);
                bankProcess.drawMoneyFunc();
                break;
            case "转账":
                TransferServiceImpl transferService = new TransferServiceImpl();
                bankProcess.setiTransferService(transferService);
                bankProcess.transferFunc();
                break;
            default:
                System.out.println("不支持该操作");
                break;
        }
    }
    
}
