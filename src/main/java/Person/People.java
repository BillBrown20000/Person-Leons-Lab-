package Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class People implements Iterable{
    List <Person> personList = new ArrayList<>();

        public void add (Person x){
            personList.add(x);
        }
        public Person findById(Long id){
            for (Person person : personList){
                if (person.getId().equals(id));
                    return person;
            }
            return null;
        }
        public Boolean contains(Person x){
            for (Person person : personList){
                if (person.equals(x))
                    return true;
                }
                return false;
            }
            public Integer getIndexOf(Person x){
            for (int y = 0; y < personList.size(); y++){
                if (personList.get(y).equals(x))
                    return y;
            }
            return -1;
            }
        public void remove(Person x){
            if (contains(x))
                personList.remove((int)getIndexOf(x));
        }
        public void remove(Long id){
            Person x = findById(id);
            if (x != null)
                personList.remove((int)getIndexOf(x));
        }
        public void removeAll(){
            personList.clear();
        }
        public Integer count(){
            return personList.size();
        }
        public Person[] toArray(){
            Person[] res = (Person[])personList.toArray();
            return res;
        }
        public Iterator iterator(){
            return personList.iterator();}
        }


