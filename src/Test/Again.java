public class Again {
    public static void main(String[] args) {
        int totalMoney = 100;
        int dogPrice = 2;
        int catPrice = 3;
        int rabbitPrice = 5;
        int count = 0;
        for (int i = 1; i <= totalMoney / rabbitPrice; i++) {
            for (int j = 1; j <= (totalMoney - i * rabbitPrice) / catPrice; j++) {
                int k = totalMoney - i * rabbitPrice - j * catPrice;
                if (k >= 1 && k <= (totalMoney - i * rabbitPrice - j * catPrice) / dogPrice) {
                    count++;
                    System.out.println("方案" + count + "：兔子" + i + "只，猫" + j + "只，狗" + k + "只");
                }
            }
        }
        System.out.println("共有" + count + "种买法。");
    }
}