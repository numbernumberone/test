package com.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wr on 2018/10/9.
 */
public class BeerExpert {

        public List getbrands (String color){
            List brands = new ArrayList();
            if(color.equals("amber")){
                brands.add("jack amber");
                brands.add("red moose");

            }
            else{
                brands.add("jail pale ale");
                brands.add("gout stout");
            }
        return (brands);
        }
}

