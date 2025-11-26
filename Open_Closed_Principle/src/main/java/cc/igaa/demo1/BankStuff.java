package cc.igaa.demo1;


//银行柜员
public class BankStuff {
    private BankProcess bankProcess = new BankProcess();
    //银行系统
    public void handleProcess(BankUser bankUser) {
        switch (bankUser.getType()) {
            case "存款":
                bankProcess.deposit();
                break;
            case "取款":
                bankProcess.drawMoney();
                break;
            case "转账":
                bankProcess.transfer();
                break;
            default:
                System.out.println("不支持该操作");
                break;
        }
    }
    
}
