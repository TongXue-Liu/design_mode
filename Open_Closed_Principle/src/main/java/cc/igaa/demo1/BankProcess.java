package cc.igaa.demo1;

/**
 * 银行系统
 *  不符合单一职责原则。
 */
public class BankProcess {
    //存款
    public void deposit(){
        System.out.println("存款");
    }
    //取款
    public void drawMoney(){
        System.out.println("取款");
    }
    //转账
    public void transfer(){
        System.out.println("转账");
    }
}
