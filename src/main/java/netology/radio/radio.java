package netology.radio;

public class radio {
        /**
         * Calculate index of max income
         *
         * @param  - array of incomes
         * @return
         */
        public long findMax(long[] incomes){
            long currentVolume = 0;
            long current_max = incomes[0];
            for (long income : incomes)
                if (currentVolume < 10) {
                    currentVolume = currentVolume + 1;
                    return currentVolume;
                }
            return currentVolume;
        }
}
