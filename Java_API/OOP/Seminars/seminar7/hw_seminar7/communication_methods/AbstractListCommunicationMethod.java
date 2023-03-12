package OOP.Seminars.seminar7.hw_seminar7.communication_methods;

import OOP.Seminars.seminar7.hw_seminar7.communication_methods.interfaces.InterfaceAdress;
import OOP.Seminars.seminar7.hw_seminar7.communication_methods.interfaces.InterfaceEmail;
import OOP.Seminars.seminar7.hw_seminar7.communication_methods.interfaces.InterfacePhoneNumber;
import OOP.Seminars.seminar7.hw_seminar7.communication_methods.interfaces.InterfaceTelegram;
import OOP.Seminars.seminar7.hw_seminar7.communication_methods.interfaces.InterfaceVk;

public class AbstractListCommunicationMethod implements InterfaceVk, InterfaceTelegram, InterfaceEmail,
        InterfacePhoneNumber, InterfaceAdress {

    @Override
    public void vkMethod() {
    }

    @Override
    public void telegramMethod() {
    }

    @Override
    public void emailMethod() {
    }

    @Override
    public void phoneNumberMethod() {
    }

    @Override
    public void adressMethod() {
    }
}
