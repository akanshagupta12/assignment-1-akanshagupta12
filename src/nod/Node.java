package nod;

import person.Person;

public class Node {
    Person data;
    Node next;
    Node(Person data){
        this.data=data;
        next=null;
    }
}