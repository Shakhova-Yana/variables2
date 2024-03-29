public class Main {
    public static void main(String[] args) {
        byte appleInBasket = 36;
        short thousandths = 19900;
        int million = 800000000;
        long quintillion = 9000000009999999999L;
        float justPoint = 4.678699f;
        double bigPoint = 78567.4353564576;
        System.out.println("Значение переменной яболок в коробке с типом byte равно " + appleInBasket);
        System.out.println("Значение переменной тысячных долей с типом short равно " + thousandths);
        System.out.println("Значение переменной милиона с типом int равно " + million);
        System.out.println("Значение переменной квинтиллион с типом long равно " + quintillion);
        System.out.println("Значение переменной просто точка с типом float равно " + justPoint);
        System.out.println("Значение переменной большая точка с типом double равно " + bigPoint);

        float a = 27.12F;
        long p = 987678965549L;
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

        byte studentsOfLyudmilaPavlovna = 23;
        byte studentsOfAnnaSergeevna = 27;
        byte studentsOfEkaterinaAndreevna = 30;
        short totalSheets = 480;
        int totalNumberOfStudents = studentsOfLyudmilaPavlovna + studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna;
        int sheetsForEachStudent = totalSheets / totalNumberOfStudents;
        System.out.println("На каждого ученика рассчитано "+sheetsForEachStudent+" листов бумаги" );

        byte bottlesInTwoMinutes = 16;
        int bottlesInOneMinutes = bottlesInTwoMinutes/2;
        int bottlesInTwtntyMinutes = bottlesInOneMinutes * 20;
        System.out.println("За 20 минут машина произвела "+bottlesInTwtntyMinutes+" штук бутылок");
        short minutesInDay = 1440;
        int bottlesInOneDay = bottlesInOneMinutes * minutesInDay;
        System.out.println("За сутки машина произвела "+bottlesInOneDay+" штук бутылок");
        int threeDaysInMinutes = minutesInDay * 3;
        int bottlesInthreeDays = bottlesInOneMinutes * threeDaysInMinutes;
        System.out.println("За трое суток машина произвела "+bottlesInthreeDays+" штук бутылок");
        byte monthInDays = 31;
        int monthInMinutes = minutesInDay * monthInDays;
        int bottlesPerMonth = bottlesInOneMinutes * monthInMinutes;
        System.out.println("За месяц машина произвела "+bottlesPerMonth+" штук бутылок");
    }
}