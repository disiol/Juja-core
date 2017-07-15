package ua.com.juja.core.LAB19.Exchange;

/**
 * Created by Denis Oleynyk on 11.07.17.
 * mail: deoniisii@gmail.com
 * <p>
 * Номинал мелких монет - 1,2,5,10,25,50.
 * 1 копейку можно разменять 1 разным способом - {1}
 * 2 - двумя разными способами {1 + 1; 2}
 * 5 - 4 {1 + 1 + 1 + 1 + 1; 1 + 1 + 1 + 2; 1 + 2 + 2; 5}
 * ........
 * Сколькими разными способами можно разменятьгривну (100 монет) ?
 * <p>
 * Реализовать алгоритм подсчета колличества разных разменов для входящего параметра.
 */
public class ExchangeMoney {


    public static final int[] COINS_А_FOR_EXCHANGE = new int[]{1, 2, 5, 10, 25, 50};

    public static void main(String[] args) {
        System.out.println(exchangeAmountOfCoinsBrutForce(5));
        System.out.println(exchangeAmountOfCoinsBrutForce(10));
        System.out.println(exchangeAmountOfCoinsBrutForce(100));
    }

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        if (amountForExchange <= 0) {
            return 0;
        }
        int exchangeСounter = 0, stak = 0;
        int count = 0;

        for (int i50 = 0; i50 <= amountForExchange / 50; i50++) {
            for (int i25 = 0; i25 <= amountForExchange / 25; i25++) {
                for (int i10 = 0; i10 <= amountForExchange / 10; i10++) {
                    for (int i5 = 0; i5 <= amountForExchange / 5; i5++) {
                        for (int i2 = 0; i2 <= amountForExchange / 2; i2++) {
                            for (int i1 = 0; i1 <= amountForExchange; i1++) {
                                stak = (i50 * 50 + i25 * 25 + i10 * 10 + i5 * 5 + i2 * 2 + i1);
                                if (stak == amountForExchange) {
                                    exchangeСounter++;
                                }
                                count++;

                            }

                        }

                    }

                }
            }
        }

        System.out.println("Всего итераций:" + count);
        System.out.println("из них поезніх итераций:" + exchangeСounter);
        return exchangeСounter;
    }
}