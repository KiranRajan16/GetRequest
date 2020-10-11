package com.cerner.sample.getmethod;


import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class GetMethodController {
    public class Details{
        private int personid;
        private String personname;
        private char personsex;
        private float personheight;
        private float personweight;

        public int getPersonid(){
            return personid;
        }
        public String getPersonname(){
            return personname;
        }
        public char getPersonsex(){
            return personsex;
        }
        public float getPersonheight(){
            return personheight;
        }
        public float getPersonweight(){
            return personweight;
        }
        public void setPersonid(int personid){
            this.personid = personid;
        }
        public void setPersonname(String  personname){
            this.personname = personname;
        }
        public void setPersonsex(char personsex){
            this.personsex = personsex;
        }
        public void setPersonheight(float personheight){
            this.personheight = personheight;
        }
        public void setPersonweight(float personweight){
            this.personweight = personweight;
        }
    }
    @GetMapping("/person")
    public List <Details> getpersonid(){
        Details obj1 = new Details();
        Details obj2 = new Details();
        Details obj3 = new Details();
        Details obj4 = new Details();

        obj1.setPersonid(1);
        obj1.setPersonname("Kiran");
        obj1.setPersonsex('M');
        obj1.setPersonheight((float) 5.6);
        obj1.setPersonweight((float) 80.5);

        obj2.setPersonid(2);
        obj2.setPersonname("Mahi");
        obj2.setPersonsex('F');
        obj2.setPersonheight((float) 5.2);
        obj2.setPersonweight((float) 55.5);

        obj1.setPersonid(3);
        obj1.setPersonname("Rajesh");
        obj1.setPersonsex('M');
        obj1.setPersonheight((float) 5.5);
        obj1.setPersonweight((float) 66.5);

        obj1.setPersonid(4);
        obj1.setPersonname("Vandana");
        obj1.setPersonsex('F');
        obj1.setPersonheight((float) 5.1);
        obj1.setPersonweight((float) 70);

        return Arrays.asList(obj1,obj2,obj3,obj4);
    }
}
