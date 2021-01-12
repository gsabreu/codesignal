package challenges;

public class AdjacentElementsProduct {
    int adjacentElementsProduct(int[] inputArray) {
        int last = inputArray.length - 1;
        int product = -1000;
        
        for(int actual = 0; actual < last; actual++){
            int total = inputArray[actual] * inputArray[actual+1];
            if(product < total){
                product = total;
            }
        }
        return product;
    }
}
