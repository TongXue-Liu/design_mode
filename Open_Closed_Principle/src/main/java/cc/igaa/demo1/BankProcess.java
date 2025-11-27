package cc.igaa.demo1;

/**
 * 银行系统
 *  不符合单一职责原则。
 */
public class BankProcess {
    //存款
    public void depositFunc(){
        System.out.println("存款");
    }
    //取款
    public void drawMoneyFunc(){
        System.out.println("取款");
    }
    //转账
    public void transferFunc(){
        System.out.println("转账");
    }
}
