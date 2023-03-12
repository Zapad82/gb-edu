package OOP.Seminars.seminar7.hw_seminar7;

import OOP.Seminars.seminar7.hw_seminar7.communication_methods.ListCommunicationMethod;
import OOP.Seminars.seminar7.hw_seminar7.contractor.Contractor;
import OOP.Seminars.seminar7.hw_seminar7.controller.Controller;
import OOP.Seminars.seminar7.hw_seminar7.list_contractor.ListContractor;

public class Main {
    public static void main(String[] args) {
        // создание способов связаться с контрагентами
        ListCommunicationMethod firstContractor = new ListCommunicationMethod();
        ListCommunicationMethod secondContractor = new ListCommunicationMethod();
        ListCommunicationMethod thirdContractor = new ListCommunicationMethod();
        ListCommunicationMethod fourthContractor = new ListCommunicationMethod();
        // Создание контрагентов
        Contractor first = new Contractor("Семён", 23, firstContractor);
        Contractor second = new Contractor("Алина", 27, secondContractor);
        Contractor third = new Contractor("ООО Балтторг", thirdContractor);
        Contractor fourth = new Contractor("ИП Симонян", fourthContractor);

        // создание списка контрагентов
        ListContractor listContractor = new ListContractor();
        // добавление контрагентов в список контрагентов
        listContractor.addContractorInList(first);
        listContractor.addContractorInList(second);
        listContractor.addContractorInList(third);
        listContractor.addContractorInList(fourth);
        // распечатать список контрагентов
        // listContractor.printListContractor();
        // Добавление способов связи
        firstContractor.addVkMethod("vk/45456");
        firstContractor.addVkMethod("vk/78956");
        firstContractor.addAdressMethod("ул.Ленина, 1");
        firstContractor.addEmailMethod("mail@mail.ru");
        firstContractor.addTelegramMethod("@telegram_nick");
        firstContractor.addPhoneNumberMethod("+79889889898");

        secondContractor.addPhoneNumberMethod("+79552232232");
        secondContractor.addVkMethod("vk/363636");
        secondContractor.addAdressMethod("ул.Бебеля, 1");

        thirdContractor.addPhoneNumberMethod("3636366");
        thirdContractor.addPhoneNumberMethod("2525255");
        thirdContractor.addPhoneNumberMethod("7778778");
        thirdContractor.addTelegramMethod("@balttorg");
        thirdContractor.addEmailMethod("balttorg@mail.ru");

        fourthContractor.addVkMethod("vk/456456");
        fourthContractor.addAdressMethod("ул.Генделя, 1");
        fourthContractor.addPhoneNumberMethod("9696996");
        fourthContractor.addPhoneNumberMethod("6969669");
        fourthContractor.addTelegramMethod("@fourth");
        fourthContractor.addEmailMethod("fourth@mail.ru");
        // контроллер списка контрагентв
        Controller controlListContractor = new Controller(listContractor);
        // распечатпть список контрагентов
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Всего контрагентов в базе:");
        controlListContractor.printListContractor();
        System.out.println("++++++++++++++++++++++++++");

        // поиск конрагентов по имени
        System.out.println("Поиск контрагента ООО Балтторг");
        controlListContractor.serchContractor("ООО Балтторг");
        System.out.println("++++++++++++++++++++++++++");

        System.out.println("Поиск контрагента Алина");
        controlListContractor.serchContractor("Алина");
        // добавить способ связи с контрагентом
        System.out.println("++++++++++++++++++++++++++");

        System.out.printf("Добавлен новый способ связи %s", third);
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++");

        controlListContractor.addNewCommunicationMethodPhoneNumber(third, "478787");
        // удалить способ связи с контрагентом
        System.out.printf("Удален один номер телефона:", third);
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++");
        controlListContractor.delCommunicationMethodPhoneNumber(third, 0);
        // добавить в список нового контрагента
        // controlListContractor.addNewContractor(listContractor, newName);
        System.out.println("Измененные данные контрагента для сравнения:");
        controlListContractor.serchContractor("ООО Балтторг");
        System.out.println("++++++++++++++++++++++++++");
    }
}