package OOP.Seminars.seminar7.hw_seminar7.communication_methods;

import java.util.ArrayList;
import java.util.List;

import OOP.Seminars.seminar7.hw_seminar7.contractor.Contractor;

public class ListCommunicationMethod extends AbstractListCommunicationMethod {
    Contractor contrAgent;
    private List<String> vk = new ArrayList<>();
    private List<String> telegram = new ArrayList<>();
    private List<String> email = new ArrayList<>();
    private List<String> phoneNumber = new ArrayList<>();
    private List<String> adress = new ArrayList<>();

    public ListCommunicationMethod() {
    }

    public List<String> getVk() {
        return vk;
    }

    public List<String> getTelegram() {
        return telegram;
    }

    public List<String> getEmail() {
        return email;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public List<String> getAdress() {
        return adress;
    }

    public void addVkMethod(String vkId) {
        vk.add(vkId);
    }

    public void addTelegramMethod(String TelegramName) {
        telegram.add(TelegramName);
    }

    public void addEmailMethod(String emailAdres) {
        email.add(emailAdres);
    }

    public void addPhoneNumberMethod(String phoneNum) {
        phoneNumber.add(phoneNum);
    }

    public void addAdressMethod(String adressLocation) {
        adress.add(adressLocation);
    }

    public void deleteVkMethod(int vkIndex) {
        vk.remove(vkIndex);
    }

    public void deleteTelegramMethod(int TelegramIndex) {
        telegram.remove(TelegramIndex);
    }

    public void deleteEmailMethod(int emailIndex) {
        email.remove(emailIndex);
    }

    public void deletePhoneNumberMethod(int phoneNumberIndex) {
        phoneNumber.remove(phoneNumberIndex);
    }

    public void deleteAdressMethod(int adressIndex) {
        adress.remove(adressIndex);
    }

    public void printListCommunicationMethod() {
        if (vk.size() > 0) {
            System.out.println();
            System.out.print("vk - ");
            for (String string : vk) {
                System.out.print(string + ",  ");
            }
        }
        if (telegram.size() > 0) {
            System.out.println();
            System.out.print("telegram - ");
            for (String string : telegram) {
                System.out.print(string + ",  ");
            }
        }
        if (email.size() > 0) {
            System.out.println();
            System.out.print("email - ");
            for (String string : email) {
                System.out.print(string + ",  ");
            }
        }
        if (phoneNumber.size() > 0) {
            System.out.println();
            System.out.print("PhoneNumber - ");
            for (String string : phoneNumber) {
                System.out.print(string + ",  ");
            }
        }
        if (adress.size() > 0) {
            System.out.println();
            System.out.print("adress - ");
            for (String string : adress) {
                System.out.print(string + ", ");
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ListCommunicationMethod";
    }
}
