package br.com.wl.docker.controller;

import br.com.wl.docker.model.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.rmi.CORBA.Util;

/**
 * Document PeopleController
 *
 * @author Wellington Lins Claudino Duarte
 * @mail wellingtonlins2013@gmail.com
 */
public class PeopleController {


    public Iterable listPeople() {
        
        return Arrays.asList(new Person(String.valueOf(UUID.randomUUID()), "Kiko"),
                new Person(String.valueOf(UUID.randomUUID()), "Chaves"),
                new Person(String.valueOf(UUID.randomUUID()), "Chiquinha"),
                new Person(String.valueOf(UUID.randomUUID()), "Ionhonho"));
        
    }
    
    
//    private List<Person>  list = new ArrayList();
//
//    public List<Person> listPeople() {
//        list.add(new Person(String.valueOf(UUID.randomUUID()), "Kiko"));
//        list.add(new Person(String.valueOf(UUID.randomUUID()), "Chaves"));
//        list.add(new Person(String.valueOf(UUID.randomUUID()), "Chiquinha"));
//        list.add(new Person(String.valueOf(UUID.randomUUID()), "Ionhonho"));
//
//        return list;
//
//    }


}
