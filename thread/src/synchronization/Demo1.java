package synchronization;

/**
 * synchronized 关键字，使线程同步
 *
 * @author lming.41032@gmail.com
 * @date 18-6-8 下午3:46
 */
public class Demo1 {

    private Double moneyAll = 1000.00;

    public synchronized void drawMoney(Double money) {
        System.out.println(Thread.currentThread().getName() + " 正在取" + money + "元");
        try {
            moneyAll -= money;
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("还剩余:" + moneyAll + "元");
    }


    public static void main(String[] args) {
        Demo1 bank = new Demo1();

        DrawMoneyTask js = new DrawMoneyTask(bank, 50.00);
        js.setName("js");
        js.start();

        DrawMoneyTask ydg = new DrawMoneyTask(bank, 100.00);
        ydg.setName("ydg");
        ydg.start();

        DrawMoneyTask lm = new DrawMoneyTask(bank, 150.00);
        lm.setName("lm");
        lm.start();

        DrawMoneyTask hjl = new DrawMoneyTask(bank, 200.00);
        hjl.setName("hjl");
        hjl.start();
    }

}


class DrawMoneyTask extends Thread {

    private Demo1 bank;
    private Double money;

    public DrawMoneyTask(Demo1 bank, Double money) {
        this.bank = bank;
        this.money = money;
    }

    @Override
    public void run() {
        bank.drawMoney(money);
    }
}