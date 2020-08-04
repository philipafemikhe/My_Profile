package net.philip.service;

import net.philip.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {
    public List<Contact> getContactLst(){
        List<Contact> listContact = new ArrayList<>();
        listContact.add(new Contact("Mary John", "maryjohn@gmail.com", "Nigeria"));
        listContact.add(new Contact("Adamu Sani", "adamu@gmail.com", "Afganistan"));
        listContact.add(new Contact("Daniel Oke", "daniel@gmail.com", "Ghana"));
        return listContact;
    }
}
