package OOP.Seminars.seminar7.hw_seminar7.controller;

import OOP.Seminars.seminar7.hw_seminar7.communication_methods.ListCommunicationMethod;
import OOP.Seminars.seminar7.hw_seminar7.contractor.Contractor;
import OOP.Seminars.seminar7.hw_seminar7.list_contractor.ListContractor;

public class Controller extends AbstractController {

    ListCommunicationMethod listCommunicationMethod;
    Contractor Contractor;
    ListContractor listContractor;

    public Controller(ListContractor listContractor) {
        this.listContractor = listContractor;
        this.listCommunicationMethod = new ListCommunicationMethod();
    }

    // добавить метод связи
    public void addNewCommunicationMethodVk(Contractor Contractor, String vk) {
        Contractor.getListCommunicationMethod().addVkMethod(vk);
    }

    public void addNewCommunicationMethodTelegram(Contractor Contractor, String telegtam) {
        Contractor.getListCommunicationMethod().addTelegramMethod(telegtam);
    }

    public void addNewCommunicationMethodEmail(Contractor Contractor, String email) {
        Contractor.getListCommunicationMethod().addEmailMethod(email);
    }

    public void addNewCommunicationMethodPhoneNumber(Contractor Contractor, String number) {
        Contractor.getListCommunicationMethod().addPhoneNumberMethod(number);
    }

    public void addNewCommunicationMethodAdress(Contractor Contractor, String adress) {
        Contractor.getListCommunicationMethod().addAdressMethod(adress);
    }

    // удалить метод связи
    public void delCommunicationMethodVk(Contractor Contractor, int index) {
        Contractor.getListCommunicationMethod().deleteVkMethod(index);
    }

    public void delCommunicationMethodTelegram(Contractor Contractor, int index) {
        Contractor.getListCommunicationMethod().deleteTelegramMethod(index);
    }

    public void delCommunicationMethodEmail(Contractor Contractor, int index) {
        Contractor.getListCommunicationMethod().deleteEmailMethod(index);
    }

    public void delCommunicationMethodPhoneNumber(Contractor Contractor, int index) {
        Contractor.getListCommunicationMethod().deletePhoneNumberMethod(index);
    }

    public void delCommunicationMethodAdress(Contractor Contractor, int index) {
        Contractor.getListCommunicationMethod().deleteAdressMethod(index);
    }

    // удалить контрагента
    public void deleteContractor(Contractor Contractor, ListContractor listContractor) {
        listContractor.deleteContractor(Contractor);
    }

    // распечатать список контр агентов
    public void printListContractor() {
        listContractor.printlistContractors();
    }

    // поиск по имени контрагента
    public void serchContractor(String name) {
        for (Contractor Contractor : listContractor.getlistContractors()) {
            if (Contractor.getName() == name) {
                System.out.print(Contractor.getName());
                Contractor.getListCommunicationMethod().printListCommunicationMethod();
            }
            if (Contractor.getNameCompany() == name) {
                System.out.print(Contractor.getNameCompany());
                Contractor.getListCommunicationMethod().printListCommunicationMethod();
            }
        }
        System.out.println();
    }

    // создать нового контрагента
    public void addNewContractor(ListContractor listContractor, Contractor Contractor) {
        listContractor.addContractorInList(Contractor);
    }
}
