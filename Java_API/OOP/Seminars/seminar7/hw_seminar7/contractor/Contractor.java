package OOP.Seminars.seminar7.hw_seminar7.contractor;

import OOP.Seminars.seminar7.hw_seminar7.communication_methods.ListCommunicationMethod;

public class Contractor extends AbstractContractor {
    private ListCommunicationMethod listCommunicationMethod;

    public Contractor(String name, int age, ListCommunicationMethod listCommunicationMethod) {
        super.name = name;
        super.age = age;
        this.listCommunicationMethod = listCommunicationMethod;
    }

    public Contractor(String nameCompany, ListCommunicationMethod listCommunicationMethod) {
        super.nameCompany = nameCompany;
        this.listCommunicationMethod = listCommunicationMethod;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public ListCommunicationMethod getListCommunicationMethod() {
        return listCommunicationMethod;
    }

    @Override
    public String toString() {
        if (age != 0) {
            return "Контрагент [ " + name + ", " + age + " ]";
        } else {
            return "Контрагент [ " + nameCompany + " ]";
        }
    }
}
