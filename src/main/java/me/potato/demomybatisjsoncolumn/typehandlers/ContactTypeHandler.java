package me.potato.demomybatisjsoncolumn.typehandlers;

import me.potato.demomybatisjsoncolumn.entities.Contact;


public class ContactTypeHandler extends JsonTypeHandler<Contact> {
    public ContactTypeHandler(Class<Contact> type) {
        super(type);
    }

    public ContactTypeHandler() {
        super(Contact.class);
    }
}
