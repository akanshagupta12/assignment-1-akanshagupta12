package nod;

import person.Person;

public class Node {
    public Node next;
    public Person data;
    public Node(Person data){
        this.data=data;
        next=null;
    }
}