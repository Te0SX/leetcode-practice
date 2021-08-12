// 0121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
		int min = prices[0], maxSoFar = 0;

		for(int price : prices) {
			if(price < min) {
				min = price;
			} else if (maxSoFar < price - min) {
				maxSoFar = price - min;
			}
        }
        return maxSoFar;
    }
}

// Works but super slow and a lot of memory
// class Solution {
//     public int maxProfit(int[] prices) {
// 		int minEndHere = prices[0], maxSellPrice = 0, maxProfit = 0, newProfit =0;

// 		for(int price : prices) {
// 			if(price < minEndHere) {
// 				minEndHere = price;
// 				maxSellPrice = 0;
// 			} else {
// 				maxSellPrice = (price > maxSellPrice) ? price : maxSellPrice;
// 				newProfit = (maxSellPrice - minEndHere);
// 				maxProfit = (maxProfit > newProfit) ? maxProfit : newProfit;
// 			}

//         }
//         return maxProfit;
//     }
// }