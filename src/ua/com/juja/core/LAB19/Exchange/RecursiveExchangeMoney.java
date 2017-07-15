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
public class RecursiveExchangeMoney {


    final static int[] exchangeMonets = {1, 2, 5, 10, 25, 50};

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        int exchangeСounter = 0;
        int leght = exchangeMonets.length;

        for (int i = 0; i < leght; i++) {
            if (amountForExchange / exchangeMonets[i] == 0) {
                exchangeСounter++;
                symResult(exchangeMonets[i], exchangeMonets[i + 1], amountForExchange, leght, exchangeMonets);
            }

        }

        return amountForExchange;

    }

    private static int symResult(int exchangeMonet, int exchangeMonet1, int amountForExchange, int leght, int[] exchangeMonets) {
        int sum = 0;
        while (sum < exchangeMonet) {
            if (exchangeMonet1 + 1 <= leght) {
                sum = exchangeMonet + exchangeMonets[exchangeMonet1 + 1];
            }

        }

        if (sum / exchangeMonet == 0) {
            amountForExchange++;
        }
        return amountForExchange;
    }

}