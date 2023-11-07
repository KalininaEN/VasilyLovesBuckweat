public class Buckweat {
    public static void main(String[] args) {
        System.out.println("countCostForStorage(17) = " + countCostForStorage(17));
    }

    public static int countCostForStorage(int months) {

        int countBuckweatKg = 0;
        int totalCostForStorage = 0;
        int costPer1Kg = 100;
        int consumptionPerMonth = 6;

        for (int i = months; i >= 1; i--) {
            countBuckweatKg = countBuckweatKg + consumptionPerMonth;
            totalCostForStorage = (countBuckweatKg * costPer1Kg) + totalCostForStorage;
        }
        return totalCostForStorage;
    }
}




