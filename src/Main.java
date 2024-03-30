public class Main {
    public static void main(String[] args) {
        System.out.println("\ntask 1");
        byte appleInBasket = 36;
        short thousandths = 19900;
        int million = 800_000_000;
        long quintillion = 9_000_000_009_999_999_999L;
        float justPoint = 4.678699f;
        double bigPoint = 78567.4353564576;
        System.out.println("Значение переменной яболок в коробке с типом byte равно " + appleInBasket);
        System.out.println("Значение переменной тысячных долей с типом short равно " + thousandths);
        System.out.println("Значение переменной милиона с типом int равно " + million);
        System.out.println("Значение переменной квинтиллион с типом long равно " + quintillion);
        System.out.println("Значение переменной просто точка с типом float равно " + justPoint);
        System.out.println("Значение переменной большая точка с типом double равно " + bigPoint);

        System.out.println("\ntask 2");
        float a = 27.12F;
        long p = 987_678_965_549L;
        float l = 2.786F;
        short e = 569;
        short n = -159;
        short t = 27897;
        byte y = 67;
        System.out.println("Тип float = "+a);
        System.out.println("Тип long = "+p);
        System.out.println("Тип float = "+l);
        System.out.println("Тип short = "+e);
        System.out.println("Тип short = "+n);
        System.out.println("Тип short = "+t);
        System.out.println("Тип  byte = "+y);

        System.out.println("\ntask 3");
        byte studentsOfLyudmilaPavlovna = 23;
        byte studentsOfAnnaSergeevna = 27;
        byte studentsOfEkaterinaAndreevna = 30;
        short totalSheets = 480;
        int totalNumberOfStudents = studentsOfLyudmilaPavlovna + studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna;
        int sheetsForEachStudent = totalSheets / totalNumberOfStudents;
        System.out.println("На каждого ученика рассчитано "+ sheetsForEachStudent +" листов бумаги" );

        System.out.println("\ntask 4");
        byte bottlesInTwoMinutes = 16;
        int bottlesInOneMinutes = bottlesInTwoMinutes/2;
        int bottlesInTwtntyMinutes = bottlesInOneMinutes * 20;
        System.out.println("За 20 минут машина произвела "+ bottlesInTwtntyMinutes +" штук бутылок");
        short minutesInDay = 60 * 24;
        int bottlesInOneDay = bottlesInOneMinutes * minutesInDay;
        System.out.println("За сутки машина произвела "+ bottlesInOneDay +" штук бутылок");
        int threeDaysInMinutes = minutesInDay * 3;
        int bottlesInthreeDays = bottlesInOneMinutes * threeDaysInMinutes;
        System.out.println("За трое суток машина произвела "+ bottlesInthreeDays +" штук бутылок");
        byte monthInDays = 31;
        int monthInMinutes = minutesInDay * monthInDays;
        int bottlesPerMonth = bottlesInOneMinutes * monthInMinutes;
        System.out.println("За месяц машина произвела "+ bottlesPerMonth +" штук бутылок");

        System.out.println("\ntask 5");
        byte totalCansOfPaintForRenovation = 120;
        byte numberOfCansOfWhitePaintPerClass = 2;
        byte numberOfCansOfBrownPaintPerClass = 4;
        int classesSchool = totalCansOfPaintForRenovation / (numberOfCansOfBrownPaintPerClass + numberOfCansOfWhitePaintPerClass);
        int totalPurchasedWhiteCansOfPaint = numberOfCansOfWhitePaintPerClass * classesSchool;
        int totalPurchasedBrownCansOfPaint = numberOfCansOfBrownPaintPerClass * classesSchool;
        System.out.printf("В школе, где %s классов, нужно %s банок белой краски и %s банок коричневой краски\n"
                ,classesSchool, totalPurchasedWhiteCansOfPaint,totalPurchasedBrownCansOfPaint);

        System.out.println("\ntask 6");
        byte oneBananaInGrams = 80;
        byte oneHundredMillilitersOfMilkInGrams = 105;
        byte oneBracketOfIceCreamInGrams = 100;
        int oneEggInGrams = 70;
        int fiveBananaInGrams = oneBananaInGrams * 5;
        int twoHundredMillilitersOfMilkInGrams = oneHundredMillilitersOfMilkInGrams * 2;
        int twoBracketOfIceCreamInGrams = oneBracketOfIceCreamInGrams * 2;
        int fourEggInGrams = oneEggInGrams * 4;
        int breakfastInGrams = fiveBananaInGrams + twoHundredMillilitersOfMilkInGrams + twoBracketOfIceCreamInGrams
                + fourEggInGrams;
        int oneKilogramsInGrams = 1000;
        float breakfastInKilograms = (float) breakfastInGrams / oneKilogramsInGrams;
        System.out.printf("Завтрак в граммах %s, завтрак в кг %s\n", breakfastInGrams, breakfastInKilograms);

        System.out.println("\ntask 7");
        int sevenKgInGrams = oneKilogramsInGrams * 7;
        int dietMinus250GramsPerDay = 250;
        int dietMinus500GramsPerDay = 500;
        int resultOfWeightLossInDaysOf250Grams = sevenKgInGrams / dietMinus250GramsPerDay;
        int resultOfWeightLossInDaysOf500Grams = sevenKgInGrams / dietMinus500GramsPerDay;
        System.out.printf("%s дней уйдет на похудение,если спортсмен будет терять весс каждый день по 250 грамм," +
                "\n%s дней уйдет на похудение,если спортсмен будет терять весс каждый день по 500 грамм."
                ,resultOfWeightLossInDaysOf250Grams, resultOfWeightLossInDaysOf500Grams);

    }
}