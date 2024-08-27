package org.example.sort;

import java.util.Arrays;
import java.util.List;

/*
   Pyotr Vasilyevich Koloshin was never a timid person and was always known for his calmness and
foresight, especially in the realm of global political and economic processes.

   However, despite this, Pyotr Vasilyevich severely underestimated the consequences of the global financial crisis, and as a result,
he was dismissed a couple of weeks ago from his position as a network administrator at a large and serious organization.

   Despite this, Pyotr Vasilyevich did not lose hope and decided to start his own business. After carefully analyzing the business climate in his
region, Pyotr Vasilyevich concluded that the most reasonable course of action would be to open a new taxi fleet.
The first step the newly-minted entrepreneur decided to take was to purchase vehicles. Over the years of his work,
Pyotr Vasilyevich managed to save an amount of money, S, which he is ready to spend on buying cars.

In the city where Pyotr Vasilyevich lives, there is only one car dealership. It is known that this dealership has N cars
available for sale, and the price of the i-th car is Ai. Your task is to help the inexperienced businessman Pyotr Vasilyevich purchase the maximum
number of cars without spending more than the amount S.
 */
public class MaxCarNumberBuy {
    public static void main(String[] args) {
        List<Integer> carsPrices = Arrays.asList(250, 300, 1000, 150, 63, 30);
        int moneyOfVasilii = 1300;
        int carsToBuy = calculateHowMuchCarsMaximCanBuy(carsPrices, moneyOfVasilii);
        System.out.println("Vasilii can buy " + carsToBuy + " cars");
    }

    private static void sortCarPrices(List<Integer> carsPrices) {
        for (int i = 0; i < carsPrices.size(); i++) {
            for (int j = 0; j < carsPrices.size() - i - 1; j++) {
                int temp = carsPrices.get(j + 1);
                if (carsPrices.get(j) > carsPrices.get(j + 1)) {
                    carsPrices.set(j + 1, carsPrices.get(j));
                    carsPrices.set(j, temp);
                }
            }
        }
    }

    private static int calculateHowMuchCarsMaximCanBuy(List<Integer> carPrices, int moneyOfVasilii) {
        sortCarPrices(carPrices);
        int moneyToSpend = 0;
        int carsToBuy = 0;
        for (int i = 0; i < carPrices.size(); i++) {
            if (moneyToSpend <= moneyOfVasilii) {
                moneyToSpend = moneyToSpend + carPrices.get(i);
                carsToBuy = i;
            } else {
                return carsToBuy;
            }
        }
        return carsToBuy;
    }
}
